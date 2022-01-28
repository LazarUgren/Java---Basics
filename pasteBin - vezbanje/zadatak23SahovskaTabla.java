package pasteBin;

import java.util.Scanner;

public class zadatak23SahovskaTabla {
    public static void main(String[] args) {
        //23. Za uneto m i n (intovi) iscrtati m*n sahovsku tablu, gde je beli polje oznaceno sa ' ' (space karakter),
        //	a crno polje sa '.' (tacka). Uzeti da je gornje levo polje uvek crno. Npr za m = 3, n = 3:

    /*  |# # # # #
        | # # # #
        |# # # # #
        | # # # #
        |# # # # #
        */

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // visina
    //    int n = sc.nextInt(); // duzina

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j ++){
                if ((i+j) % 2== 0) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
