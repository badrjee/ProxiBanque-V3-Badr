package fr.gtm.projetv3.model;

import java.time.LocalDate;

/**
 * 
 * @author Azeri, Ussunet,Aitelhara
 * 
 * Cette Classe regroupe tous les élements nécessaires  qui constitue un Chéquier,
 * un Identifiant, Date d'envoi, Date de Réception .
 *
 */

public class Chequier {

	/**
	 * Attributs
	 */

	private Integer id;
	private LocalDate dateEnvoi;
	private LocalDate dateReception;

	/**
	 * @param id
	 * @param dateEnvoi
	 * @param dateReception
	 */
	public Chequier(Integer id, LocalDate dateEnvoi, LocalDate dateReception) {
		super();
		this.id = id;
		this.dateEnvoi = dateEnvoi;
		this.dateReception = dateReception;
	}

	/**
	 * Constructeur sans paramètres
	 */
	public Chequier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return Identifiant de Chéquier en basec de données
	 */

	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            Identifiant de Chéquier en basec de données
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return Date d'envoi de chéquier
	 */
	public LocalDate getDateEnvoi() {
		return dateEnvoi;
	}

	/**
	 * @param dateEnvoi
	 *            Date d'envoi de chéquier
	 */
	public void setDateEnvoi(LocalDate dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	/**
	 * @return Date de réception par le client
	 */
	public LocalDate getDateReception() {
		return dateReception;
	}

	/**
	 * 
	 * @param dateReception Date de réception par le client
	 */
	public void setDateReception(LocalDate dateReception) {
		this.dateReception = dateReception;
	}

	/**
	 * Méthode toString
	 */
	@Override
	public String toString() {
		return "Chequier [id=" + id + ", dateEnvoi=" + dateEnvoi + ", dateReception=" + dateReception + "]";
	}

}