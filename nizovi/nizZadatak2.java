package vezbanjeNaCasu.nizovi;

public class nizZadatak2 {
    public static void main(String[] args) {
        //Zadatak 2 - Upisati brojeve u niz i napisati sumu

        int[] broj = {1, 4, 6, 7, 10};
        int suma = 0;

        for (int i = 0; i < broj.length; i++){
            suma = suma + broj[i];
        }
        System.out.println(suma);


    }
}
