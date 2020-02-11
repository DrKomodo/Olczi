import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratorSufiksowy extends Generator {

    public GeneratorSufiksowy(IJezyk j) {
        super(j);
    }

    @Override
    protected Character dajKolejnyZnak(String slowo) {
        ArrayList<Character> wszystkie_znaki = new ArrayList<>();
        for (int poczatek = 0; poczatek <= slowo.length(); poczatek++) {
            String sufiks = slowo.substring(poczatek);
            List<Character> znaki = jezyk.listaZnakow(sufiks);
            wszystkie_znaki.addAll(znaki);
        }
        return losujZnak(wszystkie_znaki);
    }

    @Override
    public String nazwa() {
        return "Generator Sufiksowy";
    }
}
