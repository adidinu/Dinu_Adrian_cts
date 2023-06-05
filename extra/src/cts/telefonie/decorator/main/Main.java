package cts.telefonie.decorator.main;

import cts.telefonie.decorator.clase.Abonament;
import cts.telefonie.decorator.clase.AbonamentDecorat;
import cts.telefonie.decorator.clase.IAbonament;

public class Main {
    public static void main(String[] args) {
        IAbonament abonament = new Abonament(50, 25, 10);
        System.out.println(abonament.calculeazaCost(10));
        AbonamentDecorat abonamentDecorat = new AbonamentDecorat(abonament, true, true, true);
        System.out.println(abonamentDecorat.calculeazaCost(10));
        abonamentDecorat.setDate5G(false);
        System.out.println(abonamentDecorat.calculeazaCost(10));
    }
}
