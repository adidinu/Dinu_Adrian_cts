package cts.telefonie.strategy.clase;

public class MobilityZ implements Subscription {
    private int minuteVoce;
    private int date;
    private int tv;

    public MobilityZ(int minuteVoce, int date, int tv) {
        this.minuteVoce = minuteVoce;
        this.date = date;
        this.tv = tv;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return 0.5f * minuteVoce * durationInMonths + 2 * date * durationInMonths + 10 * tv * durationInMonths;
    }
}
