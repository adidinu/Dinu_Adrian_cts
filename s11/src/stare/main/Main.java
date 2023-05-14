package stare.main;

import stare.clase.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000);

        bancomat.introducerePIN();
        bancomat.retrageBani(300);

        bancomat.introducereCard();
        bancomat.introducerePIN();
        bancomat.retrageBani(400);
        bancomat.retrageBani(800);
        bancomat.retrageBani(600);
        bancomat.retrageCard();
    }
}
