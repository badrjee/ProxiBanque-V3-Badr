package fr.gtm.projetv3.web;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.projetv3.model.Client;
import fr.gtm.projetv3.model.Compte;
import fr.gtm.projetv3.service.CarteBleueService;
import fr.gtm.projetv3.service.ClientService;
import fr.gtm.projetv3.service.CompteService;
import fr.gtm.projetv3.service.Results;

/**
 * 
 * @author Azeri, Ussunet, Aitelhara
 *
 */

@Controller
public class IndexController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	ClientService clientService;

	@Autowired
	CompteService compteService;

	@Autowired
	CarteBleueService carteBleueService;

	/**
	 *
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	/**
	 *
	 * @param nomprenom
	 * @return
	 */
	@PostMapping("/index")
	public String authentification(@RequestParam("nom-prenom") String nomprenom) {

		String nom = nomprenom.split(" ")[0];

		String prenom = nomprenom.split(" ")[1];

		List<Client> listCli = this.clientService.findByEntry(nom, prenom);
		if (listCli.isEmpty()) {
			// final ModelAndView mav = new ModelAndView("authen");
			// mav.addObject("searchid", listCli);
			return "redirect:/erreur.html";

		} else {

			return "redirect:/authen.html";
		}
	}

	/**
	 *
	 * @return
	 */
	@GetMapping("authen")
	public ModelAndView date() {
		final ModelAndView mav = new ModelAndView("authen");
		return mav;
	}

	/**
	 * @param dateNaissance
	 * @return
	 */
	@PostMapping("/authen")
	public ModelAndView date(
			@RequestParam("dateNaissance") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateNaissance) {

		Client result = this.clientService.checkDate(dateNaissance);
		Integer idClient = this.clientService.getId(dateNaissance);
		ModelAndView renvoi = null;
		if (result != null) {
			List<Compte> listComtes = this.compteService.listComptes(idClient);
			final ModelAndView mav = new ModelAndView("accueil");
			mav.addObject("list", listComtes);
			mav.addObject("idClient", idClient);
			renvoi = mav;
		} else {
			final ModelAndView mav = new ModelAndView("erreur");
			renvoi = mav;
		}
		return renvoi;
	}

	@RequestMapping("/erreur")
	public ModelAndView badr() {
		final ModelAndView mav = new ModelAndView("erreur");
		return mav;
	}

	@GetMapping("/virement")
	public ModelAndView virement(@RequestParam("id") Integer idClient) {
		final ModelAndView mav = new ModelAndView("virement");

		List<Compte> listComptesCli = this.compteService.listComptes(idClient);
		List<Compte> listComtes = this.compteService.listAll();

		mav.addObject("listClient", listComptesCli);
		mav.addObject("listAllComptes", listComtes);

		return mav;
	}

	@PostMapping("/virement")
	public ModelAndView virement(
			@RequestParam("montantVirement") Double montant,
			@RequestParam("compteDebiteur") Long cptDebiteur, 
			@RequestParam("compteCrediteur") Long cptCrediteur,
			@RequestParam("id") Integer idClient) {
		
		final ModelAndView mav = new ModelAndView("virement");
		
		List<Compte> listComptesCli = this.compteService.listComptes(idClient);
		List<Compte> listComtes = this.compteService.listAll();
		
		Optional<Compte> wrapDeb = this.compteService.findByCc(cptDebiteur);
		Optional<Compte> wrapCred = this.compteService.findByCc(cptCrediteur);
		
		Compte debiteur = null;
		Compte crediteur = null;
		
		if(wrapDeb.isPresent()) {
			debiteur = wrapDeb.get();
		}
		
		if(wrapCred.isPresent()) {
			crediteur = wrapCred.get();
		}
		
		Double sld = crediteur.getSolde();
		crediteur.setSolde(sld - montant);
		
		Double cld = debiteur.getSolde();
		debiteur.setSolde(cld + montant);
		
		// JAI REMIXER LA METHODE AVEC UN ID SUPPLEMENTAIRE MAIS SANS SUCCES
		this.compteService.debitCompte2(montant, crediteur.getId(), idClient);
		//this.compteService.creditCompte(montant, debiteur.getId());
		
		mav.addObject("listClient", listComptesCli);
		mav.addObject("listAllComptes", listComtes);
		mav.addObject("msg", "Transfert Effectuer");

		return mav;
	}

	
	@GetMapping("/retrait")
	public ModelAndView choixRetrait(@RequestParam ("idCcompte")Integer idCompte) {
		final ModelAndView mav = new ModelAndView("retrait");
		Optional<Compte> wrapper = this.compteService.findById(idCompte);
		Compte cpt = null;				
		if(wrapper.isPresent()) {
			cpt = wrapper.get();
			mav.addObject("compte", cpt);
			LOGGER.info("idCompte="+ idCompte);
		}		
		return mav;
	}
	
	@PostMapping("/retrait")
	public String retraitCash(@RequestParam ("idCcompte")Integer idCompte, @RequestParam ("montantRetrait")Double mt) {
		String result = null;
		LOGGER.info("idCompte="+ idCompte);
		LOGGER.info("montant="+ mt);
		result = this.compteService.debitCompte(mt, idCompte);
		return result;
	}
	

}