package pasteBin;

import java.util.Scanner;

public class zadatak10 {
    public static void main(String[] args) {
        //10. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
        // koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
        // (dakle 1 + 2 + 3 + ... + t). [Ovaj zadatak je dosta komplikovan!]

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite broj n: ");
        int n = sc.nextInt();
        int suma = 0;

        for (int i = 1; i < n; i++){
            suma = suma + i;
            System.out.println(suma);

        }

    }
}
