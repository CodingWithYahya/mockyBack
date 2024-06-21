//package com.mockyBack.demo.entities.afterRc;
//
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//
//import javax.persistence.*;
//
////@Entity
////@Embeddable
////@Table(name = "active_garanties")
//public class ActiveGaranty {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private int id;
//
//    @Column(name = "code")
//    private Integer code;
//    @Column(name = "prime_prorata")
//    private Double primeProrata;
//
//    @Column(name = "prime_annuelle")
//    private Double primeAnnuelle;
//
//    @Column(name = "etat")
//    private String etat;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @Column(name = "extension")
//    private Integer extension;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @Column(name = "franchise")
//    private String franchise;
//
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name="offre_id", nullable=false)
////    private ChapeauPayload chapeauPayload;
////
////    public ChapeauPayload getChapeauPayload() {
////        return chapeauPayload;
////    }
////
////    public void setChapeauPayload(ChapeauPayload chapeauPayload) {
////        this.chapeauPayload = chapeauPayload;
////    }
//
//    public ActiveGaranty() {
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
//    public Integer getCode() {
//        return code;
//    }
//
//    public void setCode(Integer code) {
//        this.code = code;
//    }
//
//    public Double getPrimeProrata() {
//        return primeProrata;
//    }
//
//    public void setPrimeProrata(Double primeProrata) {
//        this.primeProrata = primeProrata;
//    }
//
//    public Double getPrimeAnnuelle() {
//        return primeAnnuelle;
//    }
//
//    public void setPrimeAnnuelle(Double primeAnnuelle) {
//        this.primeAnnuelle = primeAnnuelle;
//    }
//
//    public String getEtat() {
//        return etat;
//    }
//
//    public void setEtat(String etat) {
//        this.etat = etat;
//    }
//
//    public Integer getExtension() {
//        return extension;
//    }
//
//    public void setExtension(Integer extension) {
//        this.extension = extension;
//    }
//
//    public String getFranchise() {
//        return franchise;
//    }
//
//    public void setFranchise(String franchise) {
//        this.franchise = franchise;
//    }
//}
