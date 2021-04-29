package index;

import Exception.InvalidStatutException;

/**
 * La classe personne
 * @author YCH
 *
 */
public abstract class Person {
	/**
	 * nom de la personne
	 */
	private String nom;
	/**
	 * prénom de la personne
	 */
	private String prenom;
	/**
	 * statut de la personne
	 */
	private String statut;
	
	/**
	 * Constructeur de personne
	 * @param nom nom de la personne 
	 * @param prenom prenom de la personne
	 * @param statut statut de la personne ( normal ou vip ) 
	 */
	public Person(String nom, String prenom, String statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		setStatut(statut);
		
	}
	
	/*
	 * Guetteurs and setteurs
	 */
	/**
	 * 
	 * @return le nom de la personne
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * modifie le nom de la personne
	 * @param nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * 
	 * @return le prenom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * modifie le prenom de la personne 
	 * @param prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * 
	 * @return le statut de la personne
	 */
	public String getStatut() {
		return statut;
	}
	/**
	 * modifie le statut de la personne
	 * @param statut de la personne
	 */
	public void setStatut(String statut) throws RuntimeException{
		if(statut != "normal" && statut != "vip") {
			throw new InvalidStatutException();
		}else {
			this.statut = statut;
		}	
		
	}
	
	/**
	 * méthode qui renvoie la première lettre du nom suivie de la première lettre du prénom
	 */
	public abstract String getInitials();
	
}