package template.main;

import template.clase.Bancomat;
import template.clase.BancomatAbstract;
import template.clase.BancomatBitcoin;

public class Main {
    public static void main(String[] args) {
        BancomatAbstract bancomat = new Bancomat("Romana");

        bancomat.scoateBaniDeLaBancomat(500);

        System.out.println();
        BancomatAbstract bancomatBitcoin = new BancomatBitcoin("Puscarie");

        bancomatBitcoin.scoateBaniDeLaBancomat(1000);
    }
}
