package observer.clase;

public interface IBanca {
    void adaugaObserver(IClient client);

    void stergeObserver(IClient client);

    void trimiteNotificare(String mesaj);
}
