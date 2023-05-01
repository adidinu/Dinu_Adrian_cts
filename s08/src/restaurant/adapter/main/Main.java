package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, double suma) {
        restaurant.printeazaNota(suma);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Alcadibo");
//        bar.printeazaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("George");
//        bucatarie.printeazaNota(300);

//        imprimare(bar, 325);
        imprimare(bucatarie, 525);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");

        imprimare(adapter, 450);

        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecte, 555);
    }
}