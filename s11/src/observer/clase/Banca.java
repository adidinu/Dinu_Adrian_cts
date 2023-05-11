package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca {

    private String numeBanca;
    private List<IClient> listaClienti;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void stergeObserver(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IClient client : listaClienti) {
            client.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaTipCreditNou(String tipCredit) {
        trimiteNotificare("Banca " + numeBanca + " a adaugat un tip nou de credit: " + tipCredit);
    }

    public void actualizeazaAplicatia() {
        trimiteNotificare("Banca " + numeBanca + " a actualizat aplicatia");
    }
}
