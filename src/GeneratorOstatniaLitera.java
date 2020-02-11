import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.List;
import java.util.Map;

public class GeneratorOstatniaLitera extends Generator {


    public GeneratorOstatniaLitera(IJezyk j) {
        super(j);
    }

    @Override
    protected Character dajKolejnyZnak(String slowo) {
        String ostatnia_litera = slowo.length() == 0 ? "" : slowo.substring(slowo.length() - 1);
        List<Character> czestosci = jezyk.listaZnakow(ostatnia_litera);
        if (czestosci.isEmpty()) {
            return null;
        } else {
            return losujZnak(czestosci);
        }
    }

    @Override
    public String nazwa() {
        return "GeneratorOstatniaLitera";
    }
}
