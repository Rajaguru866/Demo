package campaign;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Participant par = new Participant();		
		par.name = request.getParameter("name");
		par.degree = request.getParameter("degree");
		par.address = request.getParameter("address");
		par.mobno = Long.parseLong(request.getParameter("mobno"));
		AdminDAO dao = new AdminDAO();
		try {
			dao.addparticipant(par);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("Login.html");
	}

}
