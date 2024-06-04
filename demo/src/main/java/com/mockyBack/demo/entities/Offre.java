package com.mockyBack.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Setter
@Getter
public class Offre {
    private Integer id;
    private String libelle;
    private Double primeNetHT;
    private Double primeTotalTTC;
    private Double taxes;
    private Double taxeParafiscal;
    private Double taxesProrata;
    private Double taxeParafiscalProrata;
    private Double taxesAnnuelle;
    private Double taxeParafiscalAnuuelle;
    private Double primeAnnuelleHT;
    private Double primeProrataHT;
    private Double primeAnnuelleTTC;
    private Double primeProrataTTC;
    private Double taxeCNPAC;
    private Double timbre;
    private Double accessoires;
    private Double commission;
    private Double commissionAnnuelle;
    private Double commissionProrata;
    private Double taxeCommission;
    private Double taxeCommissionProrata;
    private Double taxeCommissionAnnuelle;
    private Double basePrimeAnnuelle;
    private Double complPrimeAnnuelle;
    private Double basePrimeProrata;
    private Double complPrimeProrata;
    private Boolean included;
    private Boolean eligible;
    private List<Garantie> garanties;
    private String nombreExtincteur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrimeNetHT() {
        return primeNetHT;
    }

    public void setPrimeNetHT(Double primeNetHT) {
        this.primeNetHT = primeNetHT;
    }

    public Double getPrimeTotalTTC() {
        return primeTotalTTC;
    }

    public void setPrimeTotalTTC(Double primeTotalTTC) {
        this.primeTotalTTC = primeTotalTTC;
    }

    public Double getTaxes() {
        return taxes;
    }

    public void setTaxes(Double taxes) {
        this.taxes = taxes;
    }

    public Double getTaxeParafiscal() {
        return taxeParafiscal;
    }

    public void setTaxeParafiscal(Double taxeParafiscal) {
        this.taxeParafiscal = taxeParafiscal;
    }

    public Double getTaxesProrata() {
        return taxesProrata;
    }

    public void setTaxesProrata(Double taxesProrata) {
        this.taxesProrata = taxesProrata;
    }

    public Double getTaxeParafiscalProrata() {
        return taxeParafiscalProrata;
    }

    public void setTaxeParafiscalProrata(Double taxeParafiscalProrata) {
        this.taxeParafiscalProrata = taxeParafiscalProrata;
    }

    public Double getTaxesAnnuelle() {
        return taxesAnnuelle;
    }

    public void setTaxesAnnuelle(Double taxesAnnuelle) {
        this.taxesAnnuelle = taxesAnnuelle;
    }

    public Double getTaxeParafiscalAnuuelle() {
        return taxeParafiscalAnuuelle;
    }

    public void setTaxeParafiscalAnuuelle(Double taxeParafiscalAnuuelle) {
        this.taxeParafiscalAnuuelle = taxeParafiscalAnuuelle;
    }

    public Double getPrimeAnnuelleHT() {
        return primeAnnuelleHT;
    }

    public void setPrimeAnnuelleHT(Double primeAnnuelleHT) {
        this.primeAnnuelleHT = primeAnnuelleHT;
    }

    public Double getPrimeProrataHT() {
        return primeProrataHT;
    }

    public void setPrimeProrataHT(Double primeProrataHT) {
        this.primeProrataHT = primeProrataHT;
    }

    public Double getPrimeAnnuelleTTC() {
        return primeAnnuelleTTC;
    }

    public void setPrimeAnnuelleTTC(Double primeAnnuelleTTC) {
        this.primeAnnuelleTTC = primeAnnuelleTTC;
    }

    public Double getPrimeProrataTTC() {
        return primeProrataTTC;
    }

    public void setPrimeProrataTTC(Double primeProrataTTC) {
        this.primeProrataTTC = primeProrataTTC;
    }

    public Double getTaxeCNPAC() {
        return taxeCNPAC;
    }

    public void setTaxeCNPAC(Double taxeCNPAC) {
        this.taxeCNPAC = taxeCNPAC;
    }

    public Double getTimbre() {
        return timbre;
    }

    public void setTimbre(Double timbre) {
        this.timbre = timbre;
    }

    public Double getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(Double accessoires) {
        this.accessoires = accessoires;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getCommissionAnnuelle() {
        return commissionAnnuelle;
    }

    public void setCommissionAnnuelle(Double commissionAnnuelle) {
        this.commissionAnnuelle = commissionAnnuelle;
    }

    public Double getCommissionProrata() {
        return commissionProrata;
    }

    public void setCommissionProrata(Double commissionProrata) {
        this.commissionProrata = commissionProrata;
    }

    public Double getTaxeCommission() {
        return taxeCommission;
    }

    public void setTaxeCommission(Double taxeCommission) {
        this.taxeCommission = taxeCommission;
    }

    public Double getTaxeCommissionProrata() {
        return taxeCommissionProrata;
    }

    public void setTaxeCommissionProrata(Double taxeCommissionProrata) {
        this.taxeCommissionProrata = taxeCommissionProrata;
    }

    public Double getTaxeCommissionAnnuelle() {
        return taxeCommissionAnnuelle;
    }

    public void setTaxeCommissionAnnuelle(Double taxeCommissionAnnuelle) {
        this.taxeCommissionAnnuelle = taxeCommissionAnnuelle;
    }

    public Double getBasePrimeAnnuelle() {
        return basePrimeAnnuelle;
    }

    public void setBasePrimeAnnuelle(Double basePrimeAnnuelle) {
        this.basePrimeAnnuelle = basePrimeAnnuelle;
    }

    public Double getComplPrimeAnnuelle() {
        return complPrimeAnnuelle;
    }

    public void setComplPrimeAnnuelle(Double complPrimeAnnuelle) {
        this.complPrimeAnnuelle = complPrimeAnnuelle;
    }

    public Double getBasePrimeProrata() {
        return basePrimeProrata;
    }

    public void setBasePrimeProrata(Double basePrimeProrata) {
        this.basePrimeProrata = basePrimeProrata;
    }

    public Double getComplPrimeProrata() {
        return complPrimeProrata;
    }

    public void setComplPrimeProrata(Double complPrimeProrata) {
        this.complPrimeProrata = complPrimeProrata;
    }

    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    public List<Garantie> getGaranties() {
        return garanties;
    }

    public void setGaranties(List<Garantie> garanties) {
        this.garanties = garanties;
    }

    public String getNombreExtincteur() {
        return nombreExtincteur;
    }

    public void setNombreExtincteur(String nombreExtincteur) {
        this.nombreExtincteur = nombreExtincteur;
    }
}
