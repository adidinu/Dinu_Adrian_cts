package cts.farmacie.cinspe.clase;

public class Medicament {
    private Integer stoc;
    private String nume;

    public Medicament(Integer stoc, String nume) {
        this.stoc = stoc;
        this.nume = nume;
    }

    public Integer getStoc() {
        return stoc;
    }
}
