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
    public void uczSięZPliku(String nazwaPliku) {
        Scanner sc = null;
        try {
            sk = new Scanner(new File("nazwa_Pliku.txt")).useDelimiter("[^" + literyAlfabetu() + literyAlfabetu().toUpperCase() + "]+");
        } catch (FileNotFoundException ex) {
            System.out.println("Nie udało się otworzyć pliku " + nazwaPliku);
            exit(1);
        }
        String Slowo;
        while (sc.hasNext()) {
            Slowo = sc.next().toLowerCase();
            if (!pierwsze.contains(Slowo.charAt(0))) {
                pierwsze.add(Slowo.charAt(0));
            }
            for (int i = 0; i < Slowo.length() - 1; i++) {
                char litera, litera2;
                litera = Slowo.charAt(i);
                litera2 = Slowo.charAt(i + 1);
                int ile = slownik.get(litera).get(litera2);
                slownik.get(litera).replace(litera2, ile + 1);
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
