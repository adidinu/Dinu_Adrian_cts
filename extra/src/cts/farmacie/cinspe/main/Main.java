package cts.farmacie.cinspe.main;

import cts.farmacie.cinspe.clase.GestiuneNoua;
import cts.farmacie.cinspe.clase.Medicament;
import cts.farmacie.cinspe.clase.SistemVanzare;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Medicament m1 = new Medicament(10, "Paracetamol");
        Medicament m2 = new Medicament(20, "Nurofen");
        Medicament m3 = new Medicament(15, "Algocalmin");
        Medicament m4 = new Medicament(5, "Aspirina");

        Map<Integer, Medicament> medicamente = new HashMap<>();

        medicamente.put(1, m1);
        medicamente.put(2, m2);
        medicamente.put(3, m3);
        medicamente.put(4, m4);

        SistemVanzare sistem = new SistemVanzare(medicamente);

        sistem.setareMedicamentSelectat(1);
        System.out.println(sistem.verificareDisponibilitate(5));

        GestiuneNoua sistemNou = new GestiuneNoua(sistem);

        System.out.println(sistemNou.verificaStocPentruMedicament(2, 25));
        System.out.println(sistemNou.verificaStocPentruMedicament(3, 10));
    }
}