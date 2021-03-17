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
@WebServlet("/ShowDetails")
public class ShowDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DateSetting dase = new DateSetting();
		DateSetting ds = dase.checkD("eventdate");
		AdminDAO dao = new AdminDAO();
		ArrayList<String> eveList=null,gueList=null;
		try {
			eveList = dao.showEvent();
			gueList = dao.showGuest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    request.setAttribute("date", ds.date);
	    request.setAttribute("diff", ds.diff);
	    request.setAttribute("eList", eveList);
	    request.setAttribute("gList", gueList);
	    RequestDispatcher rd = request.getRequestDispatcher("ShowDet.jsp");
	    rd.forward(request, response);
	    
	    
	}

}
