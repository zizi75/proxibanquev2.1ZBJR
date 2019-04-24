package org.simple.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simple.entity.Client;
import org.simple.main.ServiceMetier;

/**
 * Servlet implementation class ServletLogin
 */

/**
 * @author ZBJR Servlet permettant d'afficher la liste des clients en fonction
 *         du conseiller qui s'est connecté. Il peut ensuite saisir un Id_client
 *         et valider pour accéder à la fiche client correspondante. en cas de
 *         mauvais Id saisi on renvoi vers une page d'erreur. L'idée de la
 *         méthode était comme pour le login aller cherche la liste client dans
 *         la BD via la classe ServiceMetier. Puis comparer l'Id entrée par le
 *         conseiller pour aller chercher le client en question.
 * 
 */
@WebServlet("/ServletLogin")
public class ServletListeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServiceMetier s = new ServiceMetier();

	/**
	 * Default constructor.
	 */
	public ServletListeClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("clientchoisi");

		Client cl = new Client();

		/*
		 * s.trouverclient(cl);
		 * 
		 * RequestDispatcher dispatcher;
		 * 
		 * if (id.equals(s.findbyId(id)) ) {
		 * 
		 * dispatcher =request.getRequestDispatcher("FicheClient.jsp");
		 * 
		 * }else { dispatcher =request.getRequestDispatcher("ErreurListeClient.jsp"); }
		 * 
		 * 
		 * 
		 * dispatcher.forward(request, response);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
