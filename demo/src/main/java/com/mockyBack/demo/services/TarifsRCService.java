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
    private ChapeauPayloadService chapeauPayloadService;
    @Autowired
    private CSVReaderService csvReaderService;

    public void saveAll(List<TarifsRC> tarifsRCList) {
        tarifsRCRepository.saveAll(tarifsRCList);
    }
    public List<TarifsRC> findAll() {
        return tarifsRCRepository.findAll();
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

    public double calculateTarif(ChapeauPayload data) {
        Double prime = tarifsRCRepository.calculatePrime(data);
        return prime != null ? prime : 0.0;
    }

    public double calculatePrime(ChapeauPayload data){
        //List<TarifsRC> plans = chapeauPayloadService.getCleanData();
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
        return 0.0;
    }
}
