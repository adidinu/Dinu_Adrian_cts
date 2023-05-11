package stare.clase;

public class Bancomat {
    private Integer baniRamasi;
    private IStare stare;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        this.stare = new StareNuAreCard();
    }

    public IStare getStare() {
        return stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public void introducereCard() {
        IStare stare = new StareAreCard();
        stare.modificareStare(this);
    }

    public void introducerePIN() {
        IStare stare = new StareArePinIntrodus();
        stare.modificareStare(this);
    }

    public void retrageBani(Integer suma) {
        if (this.stare instanceof StareArePinIntrodus) {
            if (baniRamasi >= suma) {
                System.out.println("A fost retrasa suma de " + suma + " lei.");
                baniRamasi -= suma;
                if (baniRamasi == 0) {
                    IStare stare = new StareNuAreBani();
                    stare.modificareStare(this);
                }
            } else {
                System.out.println("Nu sunt suficienti bani in cont.");
            }
        }
    }

    public void retrageCard() {
        IStare stare = new StareNuAreCard();
        stare.modificareStare(this);
    }

}
