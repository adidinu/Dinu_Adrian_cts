package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant {

    private IRestaurant restaurant;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int nrPers) {
        if (nrPers >= 4) {
            this.restaurant.rezervaMasa(nrPers);
        } else {
            System.out.println("Rezervarea nu a putut fi facuta");
        }
    }
}
