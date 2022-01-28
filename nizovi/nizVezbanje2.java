package vezbanjeNaCasu.nizovi;

import java.util.Scanner;

public class nizVezbanje2 {
    public static void main(String[] args) {
        //sc.next().charAt(0);
        //za upisani mesec iz konzole izvuci mesece iz niza na isto slovo

        Scanner sc = new Scanner(System.in);
        String mesec = sc.nextLine();

        String [] nizMesec = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust",
                "Septembar", "Oktobar", "Novembar", "Decembar"};

        for (int i = 0; i < nizMesec.length; i++) {
            if (mesec.charAt(0) == nizMesec[i].charAt(0)) {
                System.out.println(nizMesec[i]);
            }
        }
/* String [] meseci = {"januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust",
        "septembar", "oktobar", "novembar", "decembar"};

       for(int i =0; i < meseci.length; i++){
           if(mesec.charAt(0) == (meseci[i].charAt(0))){
               System.out.println(meseci[i]);*/

    }
}
