package com.mockyBack.demo.entities;


import javax.persistence.*;

@Entity
@Table(name = "default_plans")
public class DefaultPlans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "forfait")
    private double forfait;

    @Column(name = "forfait_nre_place")
    private int forfaitNrePlace;

    @Column(name = "taux_majoration_remorque")
    private double tauxMajorationRemorque;

    @Column(name = "code_usage_vehicule_min")
    private int codeUsageVehiculeMin;

    @Column(name = "code_usage_vehicule_max")
    private int codeUsageVehiculeMax;

    @Column(name = "carburant_min")
    private int carburantMin;

    @Column(name = "carburant_max")
    private int carburantMax;

    @Column(name = "puissance_fiscale_min")
    private int puissanceFiscaleMin;

    @Column(name = "puissance_fiscale_max")
    private int puissanceFiscaleMax;

    @Column(name = "ptc_max")
    private int ptcMax;

    @Column(name = "ptc_min")
    private int ptcMin;

    @Column(name = "avec_remorque")
    private int avecRemorque;

    public DefaultPlans() {
    }

    public DefaultPlans(double forfait, int forfaitNrePlace, double tauxMajorationRemorque, int codeUsageVehiculeMin, int codeUsageVehiculeMax, int carburantMin, int carburantMax, int puissanceFiscaleMin, int puissanceFiscaleMax, int ptcMax, int ptcMin, int avecRemorque) {
        this.forfait = forfait;
        this.forfaitNrePlace = forfaitNrePlace;
        this.tauxMajorationRemorque = tauxMajorationRemorque;
        this.codeUsageVehiculeMin = codeUsageVehiculeMin;
        this.codeUsageVehiculeMax = codeUsageVehiculeMax;
        this.carburantMin = carburantMin;
        this.carburantMax = carburantMax;
        this.puissanceFiscaleMin = puissanceFiscaleMin;
        this.puissanceFiscaleMax = puissanceFiscaleMax;
        this.ptcMax = ptcMax;
        this.ptcMin = ptcMin;
        this.avecRemorque = avecRemorque;
    }

    public DefaultPlans(Long id, double forfait, int forfaitNrePlace, double tauxMajorationRemorque, int codeUsageVehiculeMin, int codeUsageVehiculeMax, int carburantMin, int carburantMax, int puissanceFiscaleMin, int puissanceFiscaleMax, int ptcMax, int ptcMin, int avecRemorque) {
        this.id = id;
        this.forfait = forfait;
        this.forfaitNrePlace = forfaitNrePlace;
        this.tauxMajorationRemorque = tauxMajorationRemorque;
        this.codeUsageVehiculeMin = codeUsageVehiculeMin;
        this.codeUsageVehiculeMax = codeUsageVehiculeMax;
        this.carburantMin = carburantMin;
        this.carburantMax = carburantMax;
        this.puissanceFiscaleMin = puissanceFiscaleMin;
        this.puissanceFiscaleMax = puissanceFiscaleMax;
        this.ptcMax = ptcMax;
        this.ptcMin = ptcMin;
        this.avecRemorque = avecRemorque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getForfait() {
        return forfait;
    }

    public void setForfait(double forfait) {
        this.forfait = forfait;
    }

    public int getForfaitNrePlace() {
        return forfaitNrePlace;
    }

    public void setForfaitNrePlace(int forfaitNrePlace) {
        this.forfaitNrePlace = forfaitNrePlace;
    }

    public double getTauxMajorationRemorque() {
        return tauxMajorationRemorque;
    }

    public void setTauxMajorationRemorque(double tauxMajorationRemorque) {
        this.tauxMajorationRemorque = tauxMajorationRemorque;
    }

    public int getCodeUsageVehiculeMin() {
        return codeUsageVehiculeMin;
    }

    public void setCodeUsageVehiculeMin(int codeUsageVehiculeMin) {
        this.codeUsageVehiculeMin = codeUsageVehiculeMin;
    }

    public int getCodeUsageVehiculeMax() {
        return codeUsageVehiculeMax;
    }

    public void setCodeUsageVehiculeMax(int codeUsageVehiculeMax) {
        this.codeUsageVehiculeMax = codeUsageVehiculeMax;
    }

    public int getCarburantMin() {
        return carburantMin;
    }

    public void setCarburantMin(int carburantMin) {
        this.carburantMin = carburantMin;
    }

    public int getCarburantMax() {
        return carburantMax;
    }

    public void setCarburantMax(int carburantMax) {
        this.carburantMax = carburantMax;
    }

    public int getPuissanceFiscaleMin() {
        return puissanceFiscaleMin;
    }

    public void setPuissanceFiscaleMin(int puissanceFiscaleMin) {
        this.puissanceFiscaleMin = puissanceFiscaleMin;
    }

    public int getPuissanceFiscaleMax() {
        return puissanceFiscaleMax;
    }

    public void setPuissanceFiscaleMax(int puissanceFiscaleMax) {
        this.puissanceFiscaleMax = puissanceFiscaleMax;
    }

    public int getPtcMax() {
        return ptcMax;
    }

    public void setPtcMax(int ptcMax) {
        this.ptcMax = ptcMax;
    }

    public int getPtcMin() {
        return ptcMin;
    }

    public void setPtcMin(int ptcMin) {
        this.ptcMin = ptcMin;
    }

    public int getAvecRemorque() {
        return avecRemorque;
    }

    public void setAvecRemorque(int avecRemorque) {
        this.avecRemorque = avecRemorque;
    }
}
