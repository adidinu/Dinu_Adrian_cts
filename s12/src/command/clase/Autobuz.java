package command.clase;

public class Autobuz implements Automobil {
    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
    }

    @Override
    public void plecareInCursa(int numarLinie) {
        System.out.println("Autobuzul " + numar + " a plecat din statia " + numarLinie);
    }
}
