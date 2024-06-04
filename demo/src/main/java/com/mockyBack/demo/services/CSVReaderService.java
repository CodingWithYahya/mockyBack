package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.Garantie;
import com.mockyBack.demo.entities.TarifsRC;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Service
public class CSVReaderService {

//    public List<Garantie> readCSVForGarantie(InputStream inputStream) {
//        List<Garantie> garanties = new ArrayList<>();
//        try (CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).build()) {
//            String[] data;
//            // Skip the header line
//            csvReader.readNext();
//            while ((data = csvReader.readNext()) != null) {
//                Garantie garantie = new Garantie();
//                garantie.setLibelle(data[0]);
//                garantie.setCodeGarantie(data[1]);
//                garantie.setPrimeAnnuelle(Double.parseDouble(data[2]));
//                garantie.setPrimeAuProrata(Double.parseDouble(data[3]));
//                garantie.setIdOptionGarantie(data[4].equals("null") ? null : data[4]);
//                garantie.setIncluded(Boolean.parseBoolean(data[5]));
//                garantie.setObligatoire(Boolean.parseBoolean(data[6]));
//                garantie.setOptionnelle(Boolean.parseBoolean(data[7]));
//                garantie.setOrdre(Integer.parseInt(data[8]));
//                garantie.setTaxeGarantieProrata(Double.parseDouble(data[9]));
//                garantie.setTaxeParafiscalProrata(Double.parseDouble(data[10]));
//                garantie.setTaxeGarantieAnnuelle(Double.parseDouble(data[11]));
//                garantie.setTaxeParafiscalAnnuelle(Double.parseDouble(data[12]));
//                garantie.setCommission(Double.parseDouble(data[13]));
//                garantie.setTaxeCommission(Double.parseDouble(data[14]));
//                garantie.setCommissionProrata(Double.parseDouble(data[15]));
//                garantie.setTaxeCommissionProrata(Double.parseDouble(data[16]));
//                garantie.setCommissionAnnuelle(Double.parseDouble(data[17]));
//                garantie.setTaxeCommissionAnnuelle(Double.parseDouble(data[18]));
//                garantie.setTaxeGarantie(Double.parseDouble(data[19]));
//                garantie.setTaxeParafiscal(Double.parseDouble(data[20]));
//                garantie.setMajorationBL(Double.parseDouble(data[21]));
//                garantie.setEtat(data[22]);
//
//                garanties.add(garantie);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return garanties;
//    }

    public List<TarifsRC> readCSV(InputStream inputStream) {
        List<TarifsRC> tarifsRCList = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).build()) {
            String[] data;
            // Skip the header line
            csvReader.readNext();
            while ((data = csvReader.readNext()) != null) {
                TarifsRC tarifsRC = new TarifsRC();
                tarifsRC.setForfait(Double.parseDouble(data[0].replace("\"", "").replace(",", ".").trim()));
                tarifsRC.setForfaitNrePlace(Integer.parseInt(data[1].replace("\"", "").trim()));
                tarifsRC.setTauxMajorationRemorque(Double.parseDouble(data[2].replace("\"", "").replace(",", ".").trim()));
                tarifsRC.setCodeUsageVehiculeMin(Integer.parseInt(data[3].replace("\"", "").trim()));
                tarifsRC.setCodeUsageVehiculeMax(Integer.parseInt(data[4].replace("\"", "").trim()));
                tarifsRC.setCarburantMin(Integer.parseInt(data[5].replace("\"", "").trim()));
                tarifsRC.setCarburantMax(Integer.parseInt(data[6].replace("\"", "").trim()));
                tarifsRC.setPuissanceFiscaleMin(Integer.parseInt(data[7].replace("\"", "").trim()));
                tarifsRC.setPuissanceFiscaleMax(Integer.parseInt(data[8].replace("\"", "").trim()));
                tarifsRC.setPtcMin((int) Double.parseDouble(data[9].replace("\"", "").replace(",", ".").trim()));
                tarifsRC.setPtcMax((int) Double.parseDouble(data[10].replace("\"", "").replace(",", ".").trim()));
                tarifsRC.setAvecRemorque(Integer.parseInt(data[11].replace("\"", "").replace(",", ".").trim()));
                //defaultPlans.setAvecRemorque(Integer.parseInt(data[11].replace("\"", "").trim()) == 1);
                // ** boolean avecRemorque = Integer.parseInt(data[11].replace("\"", "").trim()) == 1;
                // ** defaultPlans.setAvecRemorque(avecRemorque);
                //defaultPlans.setAvecRemorque(Boolean.parseBoolean(data[11].replace("\"", "").trim()) ? 1 : 0);

                tarifsRCList.add(tarifsRC);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tarifsRCList;
    }
}
