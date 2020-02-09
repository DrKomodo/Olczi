import java.util.Map;

public class JezykWszystkieSegmenty extends NazwanyObiekt implements IJezyk {
    public JezykWszystkieSegmenty(String nazwa) {
        super(nazwa);
    }

    @Override
    public Map<Character, Integer> częstości(String prefiks) {
        return null;
    }

    @Override
    public void uczSię(String słowo) {

    }

    @Override
    public void uczSięZPliku(String nazwa) {

    }

    @Override
    public String literyAlfabetu() {
        return null;
    }
}
