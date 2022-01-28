package pasteBin;

public class zadatak40 {
    public static void main(String[] args) {
        //40. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

        int[] niz1 = {1, 2, 3, 4, 5, 6};

        provera(niz1);


        System.out.println("");
    }

    public static int provera(int[] lala){
        int suma = 0;
        int proizvod = 1;
        for (int i = 0; i < lala.length; i++){
            suma = suma + lala[i];
        }

        for (int i = 0; i < lala.length; i++){
            proizvod = proizvod * lala[i];
        }

        int konacno = proizvod - suma;

     return konacno;
    }
}
