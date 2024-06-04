package com.mockyBack.demo.controllers;


import com.mockyBack.demo.entities.Garantie;
import com.mockyBack.demo.entities.Offre;
import com.mockyBack.demo.entities.TarifsRC;
import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.services.TarifsRCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/disasterRecovery/tarification")
public class TarifsRCController {

    @Autowired
    private TarifsRCService tarifsRCService;

    @GetMapping
    public List<TarifsRC> findAll() {return tarifsRCService.findAll();}

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile() {
       tarifsRCService.importFromCSV();
        return ResponseEntity.ok("File uploaded and data saved successfully");
    }

    @PostMapping("/calculate")
    public ResponseEntity<Object> calculatePrime(@RequestBody ChapeauPayload payload){
        tarifsRCService.calculatePrime(payload);
        return ResponseEntity.ok(tarifsRCService.calculatePrime(payload));
    }

    @PostMapping("/calculTarif")
    public double calculateTarif(@RequestBody ChapeauPayload data) {
        return tarifsRCService.calculateTarif(data);
    }
    @PostMapping("/chapeaux")
    public ResponseEntity<Object>  chapeau(@RequestBody ChapeauPayload payload){
        return ResponseEntity.ok(new String[0]);
    }
    @PostMapping("/offres")
    public ResponseEntity<Object>  offre(@RequestBody ChapeauPayload payload){
        Offre offer = new Offre();
        offer.setId(237);
        offer.setLibelle("RC");
        offer.setPrimeNetHT(3060.3);
        double forfait = tarifsRCService.calculateTarif(payload);
        offer.setPrimeTotalTTC(forfait);
        offer.setTaxes(472.16);
        offer.setTaxeParafiscal(30.6);
        offer.setTaxesProrata(472.16);
        offer.setTaxeParafiscalProrata(30.6);
        offer.setTaxesAnnuelle(472.16);
        offer.setTaxeParafiscalAnuuelle(30.6);
        offer.setPrimeAnnuelleHT(3060.3);
        offer.setPrimeProrataHT(3060.3);
        offer.setPrimeAnnuelleTTC(3600.06);
        offer.setPrimeProrataTTC(3600.06);
        offer.setTaxeCNPAC(17.0);
        offer.setTimbre(0.0);
        offer.setAccessoires(20.0);
        offer.setCommission(378.06);
        offer.setCommissionAnnuelle(378.06);
        offer.setCommissionProrata(378.06);
        offer.setTaxeCommission(40.51);
        offer.setTaxeCommissionProrata(40.51);
        offer.setTaxeCommissionAnnuelle(40.51);
        offer.setBasePrimeAnnuelle(2914.8);
        offer.setComplPrimeAnnuelle(145.5);
        offer.setBasePrimeProrata(2914.8);
        offer.setComplPrimeProrata(145.5);
        offer.setIncluded(true);
        offer.setEligible(true);

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
        garantie2.setIdOptionGarantie("null");
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

        Garantie garantie3 = new Garantie();
        garantie3.setLibelle("Défense et Recours");
        garantie3.setCapitalGarantie("10000");
        garantie3.setCodeGarantie("6");
        garantie3.setIncluded(false);
        garantie3.setObligatoire(false);
        garantie3.setOptionnelle(true);
        garantie3.setMinimal(false);
        garantie3.setOrdre(9);

        Garantie garantie4 = new Garantie();
        garantie4.setLibelle("PCA");
        garantie4.setCodeGarantie("7");
        garantie4.setIdOptionGarantie("null");
        garantie4.setIncluded(false);
        garantie4.setObligatoire(false);
        garantie4.setOptionnelle(true);
        garantie4.setMinimal(false);
        garantie4.setOrdre(10);

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

        Garantie garantie6 = new Garantie();
        garantie6.setLibelle("Rachat de vetuste");
        garantie6.setCodeGarantie("12");
        garantie6.setCodeExtensionGarantie("23");
        garantie6.setIncluded(false);
        garantie6.setObligatoire(false);
        garantie6.setOptionnelle(true);
        garantie6.setMinimal(false);
        garantie6.setOrdre(12);

        offer.setGaranties(Arrays.asList(garantie1, garantie2, garantie3, garantie4, garantie5, garantie6));
        offer.setNombreExtincteur("0");
        return ResponseEntity.ok(offer);
    }
}
