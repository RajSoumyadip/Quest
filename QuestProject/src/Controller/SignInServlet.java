package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.DataBaseDAO;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/signinServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DataBaseDAO dataBaseDAO = new DataBaseDAO();
		String em = request.getParameter("email");
		HttpSession session = request.getSession();
		String username="";
		String uid = "";
		String pass = request.getParameter("pass");
		boolean exist = dataBaseDAO.UserExists(em,pass);
		if (exist==false)
		{
			response.sendRedirect("error.html");
		}
		else
		{
			username = dataBaseDAO.UserExistenceInfo(em, pass);
			uid = dataBaseDAO.UserExistenceID(em, pass);
			session.setAttribute("uname", username);
			session.setAttribute("userid", uid);
			response.sendRedirect("topic.html");
			
		}
	}

}
