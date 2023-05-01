package restaurant.proxy.clase;

public class Restaurant implements IRestaurant {

    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(int nrPers) {
        System.out.println("Masa a fost rezervata pentru " + nrPers + " persoane la restaurantul " + this.nume);
    }
}
