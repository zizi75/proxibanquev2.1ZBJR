package org.simple.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author ZBJR Classe Client contenant l'ensemble des getters et setters ainsi
 *         qu'un constructeur par défaut et d'un toString. L'un des attribut est
 *         la liste des comptes du client.
 *
 */
@Entity
public class Client {

	// ATTRIBUTS

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String prenom;
	private String email;
	private String adresse;

	// liens tables dans la BD

	@ManyToOne
	@JoinColumn(name = "Conseiller_id")
	private Conseiller conseiller;

	@OneToMany(mappedBy = "Client")
	private Set<Compte> listecompte = new HashSet<Compte>();

	// toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", prenom=" + prenom + ", email=" + email + ", adresse="
				+ adresse + ", conseiller=" + conseiller + ", listecompte=" + listecompte + "]";
	}

	// Constructeur
	public Client() {
		super();
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Compte> getListecompte() {
		return listecompte;
	}

	public void setListecompte(Set<Compte> listecompte) {
		this.listecompte = listecompte;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

}
