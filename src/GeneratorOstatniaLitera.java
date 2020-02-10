import java.util.Map;

public class GeneratorOstatniaLitera extends Generator {

    public GeneratorOstatniaLitera(String nazwa) {
        super(nazwa);
    }

    @Override
    protected Character dajKolejnyZnak(String slowo) {
        String ostatnia_litera = slowo.substring(slowo.length() - 1);
        Map<Character, Integer> czestosci = jezyk.częstości(ostatnia_litera);
        if (czestosci.isEmpty()) {
            return null;
        } else {
            return losujZnak(czestosci);
        }
    }

}
