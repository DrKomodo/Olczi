import java.util.Map;

public class JezykWszystkieSegmenty extends Jezyk {

    @Override
    public void uczSię(String slowo) {
        char[] litery = slowo.toCharArray();
        dodajInformacje("", litery[0]);
        for (int koniec = 0; koniec < slowo.length(); koniec++) {
            alfabet.add(litery[koniec]);
            for (int poczatek = 0; poczatek < koniec; poczatek++) {
                dodajInformacje(slowo.substring(poczatek, koniec), litery[koniec]);
            }
        }
    }

    @Override
    public String nazwa() {
        return "JezykWszystkieSegmenty";
    }
}
