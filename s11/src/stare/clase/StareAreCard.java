package stare.clase;

public class StareAreCard implements IStare {
    @Override
    public void modificareStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareNuAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus cardul in bancomat");
        } else {
            System.out.println("Bancomatul are deja un card introdus");
        }
    }
}
