import java.util.Map;

public class JezykPrefiksy extends Jezyk {
    public JezykPrefiksy(String nazwa) {
        super(nazwa);
    }

    @Override
    public void uczSię(String slowo) {
        char[] litery = slowo.toCharArray();
        for (int koniec = 0; koniec < slowo.length(); koniec++) {
            alfabet.add(litery[koniec]);
            dodajInformacje(slowo.substring(0, koniec), litery[koniec]);
        }
    }
}
