package vezbanjeZnanje;

import java.util.Scanner;

public class justVezba {
    public static void main(String[] args) {
        //37. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
        //Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
            suma = suma + i;}
            System.out.println(suma);
        }
        System.out.println(suma);

    }

}
