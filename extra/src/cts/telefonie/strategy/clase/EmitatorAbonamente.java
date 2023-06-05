package cts.telefonie.strategy.clase;

public class EmitatorAbonamente {
    private String nume;
    private Subscription subscription;

    public EmitatorAbonamente(String nume) {
        this.nume = nume;
        this.subscription = new MobilityX(500);
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void emiteFactura(int luni) {
        System.out.println("Factura pentru " + nume + " este " + subscription.totalCosts(luni));
    }
}
