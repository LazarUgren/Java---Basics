package vezbanjeNaCasu.petlje;

import java.util.Scanner;

public class Jelka {
    public static void main(String[] args) {
        //nacrtaj mi jelku uz pomoc petlje

        Scanner sc = new Scanner(System.in);
       // System.out.print("unesi n broj");
        // int n = sc.nextInt();

        // String z = " ";
        //  for (int i = 0; i < 10; i++){
        //  z = z + "*";
        //* = *  + *

        //   System.out.println(z); // ali ovo je pola jelke :(

        //    }

        //  System.out.print("Unesi n broj");
        //  int n = sc.nextInt();


        //    for (int i = 0; i < n; i++){

        //      for (int j = 0; j < n-i; j++)
        //           System.out.print(" ");
        //       for (int k = 0; k < (2*i+1); k++)
        //          System.out.print("*");
        //      System.out.println();     //ovo je cela jelka :D

        //  }
        String razmak = " ";
        String zvezdica = "*";
        int i = sc.nextInt();
        for (i = i; i > 1; i--) {
            for (int j = 1; j < i; j++){
                System.out.print(razmak);} // i ovo je cela jelka

        System.out.println(zvezdica);
        zvezdica = zvezdica + "**";}




    }
}
