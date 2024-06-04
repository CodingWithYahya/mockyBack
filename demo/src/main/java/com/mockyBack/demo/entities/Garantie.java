package com.mockyBack.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Builder
@AllArgsConstructor

@Table(name = "garanties")
public class Garantie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "code_garantie")
    private String codeGarantie;

    @Column(name = "prime_annuelle")
    private Double primeAnnuelle;

    @Column(name = "prime_au_prorata")
    private Double primeAuProrata;

    @Column(name = "id_option_garantie")
    private String idOptionGarantie;

    @Column(name = "included")
    private Boolean included;

    @Column(name = "obligatoire")
    private Boolean obligatoire;

    @Column(name = "optionnelle")
    private Boolean optionnelle;

    @Column(name = "ordre")
    private Integer ordre;

    @Column(name = "taxe_garantie_prorata")
    private Double  taxeGarantieProrata;

    @Column(name = "taxe_parafiscal_prorata")
    private Double  taxeParafiscalProrata;

    @Column(name = "taxe_garantie_annuelle")
    private Double taxeGarantieAnnuelle;

    @Column(name = "taxe_parafiscal_annuelle")
    private Double taxeParafiscalAnnuelle;

    @Column(name = "commission")
    private Double commission;

    @Column(name = "taxe_commission")
    private Double taxeCommission;

    @Column(name = "commission_prorata")
    private Double commissionProrata;

    @Column(name = "taxe_commission_prorata")
    private Double taxeCommissionProrata;

    @Column(name = "commission_annuelle")
    private Double commissionAnnuelle;

    @Column(name = "taxe_commission_annuelle")
    private Double taxeCommissionAnnuelle;

    @Column(name = "taxe_garantie")
    private Double taxeGarantie;

    @Column(name = "taxe_parafiscal")
    private Double taxeParafiscal;

    @Column(name = "majoration_bl")
    private Double majorationBL;

    @Column(name = "etat")
    private String etat;
    @Column(name = "franchise")
    private String franchise;
    @Column(name = "capitalGarantie")
    private String capitalGarantie;
    @Column(name = "codeExtensionGarantie")
    private String codeExtensionGarantie;
    @Column(name = "minimal")
    private Boolean minimal;

    public Garantie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public Double getPrimeAnnuelle() {
        return primeAnnuelle;
    }

    public void setPrimeAnnuelle(Double primeAnnuelle) {
        this.primeAnnuelle = primeAnnuelle;
    }

    public Double getPrimeAuProrata() {
        return primeAuProrata;
    }

    public void setPrimeAuProrata(Double primeAuProrata) {
        this.primeAuProrata = primeAuProrata;
    }

    public String getIdOptionGarantie() {
        return idOptionGarantie;
    }

    public void setIdOptionGarantie(String idOptionGarantie) {
        this.idOptionGarantie = idOptionGarantie;
    }

    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    public Boolean getObligatoire() {
        return obligatoire;
    }

    public void setObligatoire(Boolean obligatoire) {
        this.obligatoire = obligatoire;
    }

    public Boolean getOptionnelle() {
        return optionnelle;
    }

    public void setOptionnelle(Boolean optionnelle) {
        this.optionnelle = optionnelle;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Double getTaxeGarantieProrata() {
        return taxeGarantieProrata;
    }

    public void setTaxeGarantieProrata(Double taxeGarantieProrata) {
        this.taxeGarantieProrata = taxeGarantieProrata;
    }

    public Double getTaxeParafiscalProrata() {
        return taxeParafiscalProrata;
    }

    public void setTaxeParafiscalProrata(Double taxeParafiscalProrata) {
        this.taxeParafiscalProrata = taxeParafiscalProrata;
    }

    public Double getTaxeGarantieAnnuelle() {
        return taxeGarantieAnnuelle;
    }

    public void setTaxeGarantieAnnuelle(Double taxeGarantieAnnuelle) {
        this.taxeGarantieAnnuelle = taxeGarantieAnnuelle;
    }

    public Double getTaxeParafiscalAnnuelle() {
        return taxeParafiscalAnnuelle;
    }

    public void setTaxeParafiscalAnnuelle(Double taxeParafiscalAnnuelle) {
        this.taxeParafiscalAnnuelle = taxeParafiscalAnnuelle;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getTaxeCommission() {
        return taxeCommission;
    }

    public void setTaxeCommission(Double taxeCommission) {
        this.taxeCommission = taxeCommission;
    }

    public Double getCommissionProrata() {
        return commissionProrata;
    }

    public void setCommissionProrata(Double commissionProrata) {
        this.commissionProrata = commissionProrata;
    }

    public Double getTaxeCommissionProrata() {
        return taxeCommissionProrata;
    }

    public void setTaxeCommissionProrata(Double taxeCommissionProrata) {
        this.taxeCommissionProrata = taxeCommissionProrata;
    }

    public Double getCommissionAnnuelle() {
        return commissionAnnuelle;
    }

    public void setCommissionAnnuelle(Double commissionAnnuelle) {
        this.commissionAnnuelle = commissionAnnuelle;
    }

    public Double getTaxeCommissionAnnuelle() {
        return taxeCommissionAnnuelle;
    }

    public void setTaxeCommissionAnnuelle(Double taxeCommissionAnnuelle) {
        this.taxeCommissionAnnuelle = taxeCommissionAnnuelle;
    }

    public Double getTaxeGarantie() {
        return taxeGarantie;
    }

    public void setTaxeGarantie(Double taxeGarantie) {
        this.taxeGarantie = taxeGarantie;
    }

    public Double getTaxeParafiscal() {
        return taxeParafiscal;
    }

    public void setTaxeParafiscal(Double taxeParafiscal) {
        this.taxeParafiscal = taxeParafiscal;
    }

    public Double getMajorationBL() {
        return majorationBL;
    }

    public void setMajorationBL(Double majorationBL) {
        this.majorationBL = majorationBL;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getCapitalGarantie() {
        return capitalGarantie;
    }

    public void setCapitalGarantie(String capitalGarantie) {
        this.capitalGarantie = capitalGarantie;
    }

    public String getCodeExtensionGarantie() {
        return codeExtensionGarantie;
    }

    public void setCodeExtensionGarantie(String codeExtensionGarantie) {
        this.codeExtensionGarantie = codeExtensionGarantie;
    }

    public Boolean getMinimal() {
        return minimal;
    }

    public void setMinimal(Boolean minimal) {
        this.minimal = minimal;
    }
}
