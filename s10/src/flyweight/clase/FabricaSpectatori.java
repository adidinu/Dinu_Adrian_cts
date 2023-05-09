package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaSpectatori {
    private Map<Integer, ISpectator> spectatori;

    public FabricaSpectatori() {
        super();
        this.spectatori = new HashMap<>();
    }

    public ISpectator getSpectator(int id, double inaltime, double latimeUmeri) {
        if (this.spectatori.get(id) != null) {
            return this.spectatori.get(id);
        } else {
            ISpectator newSpectator = new Spectator(inaltime, latimeUmeri, id);
            spectatori.put(id, newSpectator);
            return newSpectator;
        }
    }
}
