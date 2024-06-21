//package com.mockyBack.demo.entities.afterRc;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Embeddable
//public class AdditionalFields {
//
//    @Column(name = "date_mise_en_circulation")
//    private String dateMiseEnCirculation;
//
//    @Column(name = "heure_mise_en_circulation")
//    private String heureMiseEnCirculation;
//
//    @Column(name = "id_tarif")
//    private int idTarif;
//
//    @ElementCollection
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @CollectionTable(name = "active_garanties", joinColumns = @JoinColumn(name = "idObjetFromCh"))
//    private List<ActiveGaranty> activeGaranties;
//
//    @ElementCollection
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @CollectionTable(name = "remorques", joinColumns = @JoinColumn(name = "idObjetFromCh"))
//    private List<Remorque> remorques;
//
//    public AdditionalFields() {
//    }
//
//    public String getDateMiseEnCirculation() {
//        return dateMiseEnCirculation;
//    }
//
//    public void setDateMiseEnCirculation(String dateMiseEnCirculation) {
//        this.dateMiseEnCirculation = dateMiseEnCirculation;
//    }
//
//    public String getHeureMiseEnCirculation() {
//        return heureMiseEnCirculation;
//    }
//
//    public void setHeureMiseEnCirculation(String heureMiseEnCirculation) {
//        this.heureMiseEnCirculation = heureMiseEnCirculation;
//    }
//
//    public int getIdTarif() {
//        return idTarif;
//    }
//
//    public void setIdTarif(int idTarif) {
//        this.idTarif = idTarif;
//    }
//
//    public List<ActiveGaranty> getActiveGaranties() {
//        return activeGaranties;
//    }
//
//    public void setActiveGaranties(List<ActiveGaranty> activeGaranties) {
//        this.activeGaranties = activeGaranties;
//    }
//
//    public List<Remorque> getRemorques() {
//        return remorques;
//    }
//
//    public void setRemorques(List<Remorque> remorques) {
//        this.remorques = remorques;
//    }
//}
