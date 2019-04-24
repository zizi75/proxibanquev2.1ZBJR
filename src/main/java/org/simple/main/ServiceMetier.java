package org.simple.main;

import java.util.List;

import org.simple.dao.ProxibanquePersistance;
import org.simple.entity.Client;
import org.simple.entity.Conseiller;

/**
 * @author ZBJR Classe service contenant les m�thodes d'appels entre les
 *         Servlets et la persistance.
 *
 */
public class ServiceMetier {

	private ProxibanquePersistance dao = new ProxibanquePersistance();

	/**
	 * @author ZBJR M�thode entre la ServletLogin et Persistance pour envoyer les
	 *         donn�es conseillers saisies dans la page Login et ramener la liste
	 *         client du conseiller en question depuis Persistance vers la Servlet.
	 */
	public List<Client> trouverclientconseiller(Conseiller C) {

		return dao.trouverclient(C);
	}

}
