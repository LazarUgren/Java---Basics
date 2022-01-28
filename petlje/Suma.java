package vezbanjeNaCasu.petlje;

public class Suma {
    public static void main(String[] args) {

        System.out.println("prikazi sumu brojeva od 1 do 10");

        int suma = 0; //ovaj deo mora da bude van petlje!

        for (int i = 1; i <=10; i++){ //treba da sabere sve brojeve izmedju 1 i 10! pre petlje je potrebno definisati int suma.
          //int suma = 0; ako ovde definisem int sumu onda ce svaki put petlja da sabira sa NULOM = 0;
            suma = suma + i; // uzima prethodno definisanu sumu = 0, i dodaje na svaki sledi int i, i sabira ga sa prethodnim rezultatom
          //0    =   0  + 1
          //1    =   1  + 2
          //      ...
          //najbolje je da se stampa van petlje ako je za zadatak


        }
        System.out.println(suma);


        //--------------------------------------------

        int j = 1;
        int sum = 0;
        while (j <=10) {
            sum += j; //isto sto i sum = sum + j;
            j++; //ovaj deo ne sme da se zaboravi, jer onda pravi beskonacnu petlju!
        }
        System.out.println(sum);


        //----------------------------------------

        int x = 1;
        int su = 0;
        do {
            su = su + x;
            x++;
        } while (x <= 10);


    }
}
