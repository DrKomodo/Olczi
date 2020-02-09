import java.util.Map;

public interface IJezyk {
    Map<Character, Integer> częstości(String prefiks);  // Daje słownik częstości poszczególnych liter w słowach języka po podanym prefiksie,
    void uczSię(String słowo); // zapamiętuje dane o podanym słowie
    void uczSięZPliku(String nazwa); // zapamiętuje dane o wszystkich słowach ze wskazanego pliku, obśługuje wyjątek braku pliku (wypisuje komunikat i kończy działanie tej metody)
    String literyAlfabetu(); // daje napis ze wszystkimi literami danego języka, np "abcdefghijklmnoprqstuwxyząćęłńóśźż"
    String nazwa(); // daje nazwę opisująca rodzaj języka
}
