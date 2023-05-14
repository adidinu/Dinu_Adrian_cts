package cts.farmacie.cinspe.clase;

public interface ISistemVanzare {
    void setareMedicamentSelectat(Integer id);

    boolean verificareDisponibilitate(int nrMedicamente);
}
