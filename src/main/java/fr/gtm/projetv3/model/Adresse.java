package fr.gtm.projetv3.model;

/**
 * 
 * @author Azeri,Ussunet,Aitlhara
 *
 
 * Cette Classe regroupe tous les élements nécessaires  qui constitue une Adresse,
 * un Identifiant, Code Postal, Ville, Nom de rue, Numéro de Rue, Pays.
 *
 */

public class Adresse {

	/**
	 * Attributs
	 */

	private Integer id;
	private Integer codePostal;
	private String ville;
	private String nomRue;
	private String numRue;
	private String pays;
	private String adresseOpt;

	/**
	 * @param id
	 *            identifiant de l'adresse du client
	 * @param codePostal
	 *            code postal du client
	 * @param ville
	 *            ville du client
	 * @param nomRue
	 *            l'adresse d'habitation du client
	 * @param numRue
	 *            numero de la rue
	 * @param pays
	 *            pays de résidence du client
	 * @param adresseOpt
	 *            complemnt d'adresse du client
	 */
	public Adresse(Integer id, Integer codePostal, String ville, String nomRue, String numRue, String pays,
			String adresseOpt) {
		super();
		this.id = id;
		this.codePostal = codePostal;
		this.ville = ville;
		this.nomRue = nomRue;
		this.numRue = numRue;
		this.pays = pays;
		this.adresseOpt = adresseOpt;
	}

	/**
	 * Constructeur sans paramétres
	 */
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return l'identifiant liée à l'adresse du Client
	 */

	public Integer getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id identifiant de l'objet Adresse
	 */

	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return le code postal du client
	 */

	public Integer getCodePostal() {
		return codePostal;
	}
	
	/**
	 * 
	 * @param codePostal code postal du client
	 */

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}
	
	/**
	 * 
	 * @return la ville du client
	 */

	public String getVille() {
		return ville;
	}
	
	/**
	 * 
	 * @param ville ville du client
	 */

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	/**
	 * 
	 * @return nom de la rue
	 */

	public String getNomRue() {
		return nomRue;
	}
	
	/**
	 * 
	 * @param nomRue le nom de la rue liée a l'adresse du client
	 */

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	
	/**
	 * 
	 * @return numero de la rue
	 */

	public String getNumRue() {
		return numRue;
	}
	
	/**
	 * 
	 * @param numRue numero de la rue
	 */

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	
	/**
	 * 
	 * @return  le pays de résidence du client
	 */

	public String getPays() {
		return pays;
	}
	
	/**
	 * 
	 * @param pays pays de residence du client
	 */

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	/**
	 * @return le complément d'adresse
	 */

	public String getAdresseOpt() {
		return adresseOpt;
	}
	
	/**
	 * 
	 * @param adresseOpt complément d'adresse du client
	 */

	public void setAdresseOpt(String adresseOpt) {
		this.adresseOpt = adresseOpt;
	}
	
	/**
	 * Methode toString
	 */

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", codePostal=" + codePostal + ", ville=" + ville + ", nomRue=" + nomRue
				+ ", numRue=" + numRue + ", pays=" + pays + ", adresseOpt=" + adresseOpt + "]";
	}
}