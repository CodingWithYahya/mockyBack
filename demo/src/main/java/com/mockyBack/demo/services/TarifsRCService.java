package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.repositories.TarifsRCRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mockyBack.demo.entities.TarifsRC;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.List;


@Service
public class TarifsRCService {

    @Autowired
    private TarifsRCRepository tarifsRCRepository;
    @Autowired
    private CSVReaderService csvReaderService;

    public void saveAll(List<TarifsRC> tarifsRCList) {
        tarifsRCRepository.saveAll(tarifsRCList);
    }

    public void importFromCSV() {
        InputStream inputStream = getClass().getResourceAsStream("/TarificationRC.csv");
        if (inputStream == null) {
            System.out.println("Le fichier CSV n'a pas été trouvé.");
            return;
        }

        List<TarifsRC> tarifsRCList = csvReaderService.readCSV(inputStream);
        saveAll(tarifsRCList);
    }
    @PostConstruct
    public void init(){
        importFromCSV();
    }


    public double calculatePrime(ChapeauPayload data){
        List<TarifsRC> plans = tarifsRCRepository.findAll();
        int codeUsage = Integer.parseInt(data.getCodeUsageVehicule());
        int carburant = Integer.parseInt(data.getCarburant());
        System.out.println(data.getPtc() + "PTC   :");
        for (TarifsRC plan : plans) {
            System.out.println(data);
            if (plan.getCodeUsageVehiculeMin() <= codeUsage && codeUsage<=plan.getCodeUsageVehiculeMax()
            && plan.getCarburantMin() <= carburant &&
                    carburant <= plan.getCarburantMax() &&
                    plan.getPuissanceFiscaleMin() <= data.getPuissanceFiscale() &&
                    data.getPuissanceFiscale() <= plan.getPuissanceFiscaleMax() &&
                    plan.getPtcMin() <= data.getPtc() &&
                    data.getPtc() <= plan.getPtcMax()
            ){
                double forfait = plan.getForfait();
                if (data.getNombreRemorquesTractes() == 1) {
                    forfait += forfait * plan.getTauxMajorationRemorque() / 100;
                }
                return forfait;
            }
        }
        return 0.0; // Return 0 if no match is found
    }
    }






    /*public void importFromCSV() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/TarificationRC.csv");

            if (inputStream == null) {
                System.out.println("Le fichier CSV n'a pas été trouvé.");
            } else {
                System.out.println("Le fichier CSV a été trouvé.");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            List<DefaultPlans> defaultPlansList = new ArrayList<>();

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Remove double quotes from values
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].replaceAll("\"", "");
                }

                double forfait = Double.parseDouble(values[0]);
                int forfaitNrePlace = Integer.parseInt(values[1]);
                double tauxMajorationRemorque = Double.parseDouble(values[2]);
                int codeUsageVehiculeMin = Integer.parseInt(values[3]);
                int codeUsageVehiculeMax = Integer.parseInt(values[4]);
                int carburantMin = Integer.parseInt(values[5]);
                int carburantMax = Integer.parseInt(values[6]);
                int puissanceFiscaleMin = Integer.parseInt(values[7]);
                int puissanceFiscaleMax = Integer.parseInt(values[8]);
                double ptcMax = Double.parseDouble(values[9]);
                double ptcMin = Double.parseDouble(values[10]);
                boolean avecRemorque = Integer.parseInt(values[11]) == 1;

                DefaultPlans plan = new DefaultPlans(forfait, forfaitNrePlace, tauxMajorationRemorque,
                        codeUsageVehiculeMin, codeUsageVehiculeMax, carburantMin, carburantMax,
                        puissanceFiscaleMin, puissanceFiscaleMax, ptcMax, ptcMin, avecRemorque);

                defaultPlansList.add(plan);
            }

            br.close();

            // Save the data in the database
            saveAll(defaultPlansList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


    /*public void importFromExcel() {
        String filePath = "C:\\Users\\beija\\Downloads\\TARIF_RC_SIMPLIFIE_22052024.xlsx";

        try {
            Workbook workbook = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = workbook.getSheet(0);

            for (int row = 1; row < sheet.getRows(); row++) {
                Cell[] cells = sheet.getRow(row);
                try {
                    double forfait = Double.parseDouble(cells[0].getContents());
                    int forfaitNrePlace = Integer.parseInt(cells[1].getContents());
                    double tauxMajorationRemorque = Double.parseDouble(cells[2].getContents());
                    int codeUsageVehiculeMin = Integer.parseInt(cells[3].getContents());
                    int codeUsageVehiculeMax = Integer.parseInt(cells[4].getContents());
                    int carburantMin = Integer.parseInt(cells[5].getContents());
                    int carburantMax = Integer.parseInt(cells[6].getContents());
                    int puissanceFiscaleMin = Integer.parseInt(cells[7].getContents());
                    int puissanceFiscaleMax = Integer.parseInt(cells[8].getContents());
                    double ptcMax = Double.parseDouble(cells[9].getContents());
                    double ptcMin = Double.parseDouble(cells[10].getContents());
                    boolean avecRemorque = Boolean.parseBoolean(cells[11].getContents());

                    // Enregistrer dans db
                    DefaultPlans plan = new DefaultPlans(forfait, forfaitNrePlace, tauxMajorationRemorque,
                            codeUsageVehiculeMin, codeUsageVehiculeMax, carburantMin, carburantMax,
                            puissanceFiscaleMin, puissanceFiscaleMax, ptcMax, ptcMin, avecRemorque);
                    defaultPlansRepository.save(plan);
                } catch (Exception e) {
                    System.err.printf("Erreur lors du traitement de la ligne %d : %s%n", row, e.getMessage());
                }
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*
    public void importFromExcel() {
        String filePath = "C:\\Users\\beija\\Downloads\\TARIF_RC_SIMPLIFIE_22052024.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) continue;

                try {

                    String forfaitStr = row.getCell(0).getStringCellValue();
                    String forfaitNrePlaceStr = row.getCell(1).getStringCellValue();
                    String tauxMajorationRemorqueStr = row.getCell(2).getStringCellValue();
                    String codeUsageVehiculeMinStr = row.getCell(3).getStringCellValue();
                    String codeUsageVehiculeMaxStr = row.getCell(4).getStringCellValue();
                    String carburantMinStr = row.getCell(5).getStringCellValue();
                    String carburantMaxStr = row.getCell(6).getStringCellValue();
                    String puissanceFiscaleMinStr = row.getCell(7).getStringCellValue();
                    String puissanceFiscaleMaxStr = row.getCell(8).getStringCellValue();
                    String ptcMaxStr = row.getCell(9).getStringCellValue();
                    String ptcMinStr = row.getCell(10).getStringCellValue();
                    String avecRemorqueStr = row.getCell(11).getStringCellValue();

                    double forfait = Double.parseDouble(forfaitStr);
                    int forfaitNrePlace = Integer.parseInt(forfaitNrePlaceStr);
                    double tauxMajorationRemorque = Double.parseDouble(tauxMajorationRemorqueStr);
                    int codeUsageVehiculeMin = Integer.parseInt(codeUsageVehiculeMinStr);
                    int codeUsageVehiculeMax = Integer.parseInt(codeUsageVehiculeMaxStr);
                    int carburantMin = Integer.parseInt(carburantMinStr);
                    int carburantMax = Integer.parseInt(carburantMaxStr);
                    int puissanceFiscaleMin = Integer.parseInt(puissanceFiscaleMinStr);
                    int puissanceFiscaleMax = Integer.parseInt(puissanceFiscaleMaxStr);
                    double ptcMax = Double.parseDouble(ptcMaxStr);
                    double ptcMin = Double.parseDouble(ptcMinStr);
                    boolean avecRemorque = Boolean.parseBoolean(avecRemorqueStr);

                    // Enregistrement des données dans la base de données
                    DefaultPlans plan = new DefaultPlans(forfait, forfaitNrePlace, tauxMajorationRemorque,
                            codeUsageVehiculeMin, codeUsageVehiculeMax, carburantMin, carburantMax,
                            puissanceFiscaleMin, puissanceFiscaleMax, ptcMax, ptcMin, avecRemorque);
                    defaultPlansRepository.save(plan);
                } catch (Exception e) {
                    System.err.printf("Erreur lors du traitement de la ligne %d : %s%n", row.getRowNum(), e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    /*public void importFromExcel(MultipartFile file) {
        try (InputStream is = file.getInputStream()) {
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) continue;

                try {
                    double forfait = row.getCell(0).getNumericCellValue();
                    double forfaitNrePlace = row.getCell(1).getNumericCellValue();
                    double tauxMajorationRemorque = row.getCell(2).getNumericCellValue();
                    int codeUsageVehiculeMin = (int) row.getCell(3).getNumericCellValue();
                    int codeUsageVehiculeMax = (int) row.getCell(4).getNumericCellValue();
                    int carburantMin = (int) row.getCell(5).getNumericCellValue();
                    int carburantMax = (int) row.getCell(6).getNumericCellValue();
                    int puissanceFiscaleMin = (int) row.getCell(7).getNumericCellValue();
                    int puissanceFiscaleMax = (int) row.getCell(8).getNumericCellValue();
                    double ptcMax = row.getCell(9).getNumericCellValue();
                    double ptcMin = row.getCell(10).getNumericCellValue();
                    boolean avecRemorque = row.getCell(11).getBooleanCellValue();

                    // Enregistrement des données dans la base de données
                    DefaultPlans plan = new DefaultPlans(forfait, (int) forfaitNrePlace, tauxMajorationRemorque,
                            codeUsageVehiculeMin, codeUsageVehiculeMax, carburantMin, carburantMax,
                            puissanceFiscaleMin, puissanceFiscaleMax, ptcMax, ptcMin, avecRemorque);
                    defaultPlansRepository.save(plan);
                } catch (Exception e) {
                    // Journalisation de l'erreur et de la ligne problématique
                    System.err.printf("Erreur lors du traitement de la ligne %d : %s%n", row.getRowNum(), e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

