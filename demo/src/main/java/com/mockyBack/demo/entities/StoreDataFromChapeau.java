package com.mockyBack.demo.entities;
import javax.persistence.*;

@Entity
@Table(name = "DirtyData")
public class StoreDataFromChapeau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObjetFromCh;

    @Column(name = "type_client")
    private String typeClient;

    @Column(name = "nom_or_raison_sociale")
    private String nomOrRaisonSociale;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "titre_civilite")
    private String titreCivilite;

    @Column(name = "type_piece_identite")
    private String typePieceIdentite;

    @Column(name = "numero_piece_identite")
    private String numeroPieceIdentite;

    @Column(name = "sexe")
    private String sexe;

    @Column(name = "situation_familiale")
    private String situationFamiliale;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "profession")
    private String profession;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "date_naissance")
    private String dateNaissance;

    @Column(name = "id_ville_adresse")
    private String idVilleAdresse;

    @Column(name = "numero_permis")
    private String numeroPermis;

    @Column(name = "date_obtention_permis")
    private String dateObtentionPermis;

    @Column(name = "id_pays_permis")
    private String idPaysPermis;

    @Column(name = "numero_ice")
    private String numeroICE;

    @Column(name = "activite")
    private String activite;

    @Column(name = "secteur")
    private String secteur;

    @Column(name = "gsm")
    private String gsm;

    @Column(name = "categorie_permis")
    private String categoriePermis;
    @Column(name = "nombre_enfant")
    private String nombreEnfant;
    @Column(name = "client_conducteur")
    private String clientConducteur;

    @Column(name = "numero_client")
    private String numeroClient;

    @Column(name = "type_client_tiers_souscripteur")
    private String typeClientTiersSouscripteur;

    @Column(name = "code_intermediaire_tiers_souscripteur")
    private String codeIntermediaireTiersSouscripteur;

    @Column(name = "avec_reduction_saharienne")
    private String avecReductionSaharienne;

    @Column(name = "gsm_conducteur")
    private String gsmConducteur;

    @Column(name = "numero_piece_identite_conducteur")
    private String numeroPieceIdentiteConducteur;

    @Column(name = "adresse_conducteur")
    private String adresseConducteur;

    @Column(name = "telephone_conducteur")
    private String telephoneConducteur;

    @Column(name = "email_conducteur")
    private String emailConducteur;

    @Column(name = "nom_or_raison_sociale_conducteur")
    private String nomOrRaisonSocialeConducteur;

    @Column(name = "prenom_conducteur")
    private String prenomConducteur;

    @Column(name = "sexe_conducteur")
    private String sexeConducteur;

    @Column(name = "situation_familiale_conducteur")
    private String situationFamilialeConducteur;

    @Column(name = "date_naissance_conducteur")
    private String dateNaissanceConducteur;

    @Column(name = "id_ville_adresse_conducteur")
    private String idVilleAdresseConducteur;

    @Column(name = "id_pays_permis_conducteur")
    private String idPaysPermisConducteur;

    @Column(name = "pays_permis_conducteur")
    private String paysPermisConducteur;

    @Column(name = "profession_conducteur")
    private String professionConducteur;

    @Column(name = "titre_civilite_conducteur")
    private String titreCiviliteConducteur;

    @Column(name = "numero_permis_conducteur")
    private String numeroPermisConducteur;

    @Column(name = "date_obtention_permis_conducteur")
    private String dateObtentionPermisConducteur;

    @Column(name = "categorie_permis_conducteur")
    private String categoriePermisConducteur;

    @Column(name = "type_piece_identite_conducteur")
    private String typePieceIdentiteConducteur;

    @Column(name = "type_conducteur")
    private String typeConducteur;

    @Column(name = "numero_client_conducteur")
    private String numeroClientConducteur;

    @Column(name = "type_client_tiers_conducteur")
    private String typeClientTiersConducteur;

    @Column(name = "code_intermediaire_tiers_conducteur")
    private String codeIntermediaireTiersConducteur;

    @Column(name = "gsm_conducteur_secondaire")
    private String gsmConducteurSecondaire;

    @Column(name = "numero_piece_identite_conducteur_secondaire")
    private String numeroPieceIdentiteConducteurSecondaire;

    @Column(name = "adresse_conducteur_secondaire")
    private String adresseConducteurSecondaire;

    @Column(name = "telephone_conducteur_secondaire")
    private String telephoneConducteurSecondaire;

    @Column(name = "email_conducteur_secondaire")
    private String emailConducteurSecondaire;

    @Column(name = "nom_or_raison_sociale_conducteur_secondaire")
    private String nomOrRaisonSocialeConducteurSecondaire;

    @Column(name = "prenom_conducteur_secondaire")
    private String prenomConducteurSecondaire;

    @Column(name = "sexe_conducteur_secondaire")
    private String sexeConducteurSecondaire;

    @Column(name = "situation_familiale_conducteur_secondaire")
    private String situationFamilialeConducteurSecondaire;

    @Column(name = "date_naissance_conducteur_secondaire")
    private String dateNaissanceConducteurSecondaire;

    @Column(name = "id_ville_adresse_conducteur_secondaire")
    private String idVilleAdresseConducteurSecondaire;

    @Column(name = "id_pays_permis_conducteur_secondaire")
    private String idPaysPermisConducteurSecondaire;

    @Column(name = "profession_conducteur_secondaire")
    private String professionConducteurSecondaire;

    @Column(name = "titre_civilite_conducteur_secondaire")
    private String titreCiviliteConducteurSecondaire;

    @Column(name = "numero_permis_conducteur_secondaire")
    private String numeroPermisConducteurSecondaire;

    @Column(name = "date_obtention_permis_conducteur_secondaire")
    private String dateObtentionPermisConducteurSecondaire;

    @Column(name = "categorie_permis_conducteur_secondaire")
    private String categoriePermisConducteurSecondaire;

    @Column(name = "type_piece_identite_conducteur_secondaire")
    private String typePieceIdentiteConducteurSecondaire;

    @Column(name = "numero_client_conducteur_secondaire")
    private String numeroClientConducteurSecondaire;

    @Column(name = "type_client_tiers_conducteur_secondaire")
    private String typeClientTiersConducteurSecondaire;

    @Column(name = "code_intermediaire_tiers_conducteur_secondaire")
    private String codeIntermediaireTiersConducteurSecondaire;

    @Column(name = "code_usage_vehicule")
    private String codeUsageVehicule;

    @Column(name = "id_genre")
    private String idGenre;

    @Column(name = "type_immatriculation")
    private String typeImmatriculation;

    @Column(name = "immatriculation")
    private String immatriculation;

    @Column(name = "taux_crm")
    private String tauxCRM;

    @Column(name = "crm_manuel")
    private String crmManuel;

    @Column(name = "crm_fmsar")
    private String crmFMSAR;

    @Column(name = "avec_crm_manuel")
    private String avecCrmManuel;

    @Column(name = "marque")
    private String marque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "carburant")
    private String carburant;

    @Column(name = "puissance_fiscale")
    private int puissanceFiscale;

    @Column(name = "nombre_place")
    private String nombrePlace;

    @Column(name = "nombre_remorques_tractes")
    private int nombreRemorquesTractes;

    @Column(name = "valeur_a_neuf")
    private String valeurANeuf;

    @Column(name = "valeur_venale")
    private String valeurVenale;

    @Column(name = "vehicule_agarage")
    private String vehiculeAgarage;

    @Column(name = "ptc")
    private int ptc;

    @Column(name = "reference_crm_fmsar")
    private String referenceCRMFMSAR;

    @Column(name = "avec_delegation")
    private String avecDelegation;

    @Column(name = "avec_bareme_conventionnel")
    private String avecBaremeConventionnel;

    @Column(name = "numero_chassis")
    private String numeroChassis;

    @Column(name = "numero_cadre")
    private String numeroCadre;

    @Column(name = "numero_moteur")
    private String numeroMoteur;

    @Column(name = "avec_autre_immatriculation")
    private String avecAutreImmatriculation;

    @Column(name = "avec_modification_narsa")
    private String avecModificationNarsa;

    @Column(name = "avec_erreur_narsa")
    private String avecErreurNarsa;

    @Column(name = "avec_antivole")
    private String avecAntivole;

    @Column(name = "nature_contrat")
    private String natureContrat;

    @Column(name = "date_effet")
    private String dateEffet;

    @Column(name = "heure_effet")
    private String heureEffet;

    @Column(name = "date_echeance")
    private String dateEcheance;

    @Column(name = "heure_echeance")
    private String heureEcheance;

    @Column(name = "date_evenement")
    private String dateEvenement;

    @Column(name = "heure_evenement")
    private String heureEvenement;

    @Column(name = "duree")
    private String duree;

    @Column(name = "duree_contrat_en_jour")
    private int dureeContratEnJour;

    @Column(name = "date_effet_initiale")
    private String dateEffetInitiale;

    @Column(name = "date_etablissement")
    private String dateEtablissement;

    @Column(name = "mode_paiement")
    private String modePaiement;

    @Column(name = "numero_attestation")
    private String numeroAttestation;

    @Column(name = "format_attestation")
    private String formatAttestation;

    @Column(name = "type_contrat")
    private int typeContrat;

    @Column(name = "type_couverture")
    private String typeCouverture;

    @Column(name = "numero_attestation_provisoire")
    private String numeroAttestationProvisoire;

    @Column(name = "id_intermediaire")
    private int idIntermediaire;

    @Column(name = "type_evenement")
    private String typeEvenement;
    @Column(name = "idProduit")
    private String idProduit;
    @Column(name = "numeroDevis")
    private String numeroDevis;
    @Column(name = "souscripteurUpdated")
    private String souscripteurUpdated;
    @Column(name = "conducteurUpdated")
    private String conducteurUpdated;
    @Column(name = "conducteurSecondaireUpdated")
    private String conducteurSecondaireUpdated;

    public StoreDataFromChapeau() {
    }

    public StoreDataFromChapeau(int idObjetFromCh, String typeClient, String nomOrRaisonSociale, String prenom, String titreCivilite, String typePieceIdentite, String numeroPieceIdentite, String sexe, String situationFamiliale, String telephone, String email, String profession, String adresse, String dateNaissance, String idVilleAdresse, String numeroPermis, String dateObtentionPermis, String idPaysPermis, String numeroICE, String activite, String secteur, String gsm, String categoriePermis, String nombreEnfant, String clientConducteur, String numeroClient, String typeClientTiersSouscripteur, String codeIntermediaireTiersSouscripteur, String avecReductionSaharienne, String gsmConducteur, String numeroPieceIdentiteConducteur, String adresseConducteur, String telephoneConducteur, String emailConducteur, String nomOrRaisonSocialeConducteur, String prenomConducteur, String sexeConducteur, String situationFamilialeConducteur, String dateNaissanceConducteur, String idVilleAdresseConducteur, String idPaysPermisConducteur, String paysPermisConducteur, String professionConducteur, String titreCiviliteConducteur, String numeroPermisConducteur, String dateObtentionPermisConducteur, String categoriePermisConducteur, String typePieceIdentiteConducteur, String typeConducteur, String numeroClientConducteur, String typeClientTiersConducteur, String codeIntermediaireTiersConducteur, String gsmConducteurSecondaire, String numeroPieceIdentiteConducteurSecondaire, String adresseConducteurSecondaire, String telephoneConducteurSecondaire, String emailConducteurSecondaire, String nomOrRaisonSocialeConducteurSecondaire, String prenomConducteurSecondaire, String sexeConducteurSecondaire, String situationFamilialeConducteurSecondaire, String dateNaissanceConducteurSecondaire, String idVilleAdresseConducteurSecondaire, String idPaysPermisConducteurSecondaire, String professionConducteurSecondaire, String titreCiviliteConducteurSecondaire, String numeroPermisConducteurSecondaire, String dateObtentionPermisConducteurSecondaire, String categoriePermisConducteurSecondaire, String typePieceIdentiteConducteurSecondaire, String numeroClientConducteurSecondaire, String typeClientTiersConducteurSecondaire, String codeIntermediaireTiersConducteurSecondaire, String codeUsageVehicule, String idGenre, String typeImmatriculation, String immatriculation, String tauxCRM, String crmManuel, String crmFMSAR, String avecCrmManuel, String marque, String modele, String carburant, int puissanceFiscale, String nombrePlace, int nombreRemorquesTractes, String valeurANeuf, String valeurVenale, String vehiculeAgarage, int ptc, String referenceCRMFMSAR, String avecDelegation, String avecBaremeConventionnel, String numeroChassis, String numeroCadre, String numeroMoteur, String avecAutreImmatriculation, String avecModificationNarsa, String avecErreurNarsa, String avecAntivole, String natureContrat, String dateEffet, String heureEffet, String dateEcheance, String heureEcheance, String dateEvenement, String heureEvenement, String duree, int dureeContratEnJour, String dateEffetInitiale, String dateEtablissement, String modePaiement, String numeroAttestation, String formatAttestation, int typeContrat, String typeCouverture, String numeroAttestationProvisoire, int idIntermediaire, String typeEvenement, String idProduit, String numeroDevis, String souscripteurUpdated, String conducteurUpdated, String conducteurSecondaireUpdated) {
        this.idObjetFromCh = idObjetFromCh;
        this.typeClient = typeClient;
        this.nomOrRaisonSociale = nomOrRaisonSociale;
        this.prenom = prenom;
        this.titreCivilite = titreCivilite;
        this.typePieceIdentite = typePieceIdentite;
        this.numeroPieceIdentite = numeroPieceIdentite;
        this.sexe = sexe;
        this.situationFamiliale = situationFamiliale;
        this.telephone = telephone;
        this.email = email;
        this.profession = profession;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.idVilleAdresse = idVilleAdresse;
        this.numeroPermis = numeroPermis;
        this.dateObtentionPermis = dateObtentionPermis;
        this.idPaysPermis = idPaysPermis;
        this.numeroICE = numeroICE;
        this.activite = activite;
        this.secteur = secteur;
        this.gsm = gsm;
        this.categoriePermis = categoriePermis;
        this.nombreEnfant = nombreEnfant;
        this.clientConducteur = clientConducteur;
        this.numeroClient = numeroClient;
        this.typeClientTiersSouscripteur = typeClientTiersSouscripteur;
        this.codeIntermediaireTiersSouscripteur = codeIntermediaireTiersSouscripteur;
        this.avecReductionSaharienne = avecReductionSaharienne;
        this.gsmConducteur = gsmConducteur;
        this.numeroPieceIdentiteConducteur = numeroPieceIdentiteConducteur;
        this.adresseConducteur = adresseConducteur;
        this.telephoneConducteur = telephoneConducteur;
        this.emailConducteur = emailConducteur;
        this.nomOrRaisonSocialeConducteur = nomOrRaisonSocialeConducteur;
        this.prenomConducteur = prenomConducteur;
        this.sexeConducteur = sexeConducteur;
        this.situationFamilialeConducteur = situationFamilialeConducteur;
        this.dateNaissanceConducteur = dateNaissanceConducteur;
        this.idVilleAdresseConducteur = idVilleAdresseConducteur;
        this.idPaysPermisConducteur = idPaysPermisConducteur;
        this.paysPermisConducteur = paysPermisConducteur;
        this.professionConducteur = professionConducteur;
        this.titreCiviliteConducteur = titreCiviliteConducteur;
        this.numeroPermisConducteur = numeroPermisConducteur;
        this.dateObtentionPermisConducteur = dateObtentionPermisConducteur;
        this.categoriePermisConducteur = categoriePermisConducteur;
        this.typePieceIdentiteConducteur = typePieceIdentiteConducteur;
        this.typeConducteur = typeConducteur;
        this.numeroClientConducteur = numeroClientConducteur;
        this.typeClientTiersConducteur = typeClientTiersConducteur;
        this.codeIntermediaireTiersConducteur = codeIntermediaireTiersConducteur;
        this.gsmConducteurSecondaire = gsmConducteurSecondaire;
        this.numeroPieceIdentiteConducteurSecondaire = numeroPieceIdentiteConducteurSecondaire;
        this.adresseConducteurSecondaire = adresseConducteurSecondaire;
        this.telephoneConducteurSecondaire = telephoneConducteurSecondaire;
        this.emailConducteurSecondaire = emailConducteurSecondaire;
        this.nomOrRaisonSocialeConducteurSecondaire = nomOrRaisonSocialeConducteurSecondaire;
        this.prenomConducteurSecondaire = prenomConducteurSecondaire;
        this.sexeConducteurSecondaire = sexeConducteurSecondaire;
        this.situationFamilialeConducteurSecondaire = situationFamilialeConducteurSecondaire;
        this.dateNaissanceConducteurSecondaire = dateNaissanceConducteurSecondaire;
        this.idVilleAdresseConducteurSecondaire = idVilleAdresseConducteurSecondaire;
        this.idPaysPermisConducteurSecondaire = idPaysPermisConducteurSecondaire;
        this.professionConducteurSecondaire = professionConducteurSecondaire;
        this.titreCiviliteConducteurSecondaire = titreCiviliteConducteurSecondaire;
        this.numeroPermisConducteurSecondaire = numeroPermisConducteurSecondaire;
        this.dateObtentionPermisConducteurSecondaire = dateObtentionPermisConducteurSecondaire;
        this.categoriePermisConducteurSecondaire = categoriePermisConducteurSecondaire;
        this.typePieceIdentiteConducteurSecondaire = typePieceIdentiteConducteurSecondaire;
        this.numeroClientConducteurSecondaire = numeroClientConducteurSecondaire;
        this.typeClientTiersConducteurSecondaire = typeClientTiersConducteurSecondaire;
        this.codeIntermediaireTiersConducteurSecondaire = codeIntermediaireTiersConducteurSecondaire;
        this.codeUsageVehicule = codeUsageVehicule;
        this.idGenre = idGenre;
        this.typeImmatriculation = typeImmatriculation;
        this.immatriculation = immatriculation;
        this.tauxCRM = tauxCRM;
        this.crmManuel = crmManuel;
        this.crmFMSAR = crmFMSAR;
        this.avecCrmManuel = avecCrmManuel;
        this.marque = marque;
        this.modele = modele;
        this.carburant = carburant;
        this.puissanceFiscale = puissanceFiscale;
        this.nombrePlace = nombrePlace;
        this.nombreRemorquesTractes = nombreRemorquesTractes;
        this.valeurANeuf = valeurANeuf;
        this.valeurVenale = valeurVenale;
        this.vehiculeAgarage = vehiculeAgarage;
        this.ptc = ptc;
        this.referenceCRMFMSAR = referenceCRMFMSAR;
        this.avecDelegation = avecDelegation;
        this.avecBaremeConventionnel = avecBaremeConventionnel;
        this.numeroChassis = numeroChassis;
        this.numeroCadre = numeroCadre;
        this.numeroMoteur = numeroMoteur;
        this.avecAutreImmatriculation = avecAutreImmatriculation;
        this.avecModificationNarsa = avecModificationNarsa;
        this.avecErreurNarsa = avecErreurNarsa;
        this.avecAntivole = avecAntivole;
        this.natureContrat = natureContrat;
        this.dateEffet = dateEffet;
        this.heureEffet = heureEffet;
        this.dateEcheance = dateEcheance;
        this.heureEcheance = heureEcheance;
        this.dateEvenement = dateEvenement;
        this.heureEvenement = heureEvenement;
        this.duree = duree;
        this.dureeContratEnJour = dureeContratEnJour;
        this.dateEffetInitiale = dateEffetInitiale;
        this.dateEtablissement = dateEtablissement;
        this.modePaiement = modePaiement;
        this.numeroAttestation = numeroAttestation;
        this.formatAttestation = formatAttestation;
        this.typeContrat = typeContrat;
        this.typeCouverture = typeCouverture;
        this.numeroAttestationProvisoire = numeroAttestationProvisoire;
        this.idIntermediaire = idIntermediaire;
        this.typeEvenement = typeEvenement;
        this.idProduit = idProduit;
        this.numeroDevis = numeroDevis;
        this.souscripteurUpdated = souscripteurUpdated;
        this.conducteurUpdated = conducteurUpdated;
        this.conducteurSecondaireUpdated = conducteurSecondaireUpdated;
    }

    public int getIdObjetFromCh() {
        return idObjetFromCh;
    }

    public void setIdObjetFromCh(int idObjetFromCh) {
        this.idObjetFromCh = idObjetFromCh;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public String getNomOrRaisonSociale() {
        return nomOrRaisonSociale;
    }

    public void setNomOrRaisonSociale(String nomOrRaisonSociale) {
        this.nomOrRaisonSociale = nomOrRaisonSociale;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTitreCivilite() {
        return titreCivilite;
    }

    public void setTitreCivilite(String titreCivilite) {
        this.titreCivilite = titreCivilite;
    }

    public String getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public void setTypePieceIdentite(String typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getNumeroPieceIdentite() {
        return numeroPieceIdentite;
    }

    public void setNumeroPieceIdentite(String numeroPieceIdentite) {
        this.numeroPieceIdentite = numeroPieceIdentite;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(String situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getIdVilleAdresse() {
        return idVilleAdresse;
    }

    public void setIdVilleAdresse(String idVilleAdresse) {
        this.idVilleAdresse = idVilleAdresse;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public String getDateObtentionPermis() {
        return dateObtentionPermis;
    }

    public void setDateObtentionPermis(String dateObtentionPermis) {
        this.dateObtentionPermis = dateObtentionPermis;
    }

    public String getIdPaysPermis() {
        return idPaysPermis;
    }

    public void setIdPaysPermis(String idPaysPermis) {
        this.idPaysPermis = idPaysPermis;
    }

    public String getNumeroICE() {
        return numeroICE;
    }

    public void setNumeroICE(String numeroICE) {
        this.numeroICE = numeroICE;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getCategoriePermis() {
        return categoriePermis;
    }

    public void setCategoriePermis(String categoriePermis) {
        this.categoriePermis = categoriePermis;
    }

    public String getNombreEnfant() {
        return nombreEnfant;
    }

    public void setNombreEnfant(String nombreEnfant) {
        this.nombreEnfant = nombreEnfant;
    }

    public String getClientConducteur() {
        return clientConducteur;
    }

    public void setClientConducteur(String clientConducteur) {
        this.clientConducteur = clientConducteur;
    }

    public String getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(String numeroClient) {
        this.numeroClient = numeroClient;
    }

    public String getTypeClientTiersSouscripteur() {
        return typeClientTiersSouscripteur;
    }

    public void setTypeClientTiersSouscripteur(String typeClientTiersSouscripteur) {
        this.typeClientTiersSouscripteur = typeClientTiersSouscripteur;
    }

    public String getCodeIntermediaireTiersSouscripteur() {
        return codeIntermediaireTiersSouscripteur;
    }

    public void setCodeIntermediaireTiersSouscripteur(String codeIntermediaireTiersSouscripteur) {
        this.codeIntermediaireTiersSouscripteur = codeIntermediaireTiersSouscripteur;
    }

    public String getAvecReductionSaharienne() {
        return avecReductionSaharienne;
    }

    public void setAvecReductionSaharienne(String avecReductionSaharienne) {
        this.avecReductionSaharienne = avecReductionSaharienne;
    }

    public String getGsmConducteur() {
        return gsmConducteur;
    }

    public void setGsmConducteur(String gsmConducteur) {
        this.gsmConducteur = gsmConducteur;
    }

    public String getNumeroPieceIdentiteConducteur() {
        return numeroPieceIdentiteConducteur;
    }

    public void setNumeroPieceIdentiteConducteur(String numeroPieceIdentiteConducteur) {
        this.numeroPieceIdentiteConducteur = numeroPieceIdentiteConducteur;
    }

    public String getAdresseConducteur() {
        return adresseConducteur;
    }

    public void setAdresseConducteur(String adresseConducteur) {
        this.adresseConducteur = adresseConducteur;
    }

    public String getTelephoneConducteur() {
        return telephoneConducteur;
    }

    public void setTelephoneConducteur(String telephoneConducteur) {
        this.telephoneConducteur = telephoneConducteur;
    }

    public String getEmailConducteur() {
        return emailConducteur;
    }

    public void setEmailConducteur(String emailConducteur) {
        this.emailConducteur = emailConducteur;
    }

    public String getNomOrRaisonSocialeConducteur() {
        return nomOrRaisonSocialeConducteur;
    }

    public void setNomOrRaisonSocialeConducteur(String nomOrRaisonSocialeConducteur) {
        this.nomOrRaisonSocialeConducteur = nomOrRaisonSocialeConducteur;
    }

    public String getPrenomConducteur() {
        return prenomConducteur;
    }

    public void setPrenomConducteur(String prenomConducteur) {
        this.prenomConducteur = prenomConducteur;
    }

    public String getSexeConducteur() {
        return sexeConducteur;
    }

    public void setSexeConducteur(String sexeConducteur) {
        this.sexeConducteur = sexeConducteur;
    }

    public String getSituationFamilialeConducteur() {
        return situationFamilialeConducteur;
    }

    public void setSituationFamilialeConducteur(String situationFamilialeConducteur) {
        this.situationFamilialeConducteur = situationFamilialeConducteur;
    }

    public String getDateNaissanceConducteur() {
        return dateNaissanceConducteur;
    }

    public void setDateNaissanceConducteur(String dateNaissanceConducteur) {
        this.dateNaissanceConducteur = dateNaissanceConducteur;
    }

    public String getIdVilleAdresseConducteur() {
        return idVilleAdresseConducteur;
    }

    public void setIdVilleAdresseConducteur(String idVilleAdresseConducteur) {
        this.idVilleAdresseConducteur = idVilleAdresseConducteur;
    }

    public String getIdPaysPermisConducteur() {
        return idPaysPermisConducteur;
    }

    public void setIdPaysPermisConducteur(String idPaysPermisConducteur) {
        this.idPaysPermisConducteur = idPaysPermisConducteur;
    }

    public String getPaysPermisConducteur() {
        return paysPermisConducteur;
    }

    public void setPaysPermisConducteur(String paysPermisConducteur) {
        this.paysPermisConducteur = paysPermisConducteur;
    }

    public String getProfessionConducteur() {
        return professionConducteur;
    }

    public void setProfessionConducteur(String professionConducteur) {
        this.professionConducteur = professionConducteur;
    }

    public String getTitreCiviliteConducteur() {
        return titreCiviliteConducteur;
    }

    public void setTitreCiviliteConducteur(String titreCiviliteConducteur) {
        this.titreCiviliteConducteur = titreCiviliteConducteur;
    }

    public String getNumeroPermisConducteur() {
        return numeroPermisConducteur;
    }

    public void setNumeroPermisConducteur(String numeroPermisConducteur) {
        this.numeroPermisConducteur = numeroPermisConducteur;
    }

    public String getDateObtentionPermisConducteur() {
        return dateObtentionPermisConducteur;
    }

    public void setDateObtentionPermisConducteur(String dateObtentionPermisConducteur) {
        this.dateObtentionPermisConducteur = dateObtentionPermisConducteur;
    }

    public String getCategoriePermisConducteur() {
        return categoriePermisConducteur;
    }

    public void setCategoriePermisConducteur(String categoriePermisConducteur) {
        this.categoriePermisConducteur = categoriePermisConducteur;
    }

    public String getTypePieceIdentiteConducteur() {
        return typePieceIdentiteConducteur;
    }

    public void setTypePieceIdentiteConducteur(String typePieceIdentiteConducteur) {
        this.typePieceIdentiteConducteur = typePieceIdentiteConducteur;
    }

    public String getTypeConducteur() {
        return typeConducteur;
    }

    public void setTypeConducteur(String typeConducteur) {
        this.typeConducteur = typeConducteur;
    }

    public String getNumeroClientConducteur() {
        return numeroClientConducteur;
    }

    public void setNumeroClientConducteur(String numeroClientConducteur) {
        this.numeroClientConducteur = numeroClientConducteur;
    }

    public String getTypeClientTiersConducteur() {
        return typeClientTiersConducteur;
    }

    public void setTypeClientTiersConducteur(String typeClientTiersConducteur) {
        this.typeClientTiersConducteur = typeClientTiersConducteur;
    }

    public String getCodeIntermediaireTiersConducteur() {
        return codeIntermediaireTiersConducteur;
    }

    public void setCodeIntermediaireTiersConducteur(String codeIntermediaireTiersConducteur) {
        this.codeIntermediaireTiersConducteur = codeIntermediaireTiersConducteur;
    }

    public String getGsmConducteurSecondaire() {
        return gsmConducteurSecondaire;
    }

    public void setGsmConducteurSecondaire(String gsmConducteurSecondaire) {
        this.gsmConducteurSecondaire = gsmConducteurSecondaire;
    }

    public String getNumeroPieceIdentiteConducteurSecondaire() {
        return numeroPieceIdentiteConducteurSecondaire;
    }

    public void setNumeroPieceIdentiteConducteurSecondaire(String numeroPieceIdentiteConducteurSecondaire) {
        this.numeroPieceIdentiteConducteurSecondaire = numeroPieceIdentiteConducteurSecondaire;
    }

    public String getAdresseConducteurSecondaire() {
        return adresseConducteurSecondaire;
    }

    public void setAdresseConducteurSecondaire(String adresseConducteurSecondaire) {
        this.adresseConducteurSecondaire = adresseConducteurSecondaire;
    }

    public String getTelephoneConducteurSecondaire() {
        return telephoneConducteurSecondaire;
    }

    public void setTelephoneConducteurSecondaire(String telephoneConducteurSecondaire) {
        this.telephoneConducteurSecondaire = telephoneConducteurSecondaire;
    }

    public String getEmailConducteurSecondaire() {
        return emailConducteurSecondaire;
    }

    public void setEmailConducteurSecondaire(String emailConducteurSecondaire) {
        this.emailConducteurSecondaire = emailConducteurSecondaire;
    }

    public String getNomOrRaisonSocialeConducteurSecondaire() {
        return nomOrRaisonSocialeConducteurSecondaire;
    }

    public void setNomOrRaisonSocialeConducteurSecondaire(String nomOrRaisonSocialeConducteurSecondaire) {
        this.nomOrRaisonSocialeConducteurSecondaire = nomOrRaisonSocialeConducteurSecondaire;
    }

    public String getPrenomConducteurSecondaire() {
        return prenomConducteurSecondaire;
    }

    public void setPrenomConducteurSecondaire(String prenomConducteurSecondaire) {
        this.prenomConducteurSecondaire = prenomConducteurSecondaire;
    }

    public String getSexeConducteurSecondaire() {
        return sexeConducteurSecondaire;
    }

    public void setSexeConducteurSecondaire(String sexeConducteurSecondaire) {
        this.sexeConducteurSecondaire = sexeConducteurSecondaire;
    }

    public String getSituationFamilialeConducteurSecondaire() {
        return situationFamilialeConducteurSecondaire;
    }

    public void setSituationFamilialeConducteurSecondaire(String situationFamilialeConducteurSecondaire) {
        this.situationFamilialeConducteurSecondaire = situationFamilialeConducteurSecondaire;
    }

    public String getDateNaissanceConducteurSecondaire() {
        return dateNaissanceConducteurSecondaire;
    }

    public void setDateNaissanceConducteurSecondaire(String dateNaissanceConducteurSecondaire) {
        this.dateNaissanceConducteurSecondaire = dateNaissanceConducteurSecondaire;
    }

    public String getIdVilleAdresseConducteurSecondaire() {
        return idVilleAdresseConducteurSecondaire;
    }

    public void setIdVilleAdresseConducteurSecondaire(String idVilleAdresseConducteurSecondaire) {
        this.idVilleAdresseConducteurSecondaire = idVilleAdresseConducteurSecondaire;
    }

    public String getIdPaysPermisConducteurSecondaire() {
        return idPaysPermisConducteurSecondaire;
    }

    public void setIdPaysPermisConducteurSecondaire(String idPaysPermisConducteurSecondaire) {
        this.idPaysPermisConducteurSecondaire = idPaysPermisConducteurSecondaire;
    }

    public String getProfessionConducteurSecondaire() {
        return professionConducteurSecondaire;
    }

    public void setProfessionConducteurSecondaire(String professionConducteurSecondaire) {
        this.professionConducteurSecondaire = professionConducteurSecondaire;
    }

    public String getTitreCiviliteConducteurSecondaire() {
        return titreCiviliteConducteurSecondaire;
    }

    public void setTitreCiviliteConducteurSecondaire(String titreCiviliteConducteurSecondaire) {
        this.titreCiviliteConducteurSecondaire = titreCiviliteConducteurSecondaire;
    }

    public String getNumeroPermisConducteurSecondaire() {
        return numeroPermisConducteurSecondaire;
    }

    public void setNumeroPermisConducteurSecondaire(String numeroPermisConducteurSecondaire) {
        this.numeroPermisConducteurSecondaire = numeroPermisConducteurSecondaire;
    }

    public String getDateObtentionPermisConducteurSecondaire() {
        return dateObtentionPermisConducteurSecondaire;
    }

    public void setDateObtentionPermisConducteurSecondaire(String dateObtentionPermisConducteurSecondaire) {
        this.dateObtentionPermisConducteurSecondaire = dateObtentionPermisConducteurSecondaire;
    }

    public String getCategoriePermisConducteurSecondaire() {
        return categoriePermisConducteurSecondaire;
    }

    public void setCategoriePermisConducteurSecondaire(String categoriePermisConducteurSecondaire) {
        this.categoriePermisConducteurSecondaire = categoriePermisConducteurSecondaire;
    }

    public String getTypePieceIdentiteConducteurSecondaire() {
        return typePieceIdentiteConducteurSecondaire;
    }

    public void setTypePieceIdentiteConducteurSecondaire(String typePieceIdentiteConducteurSecondaire) {
        this.typePieceIdentiteConducteurSecondaire = typePieceIdentiteConducteurSecondaire;
    }

    public String getNumeroClientConducteurSecondaire() {
        return numeroClientConducteurSecondaire;
    }

    public void setNumeroClientConducteurSecondaire(String numeroClientConducteurSecondaire) {
        this.numeroClientConducteurSecondaire = numeroClientConducteurSecondaire;
    }

    public String getTypeClientTiersConducteurSecondaire() {
        return typeClientTiersConducteurSecondaire;
    }

    public void setTypeClientTiersConducteurSecondaire(String typeClientTiersConducteurSecondaire) {
        this.typeClientTiersConducteurSecondaire = typeClientTiersConducteurSecondaire;
    }

    public String getCodeIntermediaireTiersConducteurSecondaire() {
        return codeIntermediaireTiersConducteurSecondaire;
    }

    public void setCodeIntermediaireTiersConducteurSecondaire(String codeIntermediaireTiersConducteurSecondaire) {
        this.codeIntermediaireTiersConducteurSecondaire = codeIntermediaireTiersConducteurSecondaire;
    }

    public String getCodeUsageVehicule() {
        return codeUsageVehicule;
    }

    public void setCodeUsageVehicule(String codeUsageVehicule) {
        this.codeUsageVehicule = codeUsageVehicule;
    }

    public String getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(String idGenre) {
        this.idGenre = idGenre;
    }

    public String getTypeImmatriculation() {
        return typeImmatriculation;
    }

    public void setTypeImmatriculation(String typeImmatriculation) {
        this.typeImmatriculation = typeImmatriculation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getTauxCRM() {
        return tauxCRM;
    }

    public void setTauxCRM(String tauxCRM) {
        this.tauxCRM = tauxCRM;
    }

    public String getCrmManuel() {
        return crmManuel;
    }

    public void setCrmManuel(String crmManuel) {
        this.crmManuel = crmManuel;
    }

    public String getCrmFMSAR() {
        return crmFMSAR;
    }

    public void setCrmFMSAR(String crmFMSAR) {
        this.crmFMSAR = crmFMSAR;
    }

    public String getAvecCrmManuel() {
        return avecCrmManuel;
    }

    public void setAvecCrmManuel(String avecCrmManuel) {
        this.avecCrmManuel = avecCrmManuel;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getPuissanceFiscale() {
        return puissanceFiscale;
    }

    public void setPuissanceFiscale(int puissanceFiscale) {
        this.puissanceFiscale = puissanceFiscale;
    }

    public String getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(String nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public int getNombreRemorquesTractes() {
        return nombreRemorquesTractes;
    }

    public void setNombreRemorquesTractes(int nombreRemorquesTractes) {
        this.nombreRemorquesTractes = nombreRemorquesTractes;
    }

    public String getValeurANeuf() {
        return valeurANeuf;
    }

    public void setValeurANeuf(String valeurANeuf) {
        this.valeurANeuf = valeurANeuf;
    }

    public String getValeurVenale() {
        return valeurVenale;
    }

    public void setValeurVenale(String valeurVenale) {
        this.valeurVenale = valeurVenale;
    }

    public String getVehiculeAgarage() {
        return vehiculeAgarage;
    }

    public void setVehiculeAgarage(String vehiculeAgarage) {
        this.vehiculeAgarage = vehiculeAgarage;
    }

    public int getPtc() {
        return ptc;
    }

    public void setPtc(int ptc) {
        this.ptc = ptc;
    }

    public String getReferenceCRMFMSAR() {
        return referenceCRMFMSAR;
    }

    public void setReferenceCRMFMSAR(String referenceCRMFMSAR) {
        this.referenceCRMFMSAR = referenceCRMFMSAR;
    }

    public String getAvecDelegation() {
        return avecDelegation;
    }

    public void setAvecDelegation(String avecDelegation) {
        this.avecDelegation = avecDelegation;
    }

    public String getAvecBaremeConventionnel() {
        return avecBaremeConventionnel;
    }

    public void setAvecBaremeConventionnel(String avecBaremeConventionnel) {
        this.avecBaremeConventionnel = avecBaremeConventionnel;
    }

    public String getNumeroChassis() {
        return numeroChassis;
    }

    public void setNumeroChassis(String numeroChassis) {
        this.numeroChassis = numeroChassis;
    }

    public String getNumeroCadre() {
        return numeroCadre;
    }

    public void setNumeroCadre(String numeroCadre) {
        this.numeroCadre = numeroCadre;
    }

    public String getNumeroMoteur() {
        return numeroMoteur;
    }

    public void setNumeroMoteur(String numeroMoteur) {
        this.numeroMoteur = numeroMoteur;
    }

    public String getAvecAutreImmatriculation() {
        return avecAutreImmatriculation;
    }

    public void setAvecAutreImmatriculation(String avecAutreImmatriculation) {
        this.avecAutreImmatriculation = avecAutreImmatriculation;
    }

    public String getAvecModificationNarsa() {
        return avecModificationNarsa;
    }

    public void setAvecModificationNarsa(String avecModificationNarsa) {
        this.avecModificationNarsa = avecModificationNarsa;
    }

    public String getAvecErreurNarsa() {
        return avecErreurNarsa;
    }

    public void setAvecErreurNarsa(String avecErreurNarsa) {
        this.avecErreurNarsa = avecErreurNarsa;
    }

    public String getAvecAntivole() {
        return avecAntivole;
    }

    public void setAvecAntivole(String avecAntivole) {
        this.avecAntivole = avecAntivole;
    }

    public String getNatureContrat() {
        return natureContrat;
    }

    public void setNatureContrat(String natureContrat) {
        this.natureContrat = natureContrat;
    }

    public String getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
    }

    public String getHeureEffet() {
        return heureEffet;
    }

    public void setHeureEffet(String heureEffet) {
        this.heureEffet = heureEffet;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getHeureEcheance() {
        return heureEcheance;
    }

    public void setHeureEcheance(String heureEcheance) {
        this.heureEcheance = heureEcheance;
    }

    public String getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(String dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getHeureEvenement() {
        return heureEvenement;
    }

    public void setHeureEvenement(String heureEvenement) {
        this.heureEvenement = heureEvenement;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getDureeContratEnJour() {
        return dureeContratEnJour;
    }

    public void setDureeContratEnJour(int dureeContratEnJour) {
        this.dureeContratEnJour = dureeContratEnJour;
    }

    public String getDateEffetInitiale() {
        return dateEffetInitiale;
    }

    public void setDateEffetInitiale(String dateEffetInitiale) {
        this.dateEffetInitiale = dateEffetInitiale;
    }

    public String getDateEtablissement() {
        return dateEtablissement;
    }

    public void setDateEtablissement(String dateEtablissement) {
        this.dateEtablissement = dateEtablissement;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getNumeroAttestation() {
        return numeroAttestation;
    }

    public void setNumeroAttestation(String numeroAttestation) {
        this.numeroAttestation = numeroAttestation;
    }

    public String getFormatAttestation() {
        return formatAttestation;
    }

    public void setFormatAttestation(String formatAttestation) {
        this.formatAttestation = formatAttestation;
    }

    public int getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(int typeContrat) {
        this.typeContrat = typeContrat;
    }

    public String getTypeCouverture() {
        return typeCouverture;
    }

    public void setTypeCouverture(String typeCouverture) {
        this.typeCouverture = typeCouverture;
    }

    public String getNumeroAttestationProvisoire() {
        return numeroAttestationProvisoire;
    }

    public void setNumeroAttestationProvisoire(String numeroAttestationProvisoire) {
        this.numeroAttestationProvisoire = numeroAttestationProvisoire;
    }

    public int getIdIntermediaire() {
        return idIntermediaire;
    }

    public void setIdIntermediaire(int idIntermediaire) {
        this.idIntermediaire = idIntermediaire;
    }

    public String getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(String typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getNumeroDevis() {
        return numeroDevis;
    }

    public void setNumeroDevis(String numeroDevis) {
        this.numeroDevis = numeroDevis;
    }

    public String getSouscripteurUpdated() {
        return souscripteurUpdated;
    }

    public void setSouscripteurUpdated(String souscripteurUpdated) {
        this.souscripteurUpdated = souscripteurUpdated;
    }

    public String getConducteurUpdated() {
        return conducteurUpdated;
    }

    public void setConducteurUpdated(String conducteurUpdated) {
        this.conducteurUpdated = conducteurUpdated;
    }

    public String getConducteurSecondaireUpdated() {
        return conducteurSecondaireUpdated;
    }

    public void setConducteurSecondaireUpdated(String conducteurSecondaireUpdated) {
        this.conducteurSecondaireUpdated = conducteurSecondaireUpdated;
    }
}
