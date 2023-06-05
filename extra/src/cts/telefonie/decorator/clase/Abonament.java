package cts.telefonie.decorator.clase;

public class Abonament implements IAbonament {
    private int minuteVoce;
    private int date;
    private int tv;

    public Abonament(int minuteVoce, int date, int tv) {
        this.minuteVoce = minuteVoce;
        this.date = date;
        this.tv = tv;
    }

    @Override
    public float calculeazaCost(int nrLuni) {
        return (0.5f * minuteVoce + 2 * date + 10 * tv) * nrLuni;
    }
}
