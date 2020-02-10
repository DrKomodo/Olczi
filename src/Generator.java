import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Generator extends NazwanyObiekt implements IGenerator {
    public Generator(String nazwa) {
        super(nazwa);
    }

    protected abstract Character dajKolejnyZnak(String slowo);

    protected Jezyk jezyk;
    protected static int maks_dlugosc = 10;

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

    Character losujZnak(Map<Character, Integer> czestosci) {
        AtomicInteger liczba_wszystkich_liter = new AtomicInteger();
        czestosci.forEach((znak, liczba_wystapien) -> liczba_wszystkich_liter.getAndIncrement());
        int nr_litery = ThreadLocalRandom.current().nextInt(1, liczba_wszystkich_liter.get() + 1);
        Character wynik = null;
        for (Map.Entry<Character, Integer> entry: czestosci.entrySet()) {
            if (nr_litery <= entry.getValue()) {
                wynik = entry.getKey();
            } else {
                nr_litery -= entry.getValue();
            }
        }
        return wynik;
    }
}
