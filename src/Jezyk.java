import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class Jezyk extends NazwanyObiekt implements IJezyk {
    private Map<String, Map<Character, Integer>> dane;
    protected Set<Character> alfabet;

    public Jezyk(String nazwa) {
        super(nazwa);
    }

    @Override
    public Map<Character, Integer> częstości(String prefiks) {
        return dane.getOrDefault(prefiks, new HashMap<>());
    }

    @Override
    public void uczSięZPliku(String nazwa) {

    }

    protected void dodajInformacje(String prefiks, Character znak) {
        dane.putIfAbsent(prefiks, new HashMap<>());
        Map<Character, Integer> dane_prefiksu = dane.get(prefiks);
        int ile_razy = dane_prefiksu.getOrDefault(znak, 0);
        dane_prefiksu.put(znak, ile_razy + 1);
    }
}
