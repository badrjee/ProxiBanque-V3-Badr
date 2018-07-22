package fr.gtm.projetv3.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import fr.gtm.projetv3.model.Client;

/**
 * 
 * @author Azeri, Ussunet,Aitelhara
 * 
 *         Cette Interface qui communique avec la base de données et qui permet
 *         de remonter les infos du client sotcker en base de données
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	/**
	 * 
	 * @param nom
	 *            Nom du Client
	 * @return Liste des nom de tous les Clients
	 */
	@Query(value = "SELECT * FROM client WHERE nom = ?1", nativeQuery = true)
	List<Client> getAllByName(String nom);

	/**
	 * @param nom
	 *            Nom du Client
	 * @param prenom
	 *            Prénom du Client
	 * @return Liste de prénom de tous les Clients
	 */
	@Query(value = "SELECT * FROM client WHERE nom = ?1, prenom = ?2", nativeQuery = true)
	List<Client> getAllByNameAndFirstName(String nom, String prenom);
	


}
