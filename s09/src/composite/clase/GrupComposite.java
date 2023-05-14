package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupComposite implements Element {
    private List<Element> elemente;
    private String denumireGrup;


    public GrupComposite(String denumireGrup) {
        super();
        elemente = new ArrayList<Element>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public double calculareSumaAsigurare() {
        double suma = 0;
        for (Element gr : elemente) {
            suma += gr.calculareSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element gr) {
        this.elemente.add(gr);
    }

    @Override
    public void stergeGrup(Element gr) {
        this.elemente.remove(gr);
    }

    @Override
    public Element getGrup(int index) {
        return this.elemente.get(index);
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Totalul sumelor de asigurare este: " + calculareSumaAsigurare());
    }

}
