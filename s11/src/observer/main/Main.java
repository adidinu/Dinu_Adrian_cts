package observer.main;

import observer.clase.Banca;
import observer.clase.Client;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR");

        Client c = new Client("Gigel");
        banca.adaugaObserver(c);
        banca.adaugaObserver(new Client("Ionel"));
        banca.adaugaObserver(new Client("Marcel"));

        banca.adaugaTipCreditNou("Credit imobiliar");
        banca.actualizeazaAplicatia();
        banca.adaugaObserver(new Client("Mihai"));
        banca.stergeObserver(c);
        banca.adaugaTipCreditNou("Credit de nevoi personale");
        banca.actualizeazaAplicatia();
    }
}