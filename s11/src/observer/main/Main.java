package observer.main;

import observer.clase.Banca;
import observer.clase.Client;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR");

        banca.adaugaObserver(new Client("Gigel"));
        banca.adaugaObserver(new Client("Ionel"));
        banca.adaugaObserver(new Client("Marcel"));


    }
}