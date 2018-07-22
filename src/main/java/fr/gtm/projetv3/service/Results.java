package fr.gtm.projetv3.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.ClientRepository;
import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.web.IndexController;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */
public class Results {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	private Integer id;
	private String nom;
	private String prenom;
	private Integer idClient;

	@Autowired
	ClientRepository repo;

	/**
	 * @param id
	 * @return
	 */
	// Methode de traitement

	public List<String> getResultsById(Integer id) {
		
		List<String> result = new ArrayList<>();
		result.add(this.getNom());
		result.add(this.getPrenom());
		return result;
	}

	/**
	 *
	 * @param dateNaissance
	 * @return
	 */
	public Integer getIdClient(LocalDate dateNaissance) {

		List<Client> clients = this.repo.findAll();
		Integer idClient = null;
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).getDateNaissance().equals(dateNaissance)) {
				idClient = clients.get(i).getId();
				this.setIdClient(idClient);
			}
		}
		return idClient;
	}

	/**
	 *
	 * @param nom
	 * @return
	 */

	public List<Client> searchByNameAndFirstName(String nom, String prenom) {
		
		this.nom = nom;
		return this.repo.getAllByName(nom);
	}

	public List<Client> searchByName(String nom) {
		LOGGER.info("COMPONENT je search by name");
		this.nom = nom;
		return this.repo.getAllByName(nom);
	}

	/**
	 * 
	 * @param nom
	 * @param dateNaissance
	 * @return
	 */

	// Methode de comparaison client par nom avec prenom entré
	public Client compare(String nom, LocalDate dateNaissance) {
		int i;
		Client result = null;
		List<Client> c1 = this.repo.getAllByName(nom);
		for (i = 0; i < c1.size(); i++)
			if (c1.get(i).getDateNaissance().equals(dateNaissance)) {
				result = c1.get(i);
			}
		LOGGER.info("compare" + c1.get(0).getPrenom());
		return result;
	}

	// Getters & Setters

	/**
	 * Constructeur par défault
	 */
	public Results() {
	}

	/**
	 *
	 * @return Id Identifiant Client aprés la Recherche
	 */
	public Integer getId() {
		return id;
	}

	/**
	 *
	 * @param id
	 *            Id Identifiant Client aprés la Recherche
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return nom Client aprés la Recherche
	 */
	public String getNom() {
		return nom;
	}

	/**
	 *
	 * @param nom
	 *            Nom client aprés la Recherche
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 *
	 * @return Prénom client aprés la Recherche
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 *
	 * @param prenom
	 *            prénom client aprés la Recherche
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * 
	 * @return idClient stock l'id du client pour ne pas avoir a aller le rechercher
	 *         à chaque étape
	 */
	public Integer getIdClient() {
		return idClient;
	}

	/**
	 * 
	 * @param idClient
	 *            permet de set l'id du Client pour ne pas avoir a aller le
	 *            rechercher à chaque étape
	 */
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
}