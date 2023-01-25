package pg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class passgenerator
 */
@WebServlet("/passgenerator")
public class passgenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public passgenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		int l=Integer.parseInt(request.getParameter("n1"));

		String pass=generatePswd(l);
		HttpSession s=request.getSession();
		s.setAttribute("pass",pass);
		response.sendRedirect("pg.jsp");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	static String generatePswd(int len)
	{
		System.out.println("Your Password:");
		String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String symbols = "!@#$%^&*_=+-/€.?<>)";

		String passSymbols = charsCaps + chars + nums + symbols;
		Random rnd = new Random();
		String pass="";

		char[] password = new char[len];
		int index = 0;
		for (int i = 0; i < len; i++) 
		{
			password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
			pass=pass+password[i];
		}


		return pass;
	}
}
