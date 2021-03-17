package campaign;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/AddDonationServlet")
public class AddDonationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Donation don = new Donation();
		don.name = request.getParameter("name");
		don.mailid = request.getParameter("mailid");
		don.mobno = Long.parseLong(request.getParameter("mobno"));
		don.amount = Integer.parseInt(request.getParameter("amount"));
		don.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		AdminDAO dao = new AdminDAO();
		try {
			dao.addDonationDAO(don);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("Login.html");
	
	}

}
