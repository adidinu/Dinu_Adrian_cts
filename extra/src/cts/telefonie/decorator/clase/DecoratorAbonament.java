package cts.telefonie.decorator.clase;

public abstract class DecoratorAbonament implements IAbonament {
    private IAbonament abonament;
    protected boolean dateRoaming;
    protected boolean minuteRoaming;
    protected boolean date5G;

    public DecoratorAbonament(IAbonament abonament, boolean dateRoaming, boolean minuteRoaming, boolean date5G) {
        this.abonament = abonament;
        this.dateRoaming = dateRoaming;
        this.minuteRoaming = minuteRoaming;
        this.date5G = date5G;
    }

    public DecoratorAbonament(IAbonament abonament) {
        this.abonament = abonament;
        this.dateRoaming = false;
        this.minuteRoaming = false;
        this.date5G = false;
    }

    public void setDateRoaming(boolean dateRoaming) {
        this.dateRoaming = dateRoaming;
    }

    public void setMinuteRoaming(boolean minuteRoaming) {
        this.minuteRoaming = minuteRoaming;
    }

    public void setDate5G(boolean date5G) {
        this.date5G = date5G;
    }

    @Override
    public float calculeazaCost(int nrLuni) {
        float costTotal = abonament.calculeazaCost(nrLuni);
        costTotal += calculeazaCostExtra(nrLuni);
        return costTotal;
    }

    public abstract float calculeazaCostExtra(int nrLuni);
}
