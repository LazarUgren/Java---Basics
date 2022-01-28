package pasteBin;

import java.util.Scanner;

public class zadatak15 {
    public static void main(String[] args) {
        //15. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
        Scanner sc = new Scanner(System.in);

        double suma = 0; //za sabiranje se definise pre petlje i krece od 0, za mnozenje se definise pre petlje i krece od 1
        int i = 0;  //definisemo broj od koga se krece brojanje (brojac)

        System.out.print("Unesite pozitivan broj n: ");
        int n = sc.nextInt();   //definisemo koliko brojeva ce se brojati, npr 5, brojac ce ici do 5 brojeva ukupno i tu stati!
        while (i < n) {      //sve dok je brojac manji od zadatog broja petlja ce se pokretati, cim brojac dodje do npr 5 tu se izlazi iz petlje
            System.out.print("unesi broj: "); //ovde unosimo npr tih 5 brojeva, koji ce se sabirati sa svakim prolaskom kroz petlju
            double x = sc.nextDouble();
            suma = suma + x;
            i++;
                                //ako sout ispisemo u petlji, davace rezultat nakon svakog prolaska kroz petlju
        }
        System.out.println("Suma je:" + suma); //ako ga stavimo na kraju ispisace samo krajnji rezultat koji nama treba!

    }
}


