package com.mockyBack.demo.services;

import com.mockyBack.demo.entities.ByUsagePayload;
import com.mockyBack.demo.entities.ChapeauPayload;
import com.mockyBack.demo.repositories.ByUsagePayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ByUsagePayloadService {
    @Autowired
    private ByUsagePayloadRepository byUsagePayloadRepository;

    public ByUsagePayload create(ByUsagePayload data) {
        return byUsagePayloadRepository.save(data);
    }

    public List<ByUsagePayload> findAll() {
        return byUsagePayloadRepository.findAll();
    }

    public ByUsagePayload findById(int id) {
        return byUsagePayloadRepository.findById(id).orElse(null);
    }

    public Object inspectPayload(ByUsagePayload payload) {

        return /*new Object() {
            public Object[] guarantees = */new Object[]{
                    new Object() {
                        public String libelle = "Responsabilite Civile";
                        public boolean hasOption = false;
                        public boolean hasReductionVIP = true;
                        public boolean hasPrimeAnnuelle = true;
                        public boolean hasPrimeCorrective = true;
                        public boolean hasPrimeProrata = true;
                        public int order = 1;
                        public int code = 1;
                        public boolean hasCapital = false;
                        public boolean hasModeAssurance = false;
                        public boolean hasFranchise = false;
                        public boolean hasExtension = false;
                        public boolean hasTauxFranchise = false;
                    },
                    new Object() {
                        public String libelle = "Evenement Catastrophique";
                        public boolean hasOption = false;
                        public boolean hasReductionVIP = true;
                        public boolean hasPrimeAnnuelle = true;
                        public boolean hasPrimeCorrective = true;
                        public boolean hasPrimeProrata = true;
                        public int order = 1;
                        public int code = 17;
                        public boolean hasCapital = false;
                        public boolean hasModeAssurance = false;
                        public boolean hasFranchise = true;
                        public boolean hasExtension = false;
                        public Object[] franchises = new Object[]{
                                new Object() {
                                    public double tauxFranchise = 10.0;
                                }
                        };
                        public boolean hasTauxFranchise = true;
                    },
                    new Object() {
                        public String libelle = "Assistance";
                        public Object[] extensions = new Object[]{
                                new Object() {
                                    public int id = 2;
                                    public int code = 2;
                                    public String libelle = "Option : 10000";
                                    public String formule = "Basique";
                                    public double plafond = 10000.0;
                                    public String orderAffichage = "3";
                                },
                                new Object() {
                                    public int id = 37;
                                    public int code = 37;
                                    public String libelle = "Option : 10500";
                                    public String formule = "Optimale";
                                    public double plafond = 10500.0;
                                    public String orderAffichage = "8";
                                },
                                new Object() {
                                    public int id = 7;
                                    public int code = 7;
                                    public String libelle = "Option : 11000";
                                    public String formule = "Standard";
                                    public double plafond = 11000.0;
                                    public String orderAffichage = "9";
                                },
                                new Object() {
                                    public int id = 11;
                                    public int code = 11;
                                    public String libelle = "Option : 12000";
                                    public String formule = "Elargie";
                                    public double plafond = 12000.0;
                                    public String orderAffichage = "11";
                                },
                                new Object() {
                                    public int id = 15;
                                    public int code = 15;
                                    public String libelle = "RMA Initiale Hani";
                                    public String formule = "RMA Initiale Hani";
                                    public String orderAffichage = "15";
                                },
                                new Object() {
                                    public int id = 22;
                                    public int code = 22;
                                    public String libelle = "Gold";
                                    public String formule = "Gold";
                                    public double plafond = 0.0;
                                    public String orderAffichage = "22";
                                },
                                new Object() {
                                    public int id = 38;
                                    public int code = 38;
                                    public String libelle = "Option : 12000";
                                    public String formule = "Experimente Plus";
                                    public double plafond = 12000.0;
                                    public String orderAffichage = "38";
                                }
                        };
                        public boolean hasOption = false;
                        public boolean hasReductionVIP = true;
                        public boolean hasPrimeAnnuelle = true;
                        public boolean hasPrimeCorrective = true;
                        public boolean hasPrimeProrata = true;
                        public int order = 11;
                        public int code = 8;
                        public boolean hasCapital = false;
                        public boolean hasModeAssurance = false;
                        public boolean hasFranchise = false;
                        public boolean hasExtension = true;
                        public boolean hasTauxFranchise = false;
                    }
            };
        };
    }

// }