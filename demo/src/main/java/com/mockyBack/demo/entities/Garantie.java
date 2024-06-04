package com.mockyBack.demo.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Garantie {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String libelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String codeGarantie;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double primeAnnuelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double primeAuProrata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idOptionGarantie;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean included;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean obligatoire;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean optionnelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer ordre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeGarantieProrata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeParafiscalProrata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeGarantieAnnuelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeParafiscalAnnuelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double commission;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeCommission;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double commissionProrata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeCommissionProrata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double commissionAnnuelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeCommissionAnnuelle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeGarantie;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double taxeParafiscal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double majorationBL;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String etat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String franchise;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String capitalGarantie;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String codeExtensionGarantie;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean minimal;


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
