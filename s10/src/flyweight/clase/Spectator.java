package flyweight.clase;

public class Spectator implements ISpectator {

    private double inaltime;
    private double latimeUmeri;
    private int id;

    public Spectator(double inaltime, double latimeUmeri, int id) {
        this.inaltime = inaltime;
        this.latimeUmeri = latimeUmeri;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latimeUmeri=" + latimeUmeri +
                ", id=" + id +
                '}';
    }

    @Override
    public void deseneazaSpectator(PozitieDesenare pozitie) {
        System.out.println(this.toString() + pozitie);
    }
}
