//package com.mockyBack.demo.entities.afterRc;
//
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.mockyBack.demo.entities.ChapeauPayload;
//
//import javax.persistence.*;
//
////@Entity
////@Embeddable
////@Table(name = "remorque")
//public class Remorque {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private int id;
//    @Column(name = "numero_ordre_remorque")
//    private String numeroOrdreRemorque;
//    @Column(name = "type_immatriculation_remorque")
//    private String typeImmatriculationRemorque;
//
//    @Column(name = "immatriculation_remorque")
//    private String immatriculationRemorque;
//
//    @Column(name = "date_mise_en_circulation_remorque")
//    private String dateMiseEnCirculationRemorque;
//
//    @Column(name = "marque_remorque")
//    private String marqueRemorque;
//
//    @Column(name = "ptc_remorque")
//    private String ptcRemorque;
//
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name="offre_id", nullable=false)
////    private ChapeauPayload chapeauPayload;
////
////
////    public ChapeauPayload getChapeauPayload() {
////        return chapeauPayload;
////    }
////
////    public void setChapeauPayload(ChapeauPayload chapeauPayload) {
////        this.chapeauPayload = chapeauPayload;
////    }
//
//    public Remorque() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNumeroOrdreRemorque() {
//        return numeroOrdreRemorque;
//    }
//
//    public void setNumeroOrdreRemorque(String numeroOrdreRemorque) {
//        this.numeroOrdreRemorque = numeroOrdreRemorque;
//    }
//
//    public String getTypeImmatriculationRemorque() {
//        return typeImmatriculationRemorque;
//    }
//
//    public void setTypeImmatriculationRemorque(String typeImmatriculationRemorque) {
//        this.typeImmatriculationRemorque = typeImmatriculationRemorque;
//    }
//
//    public String getImmatriculationRemorque() {
//        return immatriculationRemorque;
//    }
//
//    public void setImmatriculationRemorque(String immatriculationRemorque) {
//        this.immatriculationRemorque = immatriculationRemorque;
//    }
//
//    public String getDateMiseEnCirculationRemorque() {
//        return dateMiseEnCirculationRemorque;
//    }
//
//    public void setDateMiseEnCirculationRemorque(String dateMiseEnCirculationRemorque) {
//        this.dateMiseEnCirculationRemorque = dateMiseEnCirculationRemorque;
//    }
//
//    public String getMarqueRemorque() {
//        return marqueRemorque;
//    }
//
//    public void setMarqueRemorque(String marqueRemorque) {
//        this.marqueRemorque = marqueRemorque;
//    }
//
//    public String getPtcRemorque() {
//        return ptcRemorque;
//    }
//
//    public void setPtcRemorque(String ptcRemorque) {
//        this.ptcRemorque = ptcRemorque;
//    }
//}
