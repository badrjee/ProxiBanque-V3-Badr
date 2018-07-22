package fr.gtm.projetv3.model;



import java.io.Serializable;
import java.time.LocalDate;

import java.util.List;
/**
 * 
 * @author Azeri, Ussunet,Aitelhara
 * 
 * Cette Classe regroupe tous les élements nécessaires  qui constitue un Client,
 * un Identifiant, Nom, Prénom, NumeroClient,Date de naissance, Adresse, Liste des Comptes .
 *
 */
public class Client {

	/**
	 * Attributs
	 */
	private Integer id;
	private Long numCl;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private Adresse adresse;
	private List<Compte> comptes;

	/**
	 * Constructeur sans paramètres
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 *            Identifiant du client en base de données
	 * @param numCl
	 *            Numéro de Client
	 * @param nom
	 *            Nom de client
	 * @param prenom
	 *            Prénom de client
	 * @param dateNaissance
	 *            Date de naissance du client
	 * @param adresse
	 *            Adresse du Client de type Adresse et qui pointe vers l'identfiant
	 *            de la classe Adress
	 * @param comptes Le compte de client de type Compte et qui pointe vers l'identifiant de la classe Compte
	 */
	public Client(Integer id, Long numCl, String nom, String prenom, LocalDate dateNaissance, Adresse adresse,
			List<Compte> comptes) {
		super();
		this.id = id;
		this.numCl = numCl;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.comptes = comptes;
	}

	/**
	 * @return l'Identifiant du client en base de données
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id Identifiant du client en base de données
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Numéro du Client
	 */
	public Long getNumCl() {
		return numCl;
	}

	/**
	 * 
	 * @param numCl Numéro du client
	 */
	public void setNumCl(Long numCl) {
		this.numCl = numCl;
	}

	/**
	 * 
	 * @return Nom du Client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * 
	 * @param nom Nom du Client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @return Prénom du Client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prénom du client
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return Date de naissance du client
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * 
	 * @param dateNaissance Date de naissance du client
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * 
	 * @return Adresse du client de type Adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * 
	 * @param adresse Adresse du client de type Adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * 
	 * @return Liste des Comptes du client Epargne et courant
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * 
	 * @param comptes Liste des Comptes du client Epargne et courant
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * Méthode to String
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", numCl=" + numCl + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", comptes=" + comptes + "]";
	}
}