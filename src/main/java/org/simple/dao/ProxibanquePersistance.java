package org.simple.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.simple.entity.Client;
import org.simple.entity.Compte;
import org.simple.entity.Conseiller;

/**
 * @author ZBJR Classe Persistance permettant de persister les données dans la
 *         BD
 *
 */

/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
/**
 * @author Adminl
 *
 */
public class ProxibanquePersistance {

	private List<Client> daoc = new ArrayList<Client>();

	/**
	 * @author ZBJR Ici on set des clients, conseillers et comptes afin de tester la
	 *         persistance des données. On attribue également des listes de comptes
	 *         aux clients et des listes de clients aux conseillers.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();

			Conseiller co1 = new Conseiller("con1", "con1", "111");
			Conseiller co2 = new Conseiller("con2", "con2", "222");
			Conseiller co3 = new Conseiller("con3", "con3", "333");

			Compte c1 = new Compte();
			Compte c2 = new Compte();
			Compte c3 = new Compte();
			Compte c4 = new Compte();

			Client cl1 = new Client();
			Client cl2 = new Client();
			Client cl3 = new Client();
			Client cl4 = new Client();

			cl1.setConseiller(co1);
			cl2.setConseiller(co2);
			cl3.setConseiller(co3);
			cl4.setConseiller(co1);

			c1.setClient(cl1);
			c2.setClient(cl2);
			c3.setClient(cl3);
			c4.setClient(cl4);

			em.persist(co1);
			em.persist(co2);
			em.persist(co3);
			em.persist(cl1);
			em.persist(cl2);
			em.persist(cl3);
			em.persist(cl4);
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);

			txn.commit();

		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();

		}

		finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();

			}

		}

	}

	/**
	 * @author ZBJR Ici on a une méthode pour l'instant non fonctionnelle pour aller
	 *         récupérer la liste client d'un conseiller en utilisant son nom, lui
	 *         même récupéré depuis la ServletLogin.
	 */
	public List<Client> trouverclient(Conseiller C) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn = em2.getTransaction();

		try {
			txn.begin();

			Query query = em2.createQuery("select C from Conseiller C where Conseiller.name='C.getname()'");
			List<Client> S = query.getResultList();
			daoc.equals(S);

			txn.commit();

		}

		catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();

		}

		finally {
			if (em2 != null) {
				em2.close();
			}
			if (emf != null) {
				emf.close();

			}

		}

		return daoc;
	}
}
