import java.util.Map;

public class JezykOstatniaLitera extends Jezyk {

    public JezykOstatniaLitera(String nazwa) {
        super(nazwa);
    }

    @Override
    public void uczSię(String slowo) {
        String prefiks = "";
        for (Character znak: slowo.toCharArray()) {
            alfabet.add(znak);
            dodajInformacje(prefiks, znak);
            prefiks = znak.toString();
        }
    }


    @Override
    public String literyAlfabetu() {
        StringBuilder wynik = new StringBuilder();
        for (Character litera: alfabet) {
            wynik.append(litera);
        }
        return wynik.toString();
    }
}
