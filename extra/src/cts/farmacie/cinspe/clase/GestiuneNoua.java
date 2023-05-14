package cts.farmacie.cinspe.clase;

public class GestiuneNoua implements ISistemVanzare {
    SistemVanzare sistemVanzare;

    public GestiuneNoua(SistemVanzare sistemVanzare) {
        this.sistemVanzare = sistemVanzare;
    }

    public boolean verificaStocPentruMedicament(Integer id, int nrMedicamente) {
        this.setareMedicamentSelectat(id);
        return this.verificareDisponibilitate(nrMedicamente);
    }

    @Override
    public void setareMedicamentSelectat(Integer id) {
        sistemVanzare.setareMedicamentSelectat(id);
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        return sistemVanzare.verificareDisponibilitate(nrMedicamente);
    }
}
