package vezbanjeNaCasu.nizovi;

public class nizZadatak3 {
    public static void main(String[] args) {
        //Zadatak 3 - Ispisati najmanji broj niza ako su clanovi niza od 1 do 100
        //Dodatak - Ispisati razliku izmedju minimuma i maximuma
        //Dodatak - Koja je prosecna vrednost niza?

        int[] niz = {26, 58, 45, 36, 98, 76, 14};
        int max = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max){
                max = niz[i];
            }
        }
        System.out.println("Najveci broj je " + max);

        int min = niz[0];
        for (int i = 0; i < niz.length; i++){
            if (min > niz[i]) {
                min = niz[i];
            }
        }
        System.out.println("Najmanji broj je " + min);
        int razlika = max- min;

      /*  if (razlika < 0) {
            razlika = razlika *(-1); //da dobijemo pozitivnu razliku u brojevima
        }  */
        System.out.println(razlika);

        double suma = 0;
        for (int i = 0; i < niz.length; i ++) {
            suma = suma + niz[i];
        }
        double prosek =  suma / niz.length;

        System.out.println(prosek);

    }
}
