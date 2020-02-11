import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Generator implements IGenerator {

    protected abstract Character dajKolejnyZnak(String slowo);

    protected IJezyk jezyk;
    protected static int maks_dlugosc = 10;


    public Generator(IJezyk j) {
        this.jezyk = j;
    }

    @Override
    public String dajSłowo() {
        StringBuilder wynik = new StringBuilder();
        int dlugosc = 0;
        Character znak = dajKolejnyZnak(wynik.toString());
        while (znak != null && dlugosc <= maks_dlugosc) {
            wynik.append(znak);
            dlugosc++;
            znak = dajKolejnyZnak(wynik.toString());
        }
        return wynik.toString();
    }


    Character losujZnak(List<Character> znaki) {
        int moc_zbioru = znaki.size();
        int nr_litery = ThreadLocalRandom.current().nextInt(0, moc_zbioru);
        return znaki.get(nr_litery);

    }
}
