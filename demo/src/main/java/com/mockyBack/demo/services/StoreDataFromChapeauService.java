package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.StoreDataFromChapeau;
import com.mockyBack.demo.repositories.StoreDataFromChapeauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreDataFromChapeauService {
    @Autowired
    private StoreDataFromChapeauRepository repository;

    public StoreDataFromChapeau create(StoreDataFromChapeau data) {
        return repository.save(data);
    }

    public List<StoreDataFromChapeau> findAll() {
        return repository.findAll();
    }

    public StoreDataFromChapeau findById(int id) {
        return repository.findById(id).orElse(null);
    }

    public StoreDataFromChapeau update(int id, StoreDataFromChapeau data) {
        StoreDataFromChapeau existingData = repository.findById(id).orElse(null);
        if (existingData != null) {
            data.setIdObjetFromCh(id);
            return repository.save(data);
        }
        return null;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<StoreDataFromChapeau> getCleanData() {
        List<StoreDataFromChapeau> dataList = repository.findAll();
        for (StoreDataFromChapeau data : dataList) {
            if (data.getPtc() == 0) {
                data.setPtc(0);
            }
            // cleani les champs lakhrin
        }
        return dataList;
    }

    public double calculatePrice(StoreDataFromChapeau data) {
        double basePrice = 1000.0;

        if ("92".equals(data.getCodeUsageVehicule())) {
            basePrice += 500.0;
        }
        if (data.getPtc() == 0) {
            basePrice += 200.0;
        }
        // Nouveaux critères
        if (data.getPuissanceFiscale() >= 6 && data.getPuissanceFiscale() <= 12) {
            basePrice += 300.0; // Par exemple, ajouter 300.0 si la puissance fiscale est entre 6 et 12
        }
        if (data.getPtc() >= 250 && data.getPtc() <= 999000) {
            basePrice += 400.0; // Par exemple, ajouter 400.0 si le PTC est entre 250 et 999000
        }
        // Vérifier si c'est avec ou sans remorque nombreRemorquesTractes
        if (data.getNombreRemorquesTractes()!=0) {
            basePrice += 100.0; // Par exemple, ajouter 100.0 s'il y a une remorque
        }
        return basePrice;
    }

    // Méthode pour inspecter le payload
    public Object inspectPayload(StoreDataFromChapeau payload) {
        System.out.println(
                "\n" + "typeClient: " + payload.getTypeClient() + "\n" +
                        "nomOrRaisonSociale: " + payload.getNomOrRaisonSociale() + "\n" +
                        "prenom: " + payload.getPrenom() + "\n" +
                        "titreCivilite: " + payload.getTitreCivilite() + "\n" +
                        "typePieceIdentite: " + payload.getTypePieceIdentite() + "\n" +
                        "numeroPieceIdentite: " + payload.getNumeroPieceIdentite() + "\n" +
                        "sexe: " + payload.getSexe() + "\n" +
                        "situationFamiliale: " + payload.getSituationFamiliale() + "\n" +
                        "telephone: " + payload.getTelephone() + "\n" +
                        "email: " + payload.getEmail() + "\n" +
                        "profession: " + payload.getProfession() + "\n" +
                        "adresse: " + payload.getAdresse() + "\n" +
                        "dateNaissance: " + payload.getDateNaissance() + "\n" +
                        "idVilleAdresse: " + payload.getIdVilleAdresse() + "\n" +
                        "numeroPermis: " + payload.getNumeroPermis() + "\n" +
                        "dateObtentionPermis: " + payload.getDateObtentionPermis() + "\n" +
                        "idPaysPermis: " + payload.getIdPaysPermis() + "\n"+
                        "numeroICE: " + payload.getNumeroICE() + "\n" +
                        "activite: " + payload.getActivite() + "\n" +
                        "secteur: " + payload.getSecteur() + "\n" +
                        "gsm: " + payload.getGsm() + "\n" +
                        "categoriePermis: " + payload.getCategoriePermis() + "\n" +
                        "nombreEnfant: " + payload.getNombreEnfant() + "\n" +
                        "clientConducteur: " + payload.getClientConducteur() + "\n" +
                        "numeroClient: " + payload.getNumeroClient() + "\n" +
                        "typeClientTiersSouscripteur: " + payload.getTypeClientTiersSouscripteur() + "\n" +
                        "codeIntermediaireTiersSouscripteur: " + payload.getCodeIntermediaireTiersSouscripteur() + "\n" +
                        "avecReductionSaharienne: " + payload.getAvecReductionSaharienne() + "\n" +
                        "gsmConducteur: " + payload.getGsmConducteur() + "\n" +
                        "numeroPieceIdentiteConducteur: " + payload.getNumeroPieceIdentiteConducteur() + "\n" +
                        "adresseConducteur: " + payload.getAdresseConducteur() + "\n" +
                        "telephoneConducteur: " + payload.getTelephoneConducteur() + "\n" +
                        "emailConducteur: " + payload.getEmailConducteur() + "\n" +
                        "nomOrRaisonSocialeConducteur: " + payload.getNomOrRaisonSocialeConducteur() + "\n" +
                        "prenomConducteur: " + payload.getPrenomConducteur() + "\n" +
                        "sexeConducteur: " + payload.getSexeConducteur() + "\n" +
                        "situationFamilialeConducteur: " + payload.getSituationFamilialeConducteur() + "\n" +
                        "dateNaissanceConducteur: " + payload.getDateNaissanceConducteur() + "\n" +
                        "idVilleAdresseConducteur: " + payload.getIdVilleAdresseConducteur() + "\n" +
                        "idPaysPermisConducteur: " + payload.getIdPaysPermisConducteur() + "\n" +
                        "paysPermisConducteur: " + payload.getPaysPermisConducteur() + "\n" +
                        "professionConducteur: " + payload.getProfessionConducteur() + "\n" +
                        "titreCiviliteConducteur: " + payload.getTitreCiviliteConducteur() + "\n" +
                        "numeroPermisConducteur: " + payload.getNumeroPermisConducteur() + "\n" +
                        "dateObtentionPermisConducteur: " + payload.getDateObtentionPermisConducteur() + "\n" +
                        "categoriePermisConducteur: " + payload.getCategoriePermisConducteur() + "\n" +
                        "typePieceIdentiteConducteur: " + payload.getTypePieceIdentiteConducteur() + "\n" +
                        "typeConducteur: " + payload.getTypeConducteur() + "\n" +
                        "numeroClientConducteur: " + payload.getNumeroClientConducteur() + "\n" +
                        "typeClientTiersConducteur: " + payload.getTypeClientTiersConducteur() + "\n" +
                        "codeIntermediaireTiersConducteur: " + payload.getCodeIntermediaireTiersConducteur() + "\n" +
                        "gsmConducteurSecondaire: " + payload.getGsmConducteurSecondaire() + "\n" +
                        "numeroPieceIdentiteConducteurSecondaire: " + payload.getNumeroPieceIdentiteConducteurSecondaire() + "\n" +
                        "adresseConducteurSecondaire: " + payload.getAdresseConducteurSecondaire() + "\n" +
                        "telephoneConducteurSecondaire: " + payload.getTelephoneConducteurSecondaire() + "\n" +
                        "emailConducteurSecondaire: " + payload.getEmailConducteurSecondaire() + "\n" +
                        "nomOrRaisonSocialeConducteurSecondaire: " + payload.getNomOrRaisonSocialeConducteurSecondaire() + "\n" +
                        "prenomConducteurSecondaire: " + payload.getPrenomConducteurSecondaire() + "\n" +
                        "sexeConducteurSecondaire: " + payload.getSexeConducteurSecondaire() + "\n" +
                        "situationFamilialeConducteurSecondaire: " + payload.getSituationFamilialeConducteurSecondaire() + "\n" +
                        "dateNaissanceConducteurSecondaire: " + payload.getDateNaissanceConducteurSecondaire() + "\n" +
                        "idVilleAdresseConducteurSecondaire: " + payload.getIdVilleAdresseConducteurSecondaire() + "\n" +
                        "idPaysPermisConducteurSecondaire: " + payload.getIdPaysPermisConducteurSecondaire() + "\n" +
                        "professionConducteurSecondaire: " + payload.getProfessionConducteurSecondaire() + "\n" +
                        "titreCiviliteConducteurSecondaire: " + payload.getTitreCiviliteConducteurSecondaire() + "\n" +
                        "numeroPermisConducteurSecondaire: " + payload.getNumeroPermisConducteurSecondaire() + "\n" +
                        "dateObtentionPermisConducteurSecondaire: " + payload.getDateObtentionPermisConducteurSecondaire() + "\n" +
                        "categoriePermisConducteurSecondaire: " + payload.getCategoriePermisConducteurSecondaire() + "\n" +
                        "typePieceIdentiteConducteurSecondaire: " + payload.getTypePieceIdentiteConducteurSecondaire() + "\n" +
                        "numeroClientConducteurSecondaire: " + payload.getNumeroClientConducteurSecondaire() + "\n" +
                        "typeClientTiersConducteurSecondaire: " + payload.getTypeClientTiersConducteurSecondaire() + "\n" +
                        "codeIntermediaireTiersConducteurSecondaire: " + payload.getCodeIntermediaireTiersConducteurSecondaire() + "\n" +
                        "codeUsageVehicule: " + payload.getCodeUsageVehicule() + "\n" +
                        "idGenre: " + payload.getIdGenre() + "\n" +
                        "typeImmatriculation: " + payload.getTypeImmatriculation() + "\n" +
                        "immatriculation: " + payload.getImmatriculation() + "\n" +
                        "Taux CRM :" + payload.getTauxCRM() + "\n" +
                        "crmManuel: " + payload.getCrmManuel() + "\n" +
                        "crmFMSAR: " + payload.getCrmFMSAR() + "\n" +
                        "avecCrmManuel: " + payload.getAvecCrmManuel() + "\n" +
                        "marque: " + payload.getMarque() + "\n" +
                        "modele: " + payload.getModele() + "\n" +
                        "carburant: " + payload.getCarburant() + "\n" +
                        "puissanceFiscale: " + payload.getPuissanceFiscale() + "\n" +
                        "nombrePlace: " + payload.getNombrePlace() + "\n" +
                        "nombreRemorquesTractes: " + payload.getNombreRemorquesTractes() + "\n" +
                        "valeurANeuf: " + payload.getValeurANeuf() + "\n" +
                        "valeurVenale: " + payload.getValeurVenale() + "\n" +
                        "vehiculeAgarage: " + payload.getVehiculeAgarage() + "\n" +
                        "ptc: " + payload.getPtc() + "\n" +
                        "referenceCRMFMSAR: " + payload.getReferenceCRMFMSAR() + "\n" +
                        "avecDelegation: " + payload.getAvecDelegation() + "\n" +
                        "avecBaremeConventionnel: " + payload.getAvecBaremeConventionnel() + "\n" +
                        "numeroChassis: " + payload.getNumeroChassis() + "\n" +
                        "numeroCadre: " + payload.getNumeroCadre() + "\n" +
                        "numeroMoteur: " + payload.getNumeroMoteur() + "\n" +
                        "avecAutreImmatriculation: " + payload.getAvecAutreImmatriculation() + "\n" +
                        "avecModificationNarsa: " + payload.getAvecModificationNarsa() + "\n" +
                        "avecErreurNarsa: " + payload.getAvecErreurNarsa() + "\n" +
                        "avecAntivole: " + payload.getAvecAntivole() + "\n" +
                        "natureContrat: " + payload.getNatureContrat() + "\n" +
                        "dateEffet: " + payload.getDateEffet() + "\n" +
                        "heureEffet: " + payload.getHeureEffet() + "\n" +
                        "dateEcheance: " + payload.getDateEcheance() + "\n" +
                        "heureEcheance: " + payload.getHeureEcheance() + "\n" +
                        "dateEvenement: " + payload.getDateEvenement() + "\n" +
                        "heureEvenement: " + payload.getHeureEvenement() + "\n" +
                        "duree: " + payload.getDuree() + "\n" +
                        "dureeContratEnJour: " + payload.getDureeContratEnJour() + "\n" +
                        "dateEffetInitiale: " + payload.getDateEffetInitiale() + "\n" +
                        "dateEtablissement: " + payload.getDateEtablissement() + "\n" +
                        "modePaiement: " + payload.getModePaiement() + "\n" +
                        "numeroAttestation: " + payload.getNumeroAttestation() + "\n" +
                        "formatAttestation: " + payload.getFormatAttestation() + "\n" +
                        "typeContrat: " + payload.getTypeContrat() + "\n" +
                        "typeCouverture: " + payload.getTypeCouverture() + "\n" +
                        "numeroAttestationProvisoire: " + payload.getNumeroAttestationProvisoire() + "\n" +
                        "idIntermediaire: " + payload.getIdIntermediaire() + "\n" +
                        "typeEvenement: " + payload.getTypeEvenement() + "\n" +
                        "idProduit: " + payload.getIdProduit() + "\n" +
                        "numeroDevis: " + payload.getNumeroDevis() + "\n" +
                        "souscripteurUpdated: " + payload.getSouscripteurUpdated() + "\n" +
                        "conducteurUpdated: " + payload.getConducteurUpdated() + "\n" +
                        "conducteurSecondaireUpdated: " + payload.getConducteurSecondaireUpdated() + "\n"
        );

        return new Object() {
            public Object[] results = new Object[] {
                    new Object() {
                        public String code = "Q800";
                        public String libelle = "Offres GAMA";
                        public int priorite = 1;
                        public Object[] categorieOffres = new Object[] {
                                new Object() {
                                    public String code = "Q800-AA";
                                    public String libelle = "Adulte";
                                    public int priorite = 1;
                                    public String argumentVente = "Découvrez notre offre spéciale pour les Adultes : une couverture adaptée à vos besoins, à un tarif attractif";
                                },
                                new Object() {
                                    public String code = "Q800-CC";
                                    public String libelle = "Occasion";
                                    public int priorite = 3;
                                    public String argumentVente = "Découvrez notre offre spéciale pour les VHL d'occasion : une couverture adaptée à vos besoins, à un tarif attractif pendant la durée (15/04/2024-15/07/2024)";
                                }
                        };
                        public String argumentVente = "Test Chapeau";
                    }
            };
        };
    }
}
