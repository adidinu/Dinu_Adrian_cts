package cts.farmacie.cinspe.clase;

import java.util.HashMap;
import java.util.Map;

public class SistemVanzare implements ISistemVanzare {

    private Map<Integer, Medicament> medicamente;
    private Medicament medicamentSelectat;

    public SistemVanzare(Map<Integer, Medicament> medicamente) {
        this.medicamente = medicamente;
        this.medicamentSelectat = null;
    }

    public SistemVanzare() {
        this.medicamente = new HashMap<>();
        this.medicamentSelectat = null;
    }

    public void adaugareMedicament(Integer id, Medicament medicament) {
        this.medicamente.put(id, medicament);
    }

    public void stergereMedicament(Integer id) {
        this.medicamente.remove(id);
    }

    @Override
    public void setareMedicamentSelectat(Integer id) {
        if (this.medicamente.containsKey(id)) {
            this.medicamentSelectat = this.medicamente.get(id);
        } else {
            throw new IllegalArgumentException("Medicamentul nu exista");
        }
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        return this.medicamentSelectat.getStoc() >= nrMedicamente;
    }

}
