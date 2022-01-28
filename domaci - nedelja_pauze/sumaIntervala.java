package nedeljaPauzeZadaciVezbanje.domaci;

import java.util.Scanner;

public class sumaIntervala {
    public static void main(String[] args) {
        //[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n.
        // Ispisati sumu brojeva [m, n]

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisite broj m: ");
        int m = sc.nextInt();
        System.out.print("Upisite broj n: ");
        int n = sc.nextInt();
        int suma = 0;
        while (m <= n) {  //m je brojac u ovom slucaju i ide do broja n
            suma = suma + m;  //broj m ce u jednom trenutku postati broj n kada stigne do njega, pa ce i on biti uracunat
            m++;            //broj m se dize u koraku od po jedan, i na taj nacin racuna sumu od m do n.
        }
        System.out.println(suma);

    }
}
