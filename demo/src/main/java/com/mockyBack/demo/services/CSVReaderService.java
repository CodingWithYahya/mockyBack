package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.DefaultPlans;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Service
public class CSVReaderService {

    public List<DefaultPlans> readCSV(InputStream inputStream) {
        List<DefaultPlans> defaultPlansList = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).build()) {
            String[] data;
            // Skip the header line
            csvReader.readNext();
            while ((data = csvReader.readNext()) != null) {
                DefaultPlans defaultPlans = new DefaultPlans();
                defaultPlans.setForfait(Double.parseDouble(data[0].replace("\"", "").replace(",", ".").trim()));
                defaultPlans.setForfaitNrePlace(Integer.parseInt(data[1].replace("\"", "").trim()));
                defaultPlans.setTauxMajorationRemorque(Double.parseDouble(data[2].replace("\"", "").replace(",", ".").trim()));
                defaultPlans.setCodeUsageVehiculeMin(Integer.parseInt(data[3].replace("\"", "").trim()));
                defaultPlans.setCodeUsageVehiculeMax(Integer.parseInt(data[4].replace("\"", "").trim()));
                defaultPlans.setCarburantMin(Integer.parseInt(data[5].replace("\"", "").trim()));
                defaultPlans.setCarburantMax(Integer.parseInt(data[6].replace("\"", "").trim()));
                defaultPlans.setPuissanceFiscaleMin(Integer.parseInt(data[7].replace("\"", "").trim()));
                defaultPlans.setPuissanceFiscaleMax(Integer.parseInt(data[8].replace("\"", "").trim()));
                defaultPlans.setPtcMax((int) Double.parseDouble(data[9].replace("\"", "").replace(",", ".").trim()));
                defaultPlans.setPtcMin((int) Double.parseDouble(data[10].replace("\"", "").replace(",", ".").trim()));
                defaultPlans.setAvecRemorque(Integer.parseInt(data[10].replace("\"", "").replace(",", ".").trim()));
                //defaultPlans.setAvecRemorque(Integer.parseInt(data[11].replace("\"", "").trim()) == 1);
                // ** boolean avecRemorque = Integer.parseInt(data[11].replace("\"", "").trim()) == 1;
                // ** defaultPlans.setAvecRemorque(avecRemorque);
                //defaultPlans.setAvecRemorque(Boolean.parseBoolean(data[11].replace("\"", "").trim()) ? 1 : 0);


                defaultPlansList.add(defaultPlans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultPlansList;
    }

    /*
    public List<DefaultPlans> readCSV(InputStream inputStream) {
        List<DefaultPlans> defaultPlansList = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new InputStreamReader(inputStream)).build()) {
            String[] data;
            // Skip the header line
            csvReader.readNext();
            while ((data = csvReader.readNext()) != null) {
                DefaultPlans defaultPlans = new DefaultPlans();
                defaultPlans.setForfait(Double.parseDouble(data[0].replace("\"", "").trim()));
                defaultPlans.setForfaitNrePlace(Integer.parseInt(data[1].replace("\"", "").trim()));
                defaultPlans.setTauxMajorationRemorque(Double.parseDouble(data[2].replace("\"", "").trim()));
                defaultPlans.setCodeUsageVehiculeMin(Integer.parseInt(data[3].replace("\"", "").trim()));
                defaultPlans.setCodeUsageVehiculeMax(Integer.parseInt(data[4].replace("\"", "").trim()));
                defaultPlans.setCarburantMin(Integer.parseInt(data[5].replace("\"", "").trim()));
                defaultPlans.setCarburantMax(Integer.parseInt(data[6].replace("\"", "").trim()));
                defaultPlans.setPuissanceFiscaleMin(Integer.parseInt(data[7].replace("\"", "").trim()));
                defaultPlans.setPuissanceFiscaleMax(Integer.parseInt(data[8].replace("\"", "").trim()));
                defaultPlans.setPtcMax(Double.parseDouble(data[9].replace("\"", "").trim()));
                defaultPlans.setPtcMin(Double.parseDouble(data[10].replace("\"", "").trim()));
                defaultPlans.setAvecRemorque(Integer.parseInt(data[11].replace("\"", "").trim()) == 1);

                defaultPlansList.add(defaultPlans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultPlansList;
    }
    */

    /*public List<DefaultPlans> readCSV(InputStream inputStream) {
        List<DefaultPlans> defaultPlansList = new ArrayList<>();
        String line;
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            // Skip the header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);

                // Remove double quotes from values
                for (int i = 0; i < data.length; i++) {
                    data[i] = data[i].replace("\"", "").trim();
                }

                DefaultPlans defaultPlans = new DefaultPlans();
                defaultPlans.setForfait(Double.parseDouble(data[0]));
                defaultPlans.setForfaitNrePlace(Integer.parseInt(data[1]));
                defaultPlans.setTauxMajorationRemorque(Double.parseDouble(data[2]));
                defaultPlans.setCodeUsageVehiculeMin(Integer.parseInt(data[3]));
                defaultPlans.setCodeUsageVehiculeMax(Integer.parseInt(data[4]));
                defaultPlans.setCarburantMin(Integer.parseInt(data[5]));
                defaultPlans.setCarburantMax(Integer.parseInt(data[6]));
                defaultPlans.setPuissanceFiscaleMin(Integer.parseInt(data[7]));
                defaultPlans.setPuissanceFiscaleMax(Integer.parseInt(data[8]));
                defaultPlans.setPtcMax(Double.parseDouble(data[9]));
                defaultPlans.setPtcMin(Double.parseDouble(data[10]));
                defaultPlans.setAvecRemorque(Integer.parseInt(data[11]) == 1);

                defaultPlansList.add(defaultPlans);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultPlansList;
    }*/

    /*
    public List<DefaultPlans> readCSV(InputStream inputStream) {
        List<DefaultPlans> defaultPlansList = new ArrayList<>();
        String line = "";
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            // Skip the header line
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                DefaultPlans defaultPlans = new DefaultPlans();
                defaultPlans.setForfait(Double.parseDouble(data[0]));
                defaultPlans.setForfaitNrePlace(Integer.parseInt(data[1]));
                defaultPlans.setTauxMajorationRemorque(Double.parseDouble(data[2]));
                defaultPlans.setCodeUsageVehiculeMin(Integer.parseInt(data[3]));
                defaultPlans.setCodeUsageVehiculeMax(Integer.parseInt(data[4]));
                defaultPlans.setCarburantMin(Integer.parseInt(data[5]));
                defaultPlans.setCarburantMax(Integer.parseInt(data[6]));
                defaultPlans.setPuissanceFiscaleMin(Integer.parseInt(data[7]));
                defaultPlans.setPuissanceFiscaleMax(Integer.parseInt(data[8]));
                defaultPlans.setPtcMax(Double.parseDouble(data[9]));
                defaultPlans.setPtcMin(Double.parseDouble(data[10]));
                defaultPlans.setAvecRemorque(Boolean.parseBoolean(data[11]));

                defaultPlansList.add(defaultPlans);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultPlansList;
    }
    */
}
