package fr.gtm.projetv3.model;

import java.time.LocalDate;

/**
 * 
 * @author Azeri, Ussunet,Aitelhara
 * 
 *         Cette Classe regroupe tous les élements nécessaires qui constitue un
 *         Compte, un Identifiant, Numéro de Compte, libeller, Date d'ouverture
 *         .
 *
 */

public class Compte {

	/**
	 * Attributs
	 */
	private Integer id;
	private Long numCC;
	private String libeller;
	private LocalDate dateOuverture;
	private CarteBleue cb;
	private Chequier cheque;
	private Double solde;
	private String typeCompte;
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Constructeur sans Paramètres
	 */
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param numCC
	 * @param libeller
	 * @param dateOuverture
	 * @param cb
	 * @param cheque
	 * @param solde
	 * @param typeCompte
	 * @param client
	 */
	public Compte(Integer id, Long numCC, String libeller, LocalDate dateOuverture, CarteBleue cb, Chequier cheque,
			Double solde, String typeCompte, Client client) {
		super();
		this.id = id;
		this.numCC = numCC;
		this.libeller = libeller;
		this.dateOuverture = dateOuverture;
		this.cb = cb;
		this.cheque = cheque;
		this.solde = solde;
		this.typeCompte = typeCompte;
		this.client = client;
	}
	
	/**
	 * 
	 * @return Idnetifiant de compte
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            Idnetifiant de compte
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Numéro de Compte
	 */
	public Long getNumCC() {
		return numCC;
	}

	/**
	 * 
	 * @param numCC
	 *            Numéro de Compte
	 */
	public void setNumCC(Long numCC) {
		this.numCC = numCC;
	}

	/**
	 * 
	 * @return Libeller de compte
	 */
	public String getLibeller() {
		return libeller;
	}

	/**
	 * 
	 * @param libeller Libeller de compte
	 */
	public void setLibeller(String libeller) {
		this.libeller = libeller;
	}

	/**
	 * 
	 * @return Date d'ouverture de Compte
	 */
	public LocalDate getDateOuverture() {
		return dateOuverture;
	}

	/**
	 * 
	 * @param dateOuverture Date d'ouverture de Compte
	 */
	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	/**
	 * 
	 * @return Carte bancaire Lieé au Compte
	 */
	public CarteBleue getCb() {
		return cb;
	}

	/**
	 * 
	 * @param cb Carte bancaire Lieé au Compte
	 */
	public void setCb(CarteBleue cb) {
		this.cb = cb;
	}

	/**
	 * 
	 * @return Chéquier liée au compte
	 */
	public Chequier getCheque() {
		return cheque;
	}

	/**
	 * 
	 * @param cheque Chéquier liée au compte
	 */
	public void setCheque(Chequier cheque) {
		this.cheque = cheque;
	}

	/**
	 * 
	 * @return Solde de Compte
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * 
	 * @param solde Solde de Compte
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**
	 * 
	 * @return Type de Compte Epargne ou Courant
	 */
	public String getTypeCompte() {
		return typeCompte;
	}

	/**
	 * 
	 * @param typeCompte Type de Compte Epargne ou Courant
	 */
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	/**
	 *  Méthode to String
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", numCC=" + numCC + ", libeller=" + libeller + ", dateOuverture=" + dateOuverture
				+ ", cb=" + cb + ", cheque=" + cheque + ", solde=" + solde + ", typeCompte=" + typeCompte + "]";
	}
}