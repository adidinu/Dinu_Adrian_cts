package cts.telefonie.strategy.clase;

public class MobilityY implements Subscription {
    private int date;

    public MobilityY(int date) {
        this.date = date;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return 2 * date * durationInMonths;
    }
}
