package cts.telefonie.strategy.clase;

public class MobilityX implements Subscription {
    private int minuteVoce;

    public MobilityX(int minuteVoce) {
        this.minuteVoce = minuteVoce;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return 0.5f * minuteVoce * durationInMonths;
    }
}
