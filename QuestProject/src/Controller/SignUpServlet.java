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
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signupServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		String fname="", lname="", email="", pass="";
		String uid="";
		HttpSession session = request.getSession();
		fname = request.getParameter("fname");
		lname = request.getParameter("lname");
		email = request.getParameter("email");
		pass = request.getParameter("pass");
		boolean res = dataBaseDAO.AddUser("user"+dataBaseDAO.CountUser(), fname, lname, email, pass);
		if(res==true)
		{
			String name = fname+" "+lname;
			session.setAttribute("uname", name);
			uid = dataBaseDAO.UserExistenceID(email, pass);
			session.setAttribute("userid", uid);
			response.sendRedirect("topic.jsp");
			
		}
		else
			response.sendRedirect("error.html");
		
	}

}
