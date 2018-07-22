# ProxiBanque-V3-Badr

Introduction

    Proxibanque est un logiciel permettant le traitement de données bancaires. Il s'agit d'une interface destinée à un client de banque et lui permet de consulter ses comptes d'effectuer un retrait depuis un compte courant, ou un virement compte à compte.

    Cette application est encore en beta test et se verra offrir de nouvelles options telles que la demande d'un nouveau chéquier ou encore le retrait en borne d'une carte (VISA Premier ou Electron) affiliée à l'un de ses comptes.


Installation

    Configuration nécessaire :

        Serveur d'application nécessaire au déploiement du .war,
        Base de donnée pour le stockage et la persistance,

    Installation :

        Dézipper le fichier "proxibanque-Azeri-Ussunet-Aitelhara.zip".
        Copier le fichier .war depuis le dossier "target" du projet dans le dossier "webapps" de Tomcat.
        Créer une Base de Données avec un nom "proxibanquev3".
        Lancer Tomcat afin de créer les tables de la Base de données.
        Copier les commandes SQL du fichier "list de données.sql" contenu dans le dossier "Support" du projet dans la commande SQL du gestionnaire de base de données afin de créer les données nécessaires à la démonstration.
        Rendez- vous sur la page "http://localhost:8080/proxybanque_Azeri-Ussunet-Aitelhara/" afin de démarrer la démonstration.

    Utilisation :

        Nous vous conseillons d'utiliser le client test :
            Nom : "FRANK"
            Prénom : "Fabien"
            Date : "23-02-1990"
        Renseignez le champ NOM/PRENOM,
        L'application vous redirige vers une page de sécurité afin de confirmer votre identité en vous demandant la date de naissance du client,

        Une fois authentifié, une page affichant la liste des comptes du client se manifeste et vous propose différentes options :
            Effectuer des Opérations sur l'un des comptes (retrait simple en fonction / futur ajouts des fonctionnalités retrait carte et commande chéquier),

            Effectuer un virement.
                Effectuer un retrait (cash) depuis un compte courant uniquement : il vous suffit de rentrer le montant que vous souhaitez retirer (<300€), puis de valider la saisie. Vous serez alors redirigé vers la liste des comptes client.
                Effectuer un virement : Le compte emetteur est obligatoirement un compte du client loggé, il peut virer de l'argent vers n'importe quel compte de la banque. Une fois l'action validée, vous êtes renvoyé sur la page des virements.
        A tout moment vous pouvez vous déconnecter en cliquant sur le bouton en haut a gauche de l'écran, cette action met fin à votre session en vous revoyant vers la page d'authentification.
        Si par mégarde, vous faites une erreur, vous serez redirigé vers la page d'erreur vous conseillant de contacter le personnel de la banque. Vous pouvez néanmoins retourner à l'écran de d'authentification pour démarrer une nouvelle session.
