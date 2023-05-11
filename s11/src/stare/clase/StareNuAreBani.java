package stare.clase;

public class StareNuAreBani implements IStare {
    @Override
    public void modificareStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareArePinIntrodus) {
            bancomat.setStare(this);
            System.out.println("Bancomatul nu mai are bani si cardul a fost scos");
        }
    }
}
