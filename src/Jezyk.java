import java.util.*;

public abstract class Jezyk implements IJezyk {
    public Jezyk() {
        dane = new HashMap<>();
        alfabet = new HashSet<>();
    }

    private Map<String, List<Character>> dane;
    protected Set<Character> alfabet;

    public List<Character> listaZnakow(String prefiks) {
        return dane.getOrDefault(prefiks, new ArrayList<>());
    }

    @Override
    public Map<Character, Integer> częstości(String prefiks) {
        Map<Character, Integer> wynik = new HashMap<>();
        List<Character> znaki = dane.getOrDefault(prefiks, new ArrayList<>());
        for ( Character znak: znaki) {
            int liczba_wystapien = wynik.getOrDefault(znak, 0);
            wynik.put(znak, liczba_wystapien + 1);
        }
        return wynik;
    }

    @Override
    public void uczSięZPliku(String nazwa) {
        File plik = new File("nazwa_Pliku.txt");
        Scanner odczyt = new Scanner(new File("nazwa_Pliku.txt"));
        while(odczyt.hasNext().uczSię) {
            String Slowo = odczyt.next().uczSię;
            sk = new Scanner(new File("nazwa_Pliku.txt")).useDelimiter("[^" + literyAlfabetu() + literyAlfabetu().toUpperCase() + "]+")
            System.out.println(odczyt.next());
        }



    }

    }

    protected void dodajInformacje(String prefiks, Character znak) {
        dane.putIfAbsent(prefiks, new ArrayList<>());
        dane.get(prefiks).add(znak);
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
