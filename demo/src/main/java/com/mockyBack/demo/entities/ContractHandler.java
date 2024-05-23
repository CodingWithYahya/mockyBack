package com.mockyBack.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Contract")
public class ContractHandler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typeClient;
    private String nomOrRaisonSociale;
    private String prenom;
    private String titreCivilite;
    private String typePieceIdentite;
    private String numeroPieceIdentite;
    private String sexe;
    private String situationFamiliale;
    private String telephone;
    private String email;
    private String profession;
    private String adresse;
    private String dateNaissance;
    private String idVilleAdresse;
    private String numeroPermis;
    private String dateObtentionPermis;
    private String idPaysPermis;
    private String numeroICE;
    private String activite;
    private String secteur;
    private String gsm;
    private String categoriePermis;
    private String nombreEnfant;
    private String clientConducteur;
    private String numeroClient;
    private String typeClientTiersSouscripteur;
    private String codeIntermediaireTiersSouscripteur;
    private String avecReductionSaharienne;
    private String gsmConducteur;
    private String numeroPieceIdentiteConducteur;
    private String adresseConducteur;
    private String telephoneConducteur;
    private String emailConducteur;
    private String nomOrRaisonSocialeConducteur;
    private String prenomConducteur;
    private String sexeConducteur;
    private String situationFamilialeConducteur;
    private String dateNaissanceConducteur;
    private String idVilleAdresseConducteur;
    private String idPaysPermisConducteur;
    private String paysPermisConducteur;
    private String professionConducteur;
    private String titreCiviliteConducteur;
    private String numeroPermisConducteur;
    private String dateObtentionPermisConducteur;
    private String categoriePermisConducteur;
    private String typePieceIdentiteConducteur;
    private String typeConducteur;
    private String numeroClientConducteur;
    private String typeClientTiersConducteur;
    private String codeIntermediaireTiersConducteur;
    private String gsmConducteurSecondaire;
    private String numeroPieceIdentiteConducteurSecondaire;
    private String adresseConducteurSecondaire;
    private String telephoneConducteurSecondaire;
    private String emailConducteurSecondaire;
    private String nomOrRaisonSocialeConducteurSecondaire;
    private String prenomConducteurSecondaire;
    private String sexeConducteurSecondaire;
    private String situationFamilialeConducteurSecondaire;
    private String dateNaissanceConducteurSecondaire;
    private String idVilleAdresseConducteurSecondaire;
    private String idPaysPermisConducteurSecondaire;
    private String professionConducteurSecondaire;
    private String titreCiviliteConducteurSecondaire;
    private String numeroPermisConducteurSecondaire;
    private String dateObtentionPermisConducteurSecondaire;
    private String categoriePermisConducteurSecondaire;
    private String typePieceIdentiteConducteurSecondaire;
    private String numeroClientConducteurSecondaire;
    private String typeClientTiersConducteurSecondaire;
    private String codeIntermediaireTiersConducteurSecondaire;
    private String codeUsageVehicule;
    private String idGenre;
    private String typeImmatriculation;
    private String immatriculation;
    private String tauxCRM;
    private String crmManuel;
    private String crmFMSAR;
    private String avecCrmManuel;
    private String marque;
    private String modele;
    private String carburant;
    private int puissanceFiscale;
    private String nombrePlace;
    private int nombreRemorquesTractes;
    private String valeurANeuf;
    private String valeurVenale;
    private String vehiculeAgarage;
    private int ptc;
    private String referenceCRMFMSAR;
    private String avecDelegation;
    private String avecBaremeConventionnel;
    private String numeroChassis;
    private String numeroCadre;
    private String numeroMoteur;
    private String avecAutreImmatriculation;
    private String avecModificationNarsa;
    private String avecErreurNarsa;
    private String avecAntivole;
    private String natureContrat;
    private String dateEffet;
    private String heureEffet;
    private String dateEcheance;
    private String heureEcheance;
    private String dateEvenement;
    private String heureEvenement;
    private String duree;
    private int dureeContratEnJour;
    private String dateEffetInitiale;
    private String dateEtablissement;
    private String modePaiement;
    private String numeroAttestation;
    private String formatAttestation;
    private int typeContrat;
    private String typeCouverture;
    private String numeroAttestationProvisoire;
    private int idIntermediaire;
    private String typeEvenement;
    private String idProduit;
    private String numeroDevis;
    private String souscripteurUpdated;
    private String conducteurUpdated;
    private String conducteurSecondaireUpdated;
}
