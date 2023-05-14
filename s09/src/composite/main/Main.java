package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.GrupComposite;

public class Main {

    public static void main(String[] args) {
        Element autobuzMic1 = new Autobuz("Ford Transit", 2000, 8);
        Element autobuzMic2 = new Autobuz("Mercedes Citaro", 3000, 7);
        Element grupAutobuzeMici = new GrupComposite("Autobuze mici");

        grupAutobuzeMici.adaugaGrup(autobuzMic1);
        grupAutobuzeMici.adaugaGrup(autobuzMic2);
        grupAutobuzeMici.afisareSumaAsigurare();

        Element autobuz3 = new Autobuz("Volkswagen", 3500, 15);
        Element autobuz4 = new Autobuz("Dodge", 6200, 15);
        Element grupAutobuzeMijlocii = new GrupComposite("Autobuze Mijlocii");

        grupAutobuzeMijlocii.adaugaGrup(autobuz3);
        grupAutobuzeMijlocii.adaugaGrup(autobuz4);
        grupAutobuzeMijlocii.afisareSumaAsigurare();

        Element flota = new GrupComposite("Autobuze de toate felurile");
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.adaugaGrup(grupAutobuzeMici);
        flota.afisareSumaAsigurare();

        Element autobuzVip = new Autobuz("Dita", 300000, 4000);

        flota.adaugaGrup(autobuzVip);
        flota.afisareSumaAsigurare();
    }

}
