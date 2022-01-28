package pasteBin;

import java.util.Scanner;

public class zadatak16 {
    public static void main(String[] args) {
        //16. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj n: ");
        int n = sc.nextInt();
        int i = 0;
        double proizvod = 1;

        while ( i < n) {
            System.out.print("Upisi broj: ");
            double x = sc.nextDouble();
            proizvod = proizvod * x;
            i++;

        }
        System.out.println(proizvod);
    }
}
