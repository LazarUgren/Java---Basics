package vezbanjeNaCasu.nizovi;

public class nizZadatak6 {
    public static void main(String[] args) {
        //Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"

        int[] niz = {5, 10, 1, 31, 23, 99, 11, 9, 19, 51};
        int suma = 0;
        int suma2 = 0;

        for (int i = 0; i < niz.length; i++) {
            if (suma < 100) {
                suma = suma + niz[i];
                System.out.println(niz[i]);
            }
            else if (suma >= 100) {
                suma2 = suma - 100;
                System.out.println("presli ste sumu 100 za: " + suma2);
                break;
            }
   /*         suma = suma + niz[i];
            System.out.println(niz[i]);
        if (suma >= 100) {
            suma = (suma - 100);
            System.out.println("presli ste sumu 100 za: " + suma );
            break;
        }}*/


        }

    }
}
