package observer.clase;

public class Client implements IClient {

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println(nume + ", ai primit mesajul:\n" + mesaj);
    }
}
