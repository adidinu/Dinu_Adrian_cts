package composite.clase;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;


    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        super();
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public double calculareSumaAsigurare() {
        return 1.5 * this.capacitateCilindrica;
    }

    @Override
    public void adaugaGrup(Element gr) {
        throw new IllegalArgumentException("Operatia nu este implementata pentru nodul frunza");
    }

    @Override
    public void stergeGrup(Element gr) {
        throw new IllegalArgumentException("Operatia nu este implementata pentru nodul frunza");

    }

    @Override
    public Element getGrup(int index) {
        throw new IllegalArgumentException("Operatia nu este implementata pentru nodul frunza");
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Autobuzul " + producator + " cu capacitatea cilindrica " + capacitateCilindrica + " are suma de asigurare de " + calculareSumaAsigurare());
    }

}
