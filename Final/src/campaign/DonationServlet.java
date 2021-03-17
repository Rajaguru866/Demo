package campaign;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/DonationServlet")
public class DonationServlet extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		int total = 0;
		AdminDAO dao = new AdminDAO();
		ArrayList<Donation> donList = null;
		try {
		    donList = dao.showDonation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Donation i:donList)
		{
			total = total + i.amount;
		}
		request.setAttribute("donList", donList);
		request.setAttribute("total", total);
		RequestDispatcher rd = request.getRequestDispatcher("ShowDonation.jsp");
		rd.forward(request, response);
		
	}

}
