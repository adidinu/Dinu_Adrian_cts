package decorator.clase;

public abstract class Decorator implements IBilet {
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        this.printareMesajSustinere();
    }

    @Override
    public String getNumeEchipa1() {
        return bilet.getNumeEchipa1();
    }

    public abstract void printareMesajSustinere();
}
