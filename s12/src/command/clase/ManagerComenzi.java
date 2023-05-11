package command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> comenzi = new ArrayList<>();

    public void invocaComanda(ICommand comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if (comenzi.size() > 0) {
            comenzi.get(0).execute();
            comenzi.remove(this.comenzi.get(0));
        }
    }
}
