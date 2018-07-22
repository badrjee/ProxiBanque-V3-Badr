package fr.gtm.projetv3.model;

import java.time.LocalDate;

/**
 * 
 * @author Azeri, Ussunet,Aitelhara
 * 
 * Cette Classe regroupe tous les élements nécessaires  qui constitue uune carte bancaire,
 * un Identifiant, Numero de carte, Date d'expiration, Type de carte .
 *
 */

public class CarteBleue {

	/**
	 * Attributs
	 */

	private Integer id;
	private Long numeroCarte;
	private LocalDate dateExpiration;
	private Boolean type;

	/**
	 * Constructeur sans paramétres
	 */
	public CarteBleue() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 *            Identifiant liée à la carte Bleu
	 * @param numeroCarte
	 *            Numéro de la carte bleu
	 * @param dateExpiration
	 *            Date de l'experation de la carte bleu
	 * @param type
	 *            Type de la catre bleu
	 */
	public CarteBleue(Integer id, Long numeroCarte, LocalDate dateExpiration, Boolean type) {
		super();
		this.id = id;
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
		this.type = type;
	}

	/**
	 * 
	 * @return l'identifiant de la carte bleu en base de données
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            Identifiant de la carte bleu dans la bse de données
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Numéro de la carte bleu
	 */
	public Long getNumeroCarte() {
		return numeroCarte;
	}

	/**
	 * 
	 * @param numeroCarte
	 *            Numéro de la carte bleu
	 */
	public void setNumeroCarte(Long numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	/**
	 * 
	 * @return Date de l'expiration de la carte bleu
	 */
	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	/**
	 * 
	 * @param dateExpiration
	 *            Date d'expiration de la carte bleu
	 */
	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	/**
	 * 
	 * @return Type de la carte bleu elle nous retourne un boolean "1" pour une
	 *         carte ELECTRON ou "0" pour une carte PREMIER
	 */
	public Boolean getType() {
		return type;
	}
	
	/**
	 * 
	 * @param type Type de la carte bleu soit carte Visa ELECTRON ou PREMIER
	 */

	public void setType(Boolean type) {
		this.type = type;
	}
	
	/**
	 * Méthode toString
	 */

	@Override
	public String toString() {
		return "CarteBleue [id=" + id + ", numeroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration
				+ ", type=" + type + "]";
	}
}