package fr.gtm.projetv3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.gtm.projetv3.model.CarteBleue;

/**
 * 
 * @author Azeri,Ussunet,Aitelhara
 * 
 *         Cette Interface qui communique avec la base de données et qui permet
 *         de remonter les infos de la carte bancaire du client sotcker en base
 *         de données
 *
 */

@Repository
public interface CarteBleueRepository extends JpaRepository<CarteBleue, Integer> {

}
