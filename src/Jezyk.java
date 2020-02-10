import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;


public abstract class Jezyk extends NazwanyObiekt implements IJezyk {
    private Map<String, Map<Character, Integer>> dane;
    protected Set<Character> alfabet;
    private static nazwa jezyk;
    public Jezyk(String nazwa) {
        super(nazwa);
    }

    @Override
    public Map<Character, Integer> częstości(String prefiks) {
        return dane.getOrDefault(prefiks, new HashMap<>());
    }

    @Override
    public void uczSięZPliku(String nazwa) {

        sk = new Scanner(new File(nazwa)).useDelimiter("[^" + literyAlfabetu() + literyAlfabetu().toUpperCase() + "]+")

    }

    protected void dodajInformacje(String prefiks, Character znak) {
        dane.putIfAbsent(prefiks, new HashMap<>());
        Map<Character, Integer> dane_prefiksu = dane.get(prefiks);
        int ile_razy = dane_prefiksu.getOrDefault(znak, 0);
        dane_prefiksu.put(znak, ile_razy + 1);
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
