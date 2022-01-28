package domaci.domaci17_12_2021;

import java.util.Scanner;

public class zadatak41 {
    public static void main(String[] args) {
        //41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite duzinu niza koju zelite: ");
        double[] niz1 = new double[sc.nextInt()];

        for (int i = 0; i < niz1.length; i ++){
            System.out.print("Upisite clan niza: ");
            niz1[i] = sc.nextDouble();
        }
        double x = prosekNiza(niz1);
        System.out.println(x);
    }

    public static double prosekNiza( double[] lala){
        int brojac = 0;
        double suma = 0;
        for (int i = 0; i < lala.length; i++){
            suma = suma + lala[i];
            brojac++;
        }

        suma = suma / brojac;
        return suma;
    }
}
