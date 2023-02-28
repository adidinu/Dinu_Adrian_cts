package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;


    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn_studii() {
        return an_studii;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", nrProiecte=" + nrProiecte + ", denumiriProiect=" + Arrays.toString(denumiriProiect) + "Facultate=" + facultate + ", An_studii=" + an_studii;
    }


    public int finantare() {
        int s = 20;
        System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }

}
