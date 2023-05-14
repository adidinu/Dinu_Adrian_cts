package composite.clase;

public interface Element {
    double calculareSumaAsigurare();

    void adaugaGrup(Element gr);

    void stergeGrup(Element gr);

    Element getGrup(int index);

    void afisareSumaAsigurare();
}
