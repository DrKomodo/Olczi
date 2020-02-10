import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorSufiksowy extends Generator {
    public GeneratorSufiksowy(String nazwa) {
        super(nazwa);
    }

    @Override
    protected Character dajKolejnyZnak(String slowo) {
        int moc_zbioru = 0;
        for (int poczatek = 0; poczatek <= slowo.length(); poczatek++) {
            String sufiks = slowo.substring(poczatek);
            Map<Character, Integer> czestoci = jezyk.częstości(sufiks);
            for (Map.Entry<Character, Integer> entry: czestoci.entrySet()) {
                moc_zbioru += entry.getValue();
            }
        }
        int nr_litery = ThreadLocalRandom.current().nextInt(1, moc_zbioru + 1);
        for (int poczatek = 0; poczatek <= slowo.length(); poczatek++) {
            String sufiks = slowo.substring(poczatek);
            Map<Character, Integer> czestoci = jezyk.częstości(sufiks);
            for (Map.Entry<Character, Integer> entry: czestoci.entrySet()) {
                if (nr_litery <= entry.getValue()) {
                    return entry.getKey();
                } else {
                    nr_litery -= entry.getValue();
                }
            }
        }
        return null;
    }


}
