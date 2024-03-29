package template.clase;

public class Bancomat extends BancomatAbstract {

    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pinul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introduceSuma(int suma) {
        System.out.println("A fost specificata pentru retragere suma de " + suma);
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
