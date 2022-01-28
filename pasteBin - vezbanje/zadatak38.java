package pasteBin;

public class zadatak38 {
    public static void main(String[] args) {
        //38. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
        //Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]

        int[] niz1 = {1, 2, 3};
        int[] niz2 = {11, 12, 13, 14};

        int[] x = nadovezaniNiz(niz1, niz2);
        for (int i= 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }

    public static int[] nadovezaniNiz (int[] lala, int[] baba){
        int[] niz3 = new int[lala.length + baba.length];
        for (int i = 0; i < lala.length; i++){
            niz3[i] = lala[i];
        }
        for (int i = lala.length; i < niz3.length; i++){
            niz3[i] = baba[i - lala.length];
        }
        return niz3;
    }
}
