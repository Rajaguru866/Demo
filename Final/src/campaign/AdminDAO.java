package campaign;

import java.util.*;
import java.sql.*;

public class AdminDAO {
	String query;
	int i;
	private String url = "jdbc:mysql://localhost:3306/campaign?" + "autoReconnect=true&useSSL=false";
	private String uname = "root";
	private String pass = "mysql";
	Connection con = null;

	void connect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
	}

	public void addEventDAO(List<String> eventList) throws Exception {
		
		query = "insert into event value (?)";
		connect();
		PreparedStatement st = con.prepareStatement(query);
		for(String eve : eventList)
		{
		    st.setString(1, eve);
		    st.executeUpdate();
		}
	    st.close();
		con.close();
	}

	public ArrayList<String> showEvent() throws Exception {
		connect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from event");
		ArrayList<String> eveList = new ArrayList<>();
		while (rs.next()) {
			eveList.add(rs.getString(1));
		}
		st.close();
		con.close();
		return eveList;
	}
	
    public void addGuestDAO(List<String> guestList) throws Exception {
		
		query = "insert into guest value (?)";
		connect();
		PreparedStatement st = con.prepareStatement(query);
		System.out.println("DAO");
		for(String gst : guestList)
		{
		    st.setString(1,gst);
		    st.executeUpdate();
		}
	    st.close();
		con.close();
    }
    
    public ArrayList<String> showGuest() throws Exception {

		connect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from guest");
	//	rs.first();
		ArrayList<String> gueList = new ArrayList<>();
		while (rs.next()) {
			gueList.add(rs.getString(1));			
		}
		st.close();
		con.close();
		return gueList;
	}
    
    public void addparticipant(Participant par) throws Exception {
    	
    	query = "insert into participant values (?,?,?,?)";
    	connect();
    	PreparedStatement st = con.prepareStatement(query);
    	st.setString(1, par.name);
    	st.setString(2, par.degree);
    	st.setString(3, par.address);
    	st.setLong(4, par.mobno);
    	st.executeUpdate();
    	st.close();
    	con.close();
    	
    }

    public ArrayList<Participant> showParticipant() throws Exception {
    	
    	connect();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from participant");
    	i = 1;
    //	rs.first();
    	ArrayList<Participant> parList = new ArrayList<>();
    	while(rs.next())
    	{
    		Participant pt = new Participant();
    		pt.name = rs.getString(1);
    		pt.degree = rs.getString(2);
    		pt.address = rs.getString(3);
    		pt.mobno = rs.getLong(4);
    		parList.add(pt);
    	}
    	st.close();
    	con.close();
    	return parList;
    	
    }
    
   public void addDonationDAO(Donation don) throws Exception {
    	
    	query = "insert into donation values (?,?,?,?,?)";
    	connect();
    	PreparedStatement st = con.prepareStatement(query);
    	st.setString(1, don.name);
    	st.setString(2, don.mailid);
    	st.setLong(3, don.mobno);
    	st.setInt(4, don.amount);
    	st.setString(5, don.date);
    	st.executeUpdate();
    	st.close();
    	con.close();
    	
    }

    public ArrayList<Donation> showDonation() throws Exception {
    	
    	connect();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from donation");
    	ArrayList<Donation> donList = new ArrayList<>();
    //	rs.first();
    	while(rs.next())
    	{
    		Donation don = new Donation();
    		don.name = rs.getString(1);
    		don.mailid = rs.getString(2);
    		don.mobno = rs.getLong(3);
    		don.amount = rs.getInt(4);
    		don.date = rs.getString(5);
    		donList.add(don);
    	}
    	st.close();
    	con.close();
    	return donList;
    	
    }
    
    public void addDate(String date,String tabl) throws Exception {
    	
    	query = "insert into " + tabl + " value (?) ";
    	connect();
    	PreparedStatement st = con.prepareStatement(query);
    	st.setString(1, date);
    	st.executeUpdate();
    	st.close();
    	con.close();
    }
    
    public String showDate(String tabl) throws Exception {
    	
    	connect();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("Select * from " + tabl);
    	while(rs.next())
    	{
    		if(rs.isLast())
    		{
    			break;
    		}
    	}
    	String date = rs.getString(1);
    	System.out.println(date);
    	return date;
    }
    
    
}
