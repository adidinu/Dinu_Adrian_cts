package restaurant.adapter.bar;

public class SoftBar implements ISoftBar {
    String denumire;

    public SoftBar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaBauturi(double totalSuma) {
        System.out.println("Total suma bar " + totalSuma);
    }
}
