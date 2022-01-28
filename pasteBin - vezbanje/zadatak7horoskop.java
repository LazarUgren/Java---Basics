package pasteBin;

import java.util.Scanner;

public class zadatak7horoskop {
    public static void main(String[] args) {
        //7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite dan rodjenja (brojevima): ");

        int dan = sc.nextInt();
        System.out.print("Upisete mesec rodjenja (slovima): ");
        String mesec = sc.next();


        switch (mesec){
            case "januar":                     //Jarac – od 22. decembra do 20. januara; Vodolija – od 21. januara do 19. februara;
                  if (dan <= 20) {
                      System.out.println("Vi ste Jarac u horoskopu");
                  } else {
                      System.out.println("Vi ste Vodolija u horoskopu");
                  }
                  break;
            case "februar":                                 //Ribe – od 20. februara do 20. marta;
                if (dan <= 19) {
                    System.out.println("Vi ste Vodolija u horoskopu");
                } else {
                    System.out.println("Vi ste Riba u horoskopu");
                }
                break;
            case "mart":                                    //Ovan – od 21. marta do 20. aprila;

                if (dan <= 20) {
                    System.out.println("Vi ste Riba u horoskopu");
                } else {
                    System.out.println("Vi ste Ovan u horoskopu");
                }
                break;
            case "april":                                    //Bik – od 21. aprila do 21. maja;
                if (dan <= 20) {
                    System.out.println("Vi ste Ovan u horoskopu");
                } else {
                    System.out.println("Vi ste Bik u horoskopu");
                }
                break;
            case "maj":                                     // Blizanci – od 22. maja do 21. juna;
                if (dan <= 21) {
                    System.out.println("Vi ste Bik u horoskopu");
                } else {
                    System.out.println("Vi ste Blizanac u horoskopu");
                }
                break;
            case "jun":                                     //Rak – od 22. juna do 22. jula;
                if (dan <= 21) {
                    System.out.println("Vi ste Blizanac u horoskopu");
                } else {
                    System.out.println("Vi ste Rak u horoskopu");
                }
                break;
            case "jul":                                      //Lav – od 23. jula do 22. avgusta;
                if (dan <= 22) {
                    System.out.println("Vi ste Rak u horoskopu");
                } else {
                    System.out.println("Vi ste Lav u horoskopu");
                }
                break;
            case "avgust":                                  //Devica – od 23. avgusta do 22. septembra;
                if (dan <= 22) {
                    System.out.println("Vi ste Lav u horoskopu");
                } else {
                    System.out.println("Vi ste Devica u horoskopu");
                }
                break;
            case "septembar":                               //Vaga – od 23. septembra do 23.oktobra;
                if (dan <= 22) {
                    System.out.println("Vi ste Devica u horoskopu");
                } else {
                    System.out.println("Vi ste Vaga u horoskopu");
                }
                break;
            case "oktobar":                                  //Škorpija – od 24. oktobra do 22. novembra;
                if (dan <= 23) {
                    System.out.println("Vi ste Vaga u horoskopu");
                } else {
                    System.out.println("Vi ste Skorpija u horoskopu");
                }
                break;
            case "novembar":                                    // Strelac – od 23. novembra do 21. decembra;
                if (dan <= 24) {
                    System.out.println("Vi ste Skorpija u horoskopu");
                } else {
                    System.out.println("Vi ste Strelac u horoskopu");
                }
                break;
            case "decembar":
                if (dan <= 23) {
                    System.out.println("Vi ste Strelac u horoskopu");
                } else {
                    System.out.println("Vi ste Jarac u horoskopu");
                }
                break;
            default:
                System.out.println("Uneli ste pograsne podatke");
                break;


        }
    }
}
