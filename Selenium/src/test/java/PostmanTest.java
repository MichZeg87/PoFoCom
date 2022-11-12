import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class PostmanTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/menu.csv", numLinesToSkip = 1)
    public void przepisanieWartosci(String nazwa) {
        Postman postman = new Postman();
        postman.kolekcja(nazwa);
    }
}
