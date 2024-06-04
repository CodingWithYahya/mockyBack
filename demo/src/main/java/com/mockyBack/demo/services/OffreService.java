package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.entities.Garantie;
import com.mockyBack.demo.entities.Offre;
import com.mockyBack.demo.repositories.GarantieRepository;
import com.mockyBack.demo.repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OffreService {
    @Autowired
    private OffreRepository offreRepository;

    @Autowired
    private GarantieRepository garantieRepository;

    @Autowired
    private TarifsRCService tarifsRCService;

    public List<Garantie> getAllGaranties() {
        return garantieRepository.findAll();
    }

    public List<Offre> getAllOffres() {
        return offreRepository.findAll();
    }

    public Offre createOffre(ChapeauPayload payload) {
        Offre offre = new Offre();
// Calcul du tarif en utilisant la méthode calculateTarif de TarifsRCService
        double primeNetHT = tarifsRCService.calculateTarif(payload);
// Remplir les champs de l'objet Offre
        offre.setLibelle("RC");
        offre.setPrimeNetHT(primeNetHT);
        offre.setPrimeTotalTTC(primeNetHT * 1.17); // Exemple de calcul des taxes, ajustez selon vos besoins
        offre.setTaxes(primeNetHT * 0.15); // Exemple de calcul des taxes, ajustez selon vos besoins
        offre.setTaxeParafiscal(primeNetHT * 0.01); // Exemple de calcul des taxes parafiscales, ajustez selon vos besoins
        offre.setTaxesProrata(primeNetHT * 0.15); // Exemple de calcul des taxes au prorata, ajustez selon vos besoins
        offre.setTaxeParafiscalProrata(primeNetHT * 0.01); // Exemple de calcul des taxes parafiscales au prorata, ajustez selon vos besoins
        offre.setTaxesAnnuelle(primeNetHT * 0.15); // Exemple de calcul des taxes annuelles, ajustez selon vos besoins
        offre.setTaxeParafiscalAnnuelle(primeNetHT * 0.01); // Exemple de calcul des taxes parafiscales annuelles, ajustez selon vos besoins
        offre.setPrimeAnnuelleHT(primeNetHT);
        offre.setPrimeProrataHT(primeNetHT);
        offre.setPrimeAnnuelleTTC(primeNetHT * 1.17); // Exemple de calcul des taxes, ajustez selon vos besoins
        offre.setPrimeProrataTTC(primeNetHT * 1.17); // Exemple de calcul des taxes, ajustez selon vos besoins
        offre.setTaxeCNPAC(17.0); // Exemple de taxe fixe, ajustez selon vos besoins
        offre.setTimbre(0.0); // Exemple de timbre, ajustez selon vos besoins
        offre.setAccessoires(20.0); // Exemple d'accessoires, ajustez selon vos besoins
        offre.setCommission(primeNetHT * 0.12); // Exemple de calcul des commissions, ajustez selon vos besoins
        offre.setCommissionAnnuelle(primeNetHT * 0.12); // Exemple de calcul des commissions annuelles, ajustez selon vos besoins
        offre.setCommissionProrata(primeNetHT * 0.12); // Exemple de calcul des commissions au prorata, ajustez selon vos besoins
        offre.setTaxeCommission(primeNetHT * 0.01); // Exemple de calcul des taxes sur les commissions, ajustez selon vos besoins
        offre.setTaxeCommissionProrata(primeNetHT * 0.01); // Exemple de calcul des taxes sur les commissions au prorata, ajustez selon vos besoins
        offre.setTaxeCommissionAnnuelle(primeNetHT * 0.01); // Exemple de calcul des taxes sur les commissions annuelles, ajustez selon vos besoins
        offre.setBasePrimeAnnuelle(primeNetHT * 0.96); // Exemple de base de la prime annuelle, ajustez selon vos besoins
        offre.setComplPrimeAnnuelle(primeNetHT * 0.04); // Exemple de complément de la prime annuelle, ajustez selon vos besoins
        offre.setBasePrimeProrata(primeNetHT * 0.96); // Exemple de base de la prime au prorata, ajustez selon vos besoins
        offre.setComplPrimeProrata(primeNetHT * 0.04); // Exemple de complément de la prime au prorata, ajustez selon vos besoins
        offre.setIncluded(true);
        offre.setEligible(true);

        Garantie garantie1 = new Garantie();
        garantie1.setLibelle("Responsabilite Civile");
        garantie1.setCodeGarantie("1");
        garantie1.setPrimeAnnuelle(2914.8);
        garantie1.setPrimeAuProrata(2914.8);
        garantie1.setIdOptionGarantie("null");
        garantie1.setIncluded(true);
        garantie1.setObligatoire(true);
        garantie1.setOptionnelle(false);
        garantie1.setOrdre(1);
        garantie1.setTaxeGarantieProrata(451.79);
        garantie1.setTaxeParafiscalProrata(29.15);
        garantie1.setTaxeGarantieAnnuelle(451.79);
        garantie1.setTaxeParafiscalAnnuelle(29.15);
        garantie1.setCommission(369.78);
        garantie1.setTaxeCommission(39.62);
        garantie1.setCommissionProrata(369.78);
        garantie1.setTaxeCommissionProrata(39.62);
        garantie1.setCommissionAnnuelle(369.78);
        garantie1.setTaxeCommissionAnnuelle(39.62);
        garantie1.setTaxeGarantie(451.79);
        garantie1.setTaxeParafiscal(29.15);
        garantie1.setMajorationBL(0.0);
        garantie1.setEtat("0");


        Garantie garantie2 = new Garantie();
        garantie2.setLibelle("Evenement Catastrophique");
        garantie2.setFranchise("10.0");
        garantie2.setCodeGarantie("17");
        garantie2.setPrimeAnnuelle(102.02);
        garantie2.setPrimeAuProrata(102.02);
        garantie2.setIncluded(true);
        garantie2.setObligatoire(true);
        garantie2.setOptionnelle(false);
        garantie2.setOrdre(1);
        garantie2.setTaxeGarantieProrata(14.28);
        garantie2.setTaxeParafiscalProrata(1.02);
        garantie2.setTaxeGarantieAnnuelle(14.28);
        garantie2.setTaxeParafiscalAnnuelle(1.02);
        garantie2.setCommission(3.06);
        garantie2.setTaxeCommission(0.33);
        garantie2.setCommissionProrata(3.06);
        garantie2.setTaxeCommissionProrata(0.33);
        garantie2.setCommissionAnnuelle(3.06);
        garantie2.setTaxeCommissionAnnuelle(0.33);
        garantie2.setTaxeGarantie(14.28);
        garantie2.setTaxeParafiscal(1.02);
        garantie2.setMajorationBL(0.0);
        garantie2.setEtat("0");

        Garantie garantie5 = new Garantie();
        garantie5.setLibelle("Assistance");
        garantie5.setCodeGarantie("8");
        garantie5.setPrimeAnnuelle(43.48);
        garantie5.setPrimeAuProrata(43.48);
        garantie5.setCodeExtensionGarantie("37");
        garantie5.setIncluded(true);
        garantie5.setObligatoire(true);
        garantie5.setOptionnelle(false);
        garantie5.setOrdre(11);
        garantie5.setTaxeGarantieProrata(6.09);
        garantie5.setTaxeParafiscalProrata(0.43);
        garantie5.setTaxeGarantieAnnuelle(6.09);
        garantie5.setTaxeParafiscalAnnuelle(0.43);
        garantie5.setCommission(5.22);
        garantie5.setTaxeCommission(0.56);
        garantie5.setCommissionProrata(5.22);
        garantie5.setTaxeCommissionProrata(0.56);
        garantie5.setCommissionAnnuelle(5.22);
        garantie5.setTaxeCommissionAnnuelle(0.56);
        garantie5.setTaxeGarantie(6.09);
        garantie5.setTaxeParafiscal(0.43);
        garantie5.setMajorationBL(0.0);
        garantie5.setEtat("0");

        Garantie garantie6=Garantie.builder()
                .codeGarantie("teszt")
                .libelle("")
                .build();

        offre.setGaranties(Arrays.asList(garantie1, garantie2, garantie5, garantie6));

        // offre.setGaranties(Arrays.asList(garantie1, garantie3));

//        Assistance assistance = new Assistance();
//        assistance.setLibelle("Assistance");
//        assistance.setCodeGarantie("8");
//        assistance.setPrimeAnnuelle(43.48);
//        assistance.setPrimeAuProrata(43.48);
//        assistance.setCodeExtensionGarantie("37");
//        assistance.setIncluded(true);
//        assistance.setObligatoire(true);
//        assistance.setOptionnelle(false);
//        assistance.setOrdre(11);
//        assistance.setTaxeGarantieProrata(6.09);
//        assistance.setTaxeParafiscalProrata(0.43);
//        assistance.setTaxeGarantieAnnuelle(6.09);
//        assistance.setTaxeParafiscalAnnuelle(0.43);
//        assistance.setCommission(5.22);
//        assistance.setTaxeCommission(0.56);
//        assistance.setCommissionProrata(5.22);
//        assistance.setTaxeCommissionProrata(0.56);
//        assistance.setCommissionAnnuelle(5.22);
//        assistance.setTaxeCommissionAnnuelle(0.56);
//        assistance.setTaxeGarantie(6.09);
//        assistance.setTaxeParafiscal(0.43);
//        assistance.setMajorationBL(0.0);
//        assistance.setEtat("0");
//
//        EvenementCatastrophique evenementCatastrophique = new EvenementCatastrophique();
//
//
//
//        offre.setGaranties(Arrays.asList(assistance, garantie2, garantie5));


        offre.setNombreExtincteur("0");
        //return ResponseEntity.ok(offre);

//        garantie.setYahya("hi khaoula");

        //offre.setGaranties(List<Garantie> );

        // Récupérer et associer les garanties
//        List<Garantie> garanties = garantieRepository.findAll();
//        offre.setGaranties(garanties);

        // Sauvegarder l'offre
        offreRepository.save(offre);
        return offre ;

    }

}
