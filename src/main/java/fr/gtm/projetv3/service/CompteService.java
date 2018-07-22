package fr.gtm.projetv3.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.gtm.projetv3.dao.CompteRepository;
import fr.gtm.projetv3.model.Compte;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */

public class CompteService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CompteService.class);

	@Autowired
	CompteRepository repo;

	/**
	 * 
	 * @param idCompte
	 * @return
	 */
	// Trouver un compte
	public Optional<Compte> findById(Integer idCompte) {
		return this.repo.findById(idCompte);
	}
	
	public Optional<Compte> findByCc(Long cc) {
		return this.repo.getComptesByCc(cc);
	}

	
	
	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
	// D�bit compte pour retraits

	public String debitCompte(Double mt, Integer idCompte) {
		String result = null;
		Double solde = null;
		Optional<Compte> compte = this.findById(idCompte);
		if (compte.isPresent()) {
			solde = this.findById(idCompte).get().getSolde();
			String typeCompte = compte.get().getTypeCompte();
			if (typeCompte.equals("courant")) {
				if (mt < solde) {
					solde -= mt;
					LOGGER.info("idCompte=" + idCompte);
					LOGGER.info("solde=" + solde);
					compte.get().setSolde(solde);
					this.repo.saveSolde(solde, idCompte);
					result = "redirect:/accueil";
				} else if (mt > solde || mt > 300) {
					result = "redirect:/erreur";
				}
			}
		}
		return result;
	}

			//D�bit compte pour virements
	public Compte debitCompte2(Double mt, Integer idCompte, Integer id) {
		Double solde = this.findById(idCompte).get().getSolde();
		if (mt < solde) {
			solde -= mt;
		} else {
			// TODO ExceptionSoldeInsuffisant
		}
		return this.repo.saveSolde(solde, idCompte);
	}

	/**
	 * 
	 * @param mt
	 * @param idCompte
	 * @return
	 */
	// Cr�dit compte pour virements.
	public Compte creditCompte(Double mt, Integer idCompte) {
		Double solde = this.findById(idCompte).get().getSolde();
		solde += mt;
		return this.repo.saveSolde(solde, idCompte);
	}

	/**
	 * 
	 * @param idClient
	 * @return
	 */
	// Affichage des comptes du client
	public List<Compte> listComptes(Integer idClient) {
		List<Compte> comptes = this.repo.getComptesByIdClient(idClient);
		return comptes;
	}

	public List<Compte> listAll() {
		return this.repo.findAll();
	}


}
