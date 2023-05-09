package decorator.clase;

public class Bilet implements IBilet {
    public String numeComparator;
    public String numeEchipa1;
    public String numeEchipa2;

    public Bilet(String numeComparator, String numeEchipa1, String numeEchipa2) {
        this.numeComparator = numeComparator;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
    }

    @Override
    public String getNumeEchipa1() {
        return numeEchipa1;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeComparator='" + numeComparator + '\'' +
                ", numeEchipa1='" + numeEchipa1 + '\'' +
                ", numeEchipa2='" + numeEchipa2 + '\'' +
                '}';
    }

    @Override
    public void printareBilet() {
        System.out.println(this);
    }
}
