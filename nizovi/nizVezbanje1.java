package vezbanjeNaCasu.nizovi;

public class nizVezbanje1 {
    public static void main(String[] args) {
        //10.2. Učitati članove niza. Ispisati članove niza sa parnim indeksom.
        //
        //Opis programa: Parni indeksi su: 0, 2, 4, 6, ... tj. djeljivi sa 2.

        String[] niz = {"aaaaa", "sssss", "qqqqqq", "eeeee", "5rrrrr"};

        for (int i = 0; i < niz.length; i++) {
            if (i % 2 == 0) {
                System.out.println("ovo su parni indeks: " + niz[i]);
            }
        }



    }
}
