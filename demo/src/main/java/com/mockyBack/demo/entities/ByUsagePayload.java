package com.mockyBack.demo.entities;


import javax.persistence.*;

@Entity
@Table(name = "by_usage_payload")
public class ByUsagePayload {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idObjetFromByUsage;

    @Column(name = "usageVehiculeCode")
    private String usageVehiculeCode;
    @Column(name = "dateMEC")
    private String dateMEC;
    @Column(name = "intermediaireId")
    private int intermediaireId;
    @Column(name = "idProduit")
    private String idProduit;
    @Column(name = "dateEvenement")
    private String dateEvenement;
    @Column(name = "dateEffet")
    private String dateEffet;
    @Column(name = "avec_delegation")
    private boolean avecDelegation;
    @Column(name = "carburant")
    private String carburant;
    @Column(name = "puissanceFiscale")
    private int puissanceFiscale;
    @Column(name = "duree")
    private String duree;
    @Column(name = "typeAvenant")
    private String typeAvenant;

    public ByUsagePayload() {
    }

    public int getIdObjetFromByUsage() {
        return idObjetFromByUsage;
    }

    public void setIdObjetFromByUsage(int idObjetFromByUsage) {
        this.idObjetFromByUsage = idObjetFromByUsage;
    }

    public String getUsageVehiculeCode() {
        return usageVehiculeCode;
    }

    public void setUsageVehiculeCode(String usageVehiculeCode) {
        this.usageVehiculeCode = usageVehiculeCode;
    }

    public String getDateMEC() {
        return dateMEC;
    }

    public void setDateMEC(String dateMEC) {
        this.dateMEC = dateMEC;
    }

    public int getIntermediaireId() {
        return intermediaireId;
    }

    public void setIntermediaireId(int intermediaireId) {
        this.intermediaireId = intermediaireId;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(String dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public String getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
    }

    public boolean isAvecDelegation() {
        return avecDelegation;
    }

    public void setAvecDelegation(boolean avecDelegation) {
        this.avecDelegation = avecDelegation;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public int getPuissanceFiscale() {
        return puissanceFiscale;
    }

    public void setPuissanceFiscale(int puissanceFiscale) {
        this.puissanceFiscale = puissanceFiscale;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getTypeAvenant() {
        return typeAvenant;
    }

    public void setTypeAvenant(String typeAvenant) {
        this.typeAvenant = typeAvenant;
    }
}
