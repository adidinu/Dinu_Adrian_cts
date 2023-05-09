package strategy.clase;

public class VerificareVIP implements Strategy {
    @Override
    public void modVerificareSpectator(Spectator spectator) {
        System.out.println(spectator.getNume() + " a fost verificat la VIP");
    }
}
