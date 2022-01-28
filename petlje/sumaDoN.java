package vezbanjeNaCasu.petlje;

import java.util.Scanner;

public class sumaDoN {
    public static void main(String[] args) {

        System.out.println("prikazi mi sumu brojeva do n");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //npr n je 9, treba mi suma od broja koji se upise u konzolu

        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println(suma);





    }
}
