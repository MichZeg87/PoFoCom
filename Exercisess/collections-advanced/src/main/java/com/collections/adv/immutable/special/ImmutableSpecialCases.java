package com.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 128;                 // [1]
        Integer b = 128;                 // [2]
        System.out.println(a == b);       // [3] zawierają adresy porównywalnych obiektów
        System.out.println(a.equals(b));// [4] porównanie wartości za pomocą metody

        System.out.println("-----");

        String x = "This is string";
        String y = "This is string";
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println("-----");

        Integer c = 100;                      // [1] hashCode jest taki sam i wynosi dokładnie tyle, ile wynosi wartość zmiennej
        Integer d = 100;                      // [2] (przy okazji zbadaliśmy, jak tworzona jest wartość hashCode dla zmiennych typu Integer).
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = c + 10;                           // [3] tak naprawdę wcale nie modyfikujemy obiektu wskazywanego przez zmienną c.
        System.out.println(c.hashCode());           //W rzeczywistości do zmiennej c przypisywany jest zupełnie nowy obiekt.
        System.out.println(d.hashCode());
        System.out.println(c == d);
        c = 10567;                            // [4] Ich hashCode jest taki sam, ponieważ wynika on wprost z wartości zapisanych w zmiennych
        d = 10567;                            // [5] (zmienne te są równe pod względem equals, więc muszą zwracać taki sam hashCode)
        System.out.println(c.hashCode());        //  Wynik porównania c == d zwróci jednak tym razem false, ponieważ są to osobne obiekty w pamięci komputera:
        System.out.println(d.hashCode());
        System.out.println(c == d);
    }
}
