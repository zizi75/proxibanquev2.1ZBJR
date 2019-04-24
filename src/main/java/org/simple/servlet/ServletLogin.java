package org.simple.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simple.entity.Conseiller;
import org.simple.main.ServiceMetier;

/**
 * Servlet implementation class ServletLogin
 */

/**
 * @author ZBJR Servlet permettant de lancer la page de Login, en cas de
 *         validation on renvoi vers la ServletListeClient et la page
 *         ListeClient. En cas d'échec on renvoi vers une page avec un message
 *         d'erreur.
 *
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServiceMetier s = new ServiceMetier();

	/**
	 * Default constructor.
	 */
	public ServletLogin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("identifiant");
		String password = request.getParameter("mdp");
		Conseiller C = new Conseiller(name, password);

		System.out.println(s.trouverclientconseiller(C));

		/**
		 * @author ZBJR Si la methode trouverclientconseiller retourne une liste null
		 *         alors on considère que le conseiller n'existe pas et on redirige
		 *         alors vers page ErreurLogin. A l'inverse si le conseiller existe, on
		 *         redirigera vers la pasge ListeClient où on affichera le résultat.
		 *
		 */
		RequestDispatcher dispatcher;

		if (s.equals(null)) {

			dispatcher = request.getRequestDispatcher("ErreurLogin.jsp");

		} else {
			dispatcher = request.getRequestDispatcher("ListeClient.jsp");
		}

		dispatcher.forward(request, response);

	}

}
