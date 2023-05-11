package command.main;

import command.clase.Autobuz;
import command.clase.Automobil;
import command.clase.CommandPlecareInCursa;
import command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Automobil a = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, a));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, a));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}