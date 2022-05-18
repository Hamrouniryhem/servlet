package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FOrmulaireServelet
 */
@WebServlet("FOrmulaireServelet")
public class Formulaireservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulaireservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String op1 =request.getParameter("O1") ;
		String op2 =request.getParameter("O2") ;
		String operation = request.getParameter("operation") ;
		String page="" ;
		
	if ( (op1.equals("")||op2.equals("") ) ||(!(op1.matches("[0..9]*") ) || !(op2.matches("[0..9]*")))||(operation==null)){
		page="erreur.html";
	}else {page="response.jsp";
	}
	RequestDispatcher disp = request.getRequestDispatcher(page) ;
	disp.forward(request, response) ;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}