package template.clase;

public abstract class BancomatAbstract {

    private String adresa;

    public BancomatAbstract(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    protected abstract void introduceCard();

    protected abstract void introducePin();

    protected abstract void introduceSuma(int suma);

    protected abstract void retragereBani();

    protected abstract void retragereCard();

    public final void scoateBaniDeLaBancomat(int suma) {
        introduceCard();
        introducePin();
        introduceSuma(suma);
        retragereBani();
        retragereCard();
    }
}
