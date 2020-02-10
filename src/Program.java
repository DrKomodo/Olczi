public class Program {
    public void test(String nazwaPliku, IJezyk j){
        System.out.print("==> Uczenie z pliku " + nazwaPliku + ", języka " + j.nazwa());
        j.uczSięzPliku(nazwaPliku);

        IGenerator g = new GeneratorSufiksowy(j);
        System.out.println(" i generatora = " + g.nazwa() +  ": ");
        for(int i = 0; i<10; i++){
            System.out.println(i + ": " + g.dajSłowo());
        }
    }

    public static void main(String[] args) {
        Program o = new Program();
        o.test("pan-tadeusz.txt", new Język2());
        o.test("lokomotywa.txt", new Język2());
        o.test("oda-do-mlodosci.txt", new Język2());

    }
}
