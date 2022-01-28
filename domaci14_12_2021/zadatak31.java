package domaci.domaci14_12_2021;

import java.util.Scanner;

public class zadatak31 {
    public static void main(String[] args) {
        //31. Napisati funkciju koja racuna proizvod 3 broja.

        Scanner sc = new Scanner(System.in);
        System.out.println("Upisite tri broja koja zelite da pomnozite: ");
        int proizvod = proizvodBrojeva(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(proizvod);

    }
    public static int proizvodBrojeva (int a, int b, int c) {
        return a*b*c;
    }

}
