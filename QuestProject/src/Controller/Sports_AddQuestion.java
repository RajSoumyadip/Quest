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
 * Servlet implementation class Sports_AddQuestion
 */
@WebServlet("/Add_Question_Sports")
public class Sports_AddQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sports_AddQuestion() {
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
		DataBaseDAO obj = new DataBaseDAO();
		String question = request.getParameter("t1");
		HttpSession session = request.getSession();
		String uid = (String) session.getAttribute("userid");
		int quesno = obj.CountQuestion();
		boolean res = obj.insertQues("qsc"+quesno, uid , "Sports", question);
		response.sendRedirect("toSports");
	}

}
