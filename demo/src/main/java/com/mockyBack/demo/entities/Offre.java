package com.mockyBack.demo.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "offres")
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "prime_net_ht")
    private double primeNetHT;

    @Column(name = "prime_total_ttc")
    private double primeTotalTTC;

    @Column(name = "taxes")
    private double taxes;

    @Column(name = "taxe_parafiscal")
    private double taxeParafiscal;

    @Column(name = "taxes_prorata")
    private double taxesProrata;

    @Column(name = "taxe_parafiscal_prorata")
    private double taxeParafiscalProrata;

    @Column(name = "taxes_annuelle")
    private double taxesAnnuelle;

    @Column(name = "taxe_parafiscal_annuelle")
    private double taxeParafiscalAnnuelle;

    @Column(name = "prime_annuelle_ht")
    private double primeAnnuelleHT;

    @Column(name = "prime_prorata_ht")
    private double primeProrataHT;

    @Column(name = "prime_annuelle_ttc")
    private double primeAnnuelleTTC;

    @Column(name = "prime_prorata_ttc")
    private double primeProrataTTC;

    @Column(name = "taxe_cnpac")
    private double taxeCNPAC;

    @Column(name = "timbre")
    private double timbre;

    @Column(name = "accessoires")
    private double accessoires;

    @Column(name = "commission")
    private double commission;

    @Column(name = "commission_annuelle")
    private double commissionAnnuelle;

    @Column(name = "commission_prorata")
    private double commissionProrata;

    @Column(name = "taxe_commission")
    private double taxeCommission;

    @Column(name = "taxe_commission_prorata")
    private double taxeCommissionProrata;

    @Column(name = "taxe_commission_annuelle")
    private double taxeCommissionAnnuelle;

    @Column(name = "base_prime_annuelle")
    private double basePrimeAnnuelle;

    @Column(name = "compl_prime_annuelle")
    private double complPrimeAnnuelle;

    @Column(name = "base_prime_prorata")
    private double basePrimeProrata;

    @Column(name = "compl_prime_prorata")
    private double complPrimeProrata;

    @Column(name = "included")
    private Boolean included;

    @Column(name = "eligible")
    private Boolean eligible;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "offre_id")
    private List<Garantie> garanties;

    @Column(name = "nombre_extincteur")
    private String nombreExtincteur;

    public Offre() {
    }

    public Offre(int id, String libelle, double primeNetHT, double primeTotalTTC, double taxes, double taxeParafiscal, double taxesProrata, double taxeParafiscalProrata, double taxesAnnuelle, double taxeParafiscalAnnuelle, double primeAnnuelleHT, double primeProrataHT, double primeAnnuelleTTC, double primeProrataTTC, double taxeCNPAC, double timbre, double accessoires, double commission, double commissionAnnuelle, double commissionProrata, double taxeCommission, double taxeCommissionProrata, double taxeCommissionAnnuelle, double basePrimeAnnuelle, double complPrimeAnnuelle, double basePrimeProrata, double complPrimeProrata, Boolean included, Boolean eligible, List<Garantie> garanties, String nombreExtincteur) {
        this.id = id;
        this.libelle = libelle;
        this.primeNetHT = primeNetHT;
        this.primeTotalTTC = primeTotalTTC;
        this.taxes = taxes;
        this.taxeParafiscal = taxeParafiscal;
        this.taxesProrata = taxesProrata;
        this.taxeParafiscalProrata = taxeParafiscalProrata;
        this.taxesAnnuelle = taxesAnnuelle;
        this.taxeParafiscalAnnuelle = taxeParafiscalAnnuelle;
        this.primeAnnuelleHT = primeAnnuelleHT;
        this.primeProrataHT = primeProrataHT;
        this.primeAnnuelleTTC = primeAnnuelleTTC;
        this.primeProrataTTC = primeProrataTTC;
        this.taxeCNPAC = taxeCNPAC;
        this.timbre = timbre;
        this.accessoires = accessoires;
        this.commission = commission;
        this.commissionAnnuelle = commissionAnnuelle;
        this.commissionProrata = commissionProrata;
        this.taxeCommission = taxeCommission;
        this.taxeCommissionProrata = taxeCommissionProrata;
        this.taxeCommissionAnnuelle = taxeCommissionAnnuelle;
        this.basePrimeAnnuelle = basePrimeAnnuelle;
        this.complPrimeAnnuelle = complPrimeAnnuelle;
        this.basePrimeProrata = basePrimeProrata;
        this.complPrimeProrata = complPrimeProrata;
        this.included = included;
        this.eligible = eligible;
        this.garanties = garanties;
        this.nombreExtincteur = nombreExtincteur;
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

    public double getPrimeNetHT() {
        return primeNetHT;
    }

    public void setPrimeNetHT(double primeNetHT) {
        this.primeNetHT = primeNetHT;
    }

    public double getPrimeTotalTTC() {
        return primeTotalTTC;
    }

    public void setPrimeTotalTTC(double primeTotalTTC) {
        this.primeTotalTTC = primeTotalTTC;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getTaxeParafiscal() {
        return taxeParafiscal;
    }

    public void setTaxeParafiscal(double taxeParafiscal) {
        this.taxeParafiscal = taxeParafiscal;
    }

    public double getTaxesProrata() {
        return taxesProrata;
    }

    public void setTaxesProrata(double taxesProrata) {
        this.taxesProrata = taxesProrata;
    }

    public double getTaxeParafiscalProrata() {
        return taxeParafiscalProrata;
    }

    public void setTaxeParafiscalProrata(double taxeParafiscalProrata) {
        this.taxeParafiscalProrata = taxeParafiscalProrata;
    }

    public double getTaxesAnnuelle() {
        return taxesAnnuelle;
    }

    public void setTaxesAnnuelle(double taxesAnnuelle) {
        this.taxesAnnuelle = taxesAnnuelle;
    }

    public double getTaxeParafiscalAnnuelle() {
        return taxeParafiscalAnnuelle;
    }

    public void setTaxeParafiscalAnnuelle(double taxeParafiscalAnnuelle) {
        this.taxeParafiscalAnnuelle = taxeParafiscalAnnuelle;
    }

    public double getPrimeAnnuelleHT() {
        return primeAnnuelleHT;
    }

    public void setPrimeAnnuelleHT(double primeAnnuelleHT) {
        this.primeAnnuelleHT = primeAnnuelleHT;
    }

    public double getPrimeProrataHT() {
        return primeProrataHT;
    }

    public void setPrimeProrataHT(double primeProrataHT) {
        this.primeProrataHT = primeProrataHT;
    }

    public double getPrimeAnnuelleTTC() {
        return primeAnnuelleTTC;
    }

    public void setPrimeAnnuelleTTC(double primeAnnuelleTTC) {
        this.primeAnnuelleTTC = primeAnnuelleTTC;
    }

    public double getPrimeProrataTTC() {
        return primeProrataTTC;
    }

    public void setPrimeProrataTTC(double primeProrataTTC) {
        this.primeProrataTTC = primeProrataTTC;
    }

    public double getTaxeCNPAC() {
        return taxeCNPAC;
    }

    public void setTaxeCNPAC(double taxeCNPAC) {
        this.taxeCNPAC = taxeCNPAC;
    }

    public double getTimbre() {
        return timbre;
    }

    public void setTimbre(double timbre) {
        this.timbre = timbre;
    }

    public double getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(double accessoires) {
        this.accessoires = accessoires;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCommissionAnnuelle() {
        return commissionAnnuelle;
    }

    public void setCommissionAnnuelle(double commissionAnnuelle) {
        this.commissionAnnuelle = commissionAnnuelle;
    }

    public double getCommissionProrata() {
        return commissionProrata;
    }

    public void setCommissionProrata(double commissionProrata) {
        this.commissionProrata = commissionProrata;
    }

    public double getTaxeCommission() {
        return taxeCommission;
    }

    public void setTaxeCommission(double taxeCommission) {
        this.taxeCommission = taxeCommission;
    }

    public double getTaxeCommissionProrata() {
        return taxeCommissionProrata;
    }

    public void setTaxeCommissionProrata(double taxeCommissionProrata) {
        this.taxeCommissionProrata = taxeCommissionProrata;
    }

    public double getTaxeCommissionAnnuelle() {
        return taxeCommissionAnnuelle;
    }

    public void setTaxeCommissionAnnuelle(double taxeCommissionAnnuelle) {
        this.taxeCommissionAnnuelle = taxeCommissionAnnuelle;
    }

    public double getBasePrimeAnnuelle() {
        return basePrimeAnnuelle;
    }

    public void setBasePrimeAnnuelle(double basePrimeAnnuelle) {
        this.basePrimeAnnuelle = basePrimeAnnuelle;
    }

    public double getComplPrimeAnnuelle() {
        return complPrimeAnnuelle;
    }

    public void setComplPrimeAnnuelle(double complPrimeAnnuelle) {
        this.complPrimeAnnuelle = complPrimeAnnuelle;
    }

    public double getBasePrimeProrata() {
        return basePrimeProrata;
    }

    public void setBasePrimeProrata(double basePrimeProrata) {
        this.basePrimeProrata = basePrimeProrata;
    }

    public double getComplPrimeProrata() {
        return complPrimeProrata;
    }

    public void setComplPrimeProrata(double complPrimeProrata) {
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
