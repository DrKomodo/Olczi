import java.util.Map;

public class JezykOstatniaLitera extends Jezyk {


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
    public String nazwa() {
        return "JezykOstatniaLitera";
    }
}
