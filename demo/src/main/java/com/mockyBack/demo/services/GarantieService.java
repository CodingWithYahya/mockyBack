package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.Garantie;
import com.mockyBack.demo.entities.TarifsRC;
import com.mockyBack.demo.repositories.GarantieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;


@Service
public class GarantieService {
    @Autowired
    private GarantieRepository garantieRepository;

    @Autowired
    private CSVReaderService csvReaderService ;

    public void saveAll(List<Garantie> GarantiesList) {garantieRepository.saveAll(GarantiesList);}
public void create (Garantie garantie) {
        garantieRepository.save(garantie);
}

//    public void importFromCSV() {
//        InputStream inputStream = getClass().getResourceAsStream("/Garanties.csv");
//        if (inputStream == null) {
//            System.out.println("Le fichier CSV n'a pas été trouvé.");
//            return;
//        }
//
//        List<Garantie> GarantiesList = csvReaderService.readCSVForGarantie(inputStream);
//        saveAll(GarantiesList);
//    }
//    @PostConstruct
//    public void init(){
//        importFromCSV();
//    }

}
