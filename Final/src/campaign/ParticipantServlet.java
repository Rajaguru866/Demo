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
@WebServlet("/ParticipantServlet")
public class ParticipantServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		AdminDAO dao = new AdminDAO();
		ArrayList<Participant> parList=null;
		try {
		parList = dao.showParticipant();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		request.setAttribute("participant", parList);
		RequestDispatcher rd = request.getRequestDispatcher("ShowParticipant.jsp");
		rd.forward(request, response);
		
	
	}

}
