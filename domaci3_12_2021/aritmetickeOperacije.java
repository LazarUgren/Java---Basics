package domaci.domaci3_12_2021;

import java.util.Scanner;

public class aritmetickeOperacije {
    public static void main(String[] args) {
        // 1. Aritmeticke operacije. Na standardni ulaz se unose dva cela broja.
        // Ispisati na standardnom izlazu u zasebnim redovima
        // zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisati broj x: ");
        int x = sc.nextInt();
        System.out.print("Upisati broj y: ");
        int y = sc.nextInt();
        int z;

        z = x + y;
        System.out.println("Zbir broja x i y je " + z);

        z = x - y;
        System.out.println("Razlika broja x i y je " + z);

        z = x * y;
        System.out.println("Proizvod brojeva x i y je: " + z);

        z = x / y;
        System.out.println("Kolicnik brojeva x i y je: " + z);

        z = x % y;
        System.out.println("Ostatak pri deljenju brojeva x sa y je: " + z);



    }
}
