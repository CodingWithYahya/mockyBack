package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.entities.TarifsRC;
import com.mockyBack.demo.repositories.ChapeauPayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapeauPayloadService {
    @Autowired
    private ChapeauPayloadRepository repository;

    public ChapeauPayload create(ChapeauPayload data) {
        return repository.save(data);
    }

    public List<ChapeauPayload> findAll() {
        return repository.findAll();
    }

    public ChapeauPayload findById(int id) {
        return repository.findById(id).orElse(null);
    }

    public ChapeauPayload update(int id, ChapeauPayload data) {
        ChapeauPayload existingData = repository.findById(id).orElse(null);
        if (existingData != null) {
            data.setIdObjetFromCh(id);
            return repository.save(data);
        }
        return null;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<ChapeauPayload> getCleanData() {
        List<ChapeauPayload> dataList = repository.findAll();
        for (ChapeauPayload data : dataList) {
            if (data.getPtc() == 0) {
                data.setPtc(0);
            }
            // cleani les champs lakhrin
        }
        return dataList;
    }
    public ChapeauPayload getCleanPayload(ChapeauPayload data) {
            if (data.getPtc() == 0) {
                data.setPtc(0);
            }
            // cleani les champs lakhrin
        return data;
    }


    public Object inspectPayload(ChapeauPayload payload) {
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
