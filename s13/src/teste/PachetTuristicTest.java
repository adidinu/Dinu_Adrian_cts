package teste;

import categorii.Categorie1;
import categorii.Categorie2;
import dubluri.StubPersoana;
import dubluri.StubPersoanaMinora;
import model.IPersoana;
import model.PachetTuristic;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {

    @Tag("tag1")
    @Test
    void poateRezervaPachet() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bali", 2000.0);
        assertTrue(pachet.poateRezerva());
    }

    @Tag("tag2")
    @Test
    void nuPoateRezerva() {
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bali", 2000.0);
        assertFalse(pachet.poateRezerva());
    }
}