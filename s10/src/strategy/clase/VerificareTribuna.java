package strategy.clase;

public class VerificareTribuna implements Strategy {
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " a fost verificat la tribuna");
    }
}
