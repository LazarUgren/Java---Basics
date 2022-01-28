package vezbanjeNaCasu.petlje;

import java.util.Scanner;

public class supaParnihBrojeva {
    public static void main(String[] args) {

        System.out.println("Prikazati sumu parnih borjeva");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //npr n je 9, a treba mi suma samo 2, 4, 6 i 8

        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);

    }
}
