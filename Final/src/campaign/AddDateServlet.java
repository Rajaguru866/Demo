package campaign;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/AddDateServlet")
public class AddDateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String eventDate = request.getParameter("ED");
		String donationDate = request.getParameter("DD");
		try
		{
		AdminDAO dao = new AdminDAO();
		dao.addDate(donationDate, "donationdate");
		dao.addDate(eventDate, "eventdate");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		response.sendRedirect("Admin.jsp");		
		
	}

}
