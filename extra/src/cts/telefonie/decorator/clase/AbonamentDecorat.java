package cts.telefonie.decorator.clase;

public class AbonamentDecorat extends DecoratorAbonament {
    public AbonamentDecorat(IAbonament abonament) {
        super(abonament);
    }

    public AbonamentDecorat(IAbonament abonament, boolean dateRoaming, boolean minuteRoaming, boolean date5G) {
        super(abonament, dateRoaming, minuteRoaming, date5G);
    }

    @Override
    public float calculeazaCostExtra(int nrLuni) {
        float costExtra = 0.0f;
        if (dateRoaming) {
            costExtra += 2.5 * nrLuni;
        }
        if (minuteRoaming) {
            costExtra += 1.5 * nrLuni;
        }
        if (date5G) {
            costExtra += 3.5 * nrLuni;
        }
        return costExtra;
    }
}
