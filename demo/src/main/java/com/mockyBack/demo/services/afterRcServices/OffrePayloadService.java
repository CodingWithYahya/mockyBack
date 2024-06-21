//package com.mockyBack.demo.services.afterRcServices;
//
//
//import com.mockyBack.demo.entities.ChapeauPayload;
//import com.mockyBack.demo.entities.afterRc.OffrePayload;
//import com.mockyBack.demo.repositories.ChapeauPayloadRepository;
//import com.mockyBack.demo.repositories.afterRcRepo.OffrePayloadRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OffrePayloadService {
//    @Autowired
//    private OffrePayloadRepository repository;
//
//    public OffrePayload create(OffrePayload data) {
//        return repository.save(data);
//    }
//
//    public List<OffrePayload> findAll() {
//        return repository.findAll();
//    }
//
//    public OffrePayload findById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//}
