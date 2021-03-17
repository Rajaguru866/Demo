package campaign;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/DonationChkServlet")
public class DonationChkServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DateSetting dase = new DateSetting();
		DateSetting ds = dase.checkD("donationdate");
		request.setAttribute("date", ds.date);
	    request.setAttribute("diff", ds.diff);
	    RequestDispatcher rd = request.getRequestDispatcher("Donation.jsp");
	    rd.forward(request, response);

	}

}
