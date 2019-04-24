package org.simple.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author ZBJR Classe Conseiller contenant l'ensemble des getters et setters
 *         ainsi qu'un constructeur par défaut et d'un toString. L'un des
 *         attribut est la liste client du conseiller.
 */
@Entity
public class Conseiller {

	// ATTRIBUTS
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String prenom;
	private String mdp;

	// liens tables dans la BD

	@OneToMany(mappedBy = "conseiller")
	private List<Client> listeclient = new ArrayList<Client>();

	// Constructeurs

	public Conseiller() {
		super();
	}

	public Conseiller(String name, String prenom, String mdp) {
		super();
		this.name = name;
		this.prenom = prenom;
		this.mdp = mdp;
	}

	public Conseiller(String name, String mdp) {
		super();
		this.name = name;
		this.mdp = mdp;
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

	public List<Client> getListeclient() {
		return listeclient;
	}

	public void setListeclient(List<Client> listeclient) {
		this.listeclient = listeclient;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	// toString
	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", name=" + name + ", prenom=" + prenom + ", mdp=" + mdp + ", listeclient="
				+ listeclient + "]";
	}

}