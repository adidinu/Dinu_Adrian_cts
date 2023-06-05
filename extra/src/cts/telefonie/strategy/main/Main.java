package cts.telefonie.strategy.main;

import cts.telefonie.strategy.clase.EmitatorAbonamente;
import cts.telefonie.strategy.clase.MobilityY;
import cts.telefonie.strategy.clase.MobilityZ;

public class Main {
    public static void main(String[] args) {
        EmitatorAbonamente emitator = new EmitatorAbonamente("VODAFONE MAFIA");

        emitator.emiteFactura(12);

        emitator.setSubscription(new MobilityY(50));
        emitator.emiteFactura(8);

        emitator.setSubscription(new MobilityZ(500, 30, 20));
        emitator.emiteFactura(24);
    }
}
