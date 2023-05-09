package strategy.clase;

public class Jandarm {
    private Strategy modVerificare;
    private String nume;

    public void setModVerificare(Strategy modVerificare) {
        this.modVerificare = modVerificare;
    }

    public Jandarm(String nume) {
        this.nume = nume;
        this.modVerificare = new VerificarePeluza();
    }

    public void verificaSpectator(Spectator s) {
        modVerificare.modVerificareSpectator(s);
    }
}
