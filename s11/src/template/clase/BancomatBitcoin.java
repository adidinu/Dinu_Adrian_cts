package template.clase;

public class BancomatBitcoin extends BancomatAbstract {

    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pinul bitcoin in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introduceSuma(int suma) {
        System.out.println("A fost specificata pentru retragere suma de " + suma + " bitcoin");
    }

    @Override
    protected void retragereBani() {
        System.out.println("A fost retrasa suma din bancomatul din " + super.getAdresa());
    }

    @Override
    protected void retragereCard() {
        System.out.println("A fost retras cardul din bancomatul din " + super.getAdresa());
    }
}
