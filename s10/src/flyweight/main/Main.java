package flyweight.main;

import flyweight.clase.FabricaSpectatori;
import flyweight.clase.PozitieDesenare;

public class Main {
    public static void main(String[] args) {
        FabricaSpectatori fabrica = new FabricaSpectatori();
        PozitieDesenare pozitie1 = new PozitieDesenare(20, 10, "verde");
        PozitieDesenare pozitie2 = new PozitieDesenare(25, 11, "rosu");
        PozitieDesenare pozitie3 = new PozitieDesenare(11, 55, "albastru");
        fabrica.getSpectator(1, 1.75, 50).deseneazaSpectator(pozitie3);
        fabrica.getSpectator(2, 1.8, 60).deseneazaSpectator(pozitie1);
        fabrica.getSpectator(1, 1.75, 25).deseneazaSpectator(pozitie2);


    }
}
