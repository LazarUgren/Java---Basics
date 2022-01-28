package vezbanjeZnanje;

public class nizZnanje12 {
    public static void main(String[] args) {
        //Učitati članove niza. Izračunati i ispisati sumu pozitivnih članova niza.

        int [] niz = {23, 24, 54, -25, 99, 34, -858};

        int suma = 0;
        for (int i = 0; i < niz.length; i++){
            if (niz[i] > 0) {
                suma = suma + niz[i];
            }
        }
        System.out.println(suma);



    }
}
