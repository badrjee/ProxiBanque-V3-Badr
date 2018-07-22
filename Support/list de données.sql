--
-- Base de données :  `proxibanquebdd`
--
CREATE DATABASE IF NOT EXISTS `proxibanquev3` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `proxibanquev3`;

--------------------------------------------------------------------------------------------------------------------

--
-- Contenu des Tables
--
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:5 bt:a",75000,"rue de marseille",20,"France","Paris");
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:3 bt:c",75020,"avenue des fleures",15,"France","Paris");
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:1 bt:2",75010,"Rue du Débarcadère",75,"France","Paris");
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:7 bt:8",75003,"rue de la Banque",10,"France","Paris");
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:1 bt:1",75005,"rue des riches",23,"France","Paris");
INSERT INTO `adresse`(`adresseOpt`, `codePostal`, `nomRue`, `numRue`, `pays`, `ville`) VALUES ("bloc:3 bt:e",75009,"rue de la cité",03,"France","Paris");

INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2017-04-25","2017-05-02");
INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2017-09-10","2017-09-15");
INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2018-01-02","2018-01-08");
INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2017-06-17","2017-06-22");
INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2018-02-02","2018-02-08");
INSERT INTO `chequier`(`dateEnvoi`, `dateReception`) VALUES ("2017-07-01","2017-07-10");

INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2018-08-10",1543753321123653,0);
INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2019-08-16",1594486584747413,1);
INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2018-12-03",9854712878956547,0);
INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2019-12-22",1258998742741000,1);
INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2020-11-13",0025478698579645,0);
INSERT INTO `cartebleue`(`dateExpiration`, `numeroCarte`, `type`) VALUES ("2018-10-15",0125496587896347,1);

INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1990-02-23","FRANK",12345678,"Fabien",1);
INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1993-06-10","POGBA",25698745,"Paul",2);
INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1988-12-09","RAMI",33698752,"Adil",3);
INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1987-08-09","BOUTRA",21487963,"Nadir",4);
INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1990-10-22","SISSI",98745234,"Kamir",5);
INSERT INTO `client`(`dateNaissance`, `nom`, `numCl`, `prenom`, `adresseCol`) VALUES ("1991-01-12","FEKIR",69872100,"Nabil",6);

INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2018-01-10","compte courant",7894674516454,500,"courant",1,1,1);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `idCheque`, `clientId`) VALUES ("2018-02-10","compte Epargne",5637837500204,10,"epargne",1,1);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2017-02-15","compte courant",4202042472342,120,"courant",2,2,2);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `idCheque`, `clientId`) VALUES ("2017-02-15","compte Epargne",2477340040450,0,"epargne",2,2);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `idCheque`, `clientId`) VALUES ("2015-10-22","compte Epargne",1755820767623,150,"epargne",3,3);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2018-03-14","compte courant",4247565678975,3000,"courant",3,3,3);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2016-10-10","compte courant",4234724720377,2500,"courant",4,4,4);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2017-06-02","compte courant",1275755557885,3500,"courant",5,5,5);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `idCheque`, `clientId`) VALUES ("2018-01-29","compte Epargne",1112358744458,120,"epargne",6,6);
INSERT INTO `compte`(`dateOuverture`, `libeller`, `numCC`, `solde`, `typeCompte`, `carteBleueCol`, `idCheque`, `clientId`) VALUES ("2017-08-24","compte courant",1445725758956,4000,"courant",6,6,6);