package stare.clase;

public class StareArePinIntrodus implements IStare {
    @Override
    public void modificareStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus pinul in bancomat");
        } else {
            System.out.println("Introduceti pinul corect");
        }
    }
}
