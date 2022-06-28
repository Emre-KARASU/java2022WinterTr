package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        // kullaniciya derse katilip katilmadigini sorun
        // evet derse, cevabini ve "derse katiliminiz alinmistir"
        // yazdirin, hayir derse cevabini ve "sonraki derslerimize
        // bekleriz" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse Katilmak Ister misiniz ? \n Evet veya Hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + "derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + "sonraki derslerimize bekleriz");
            } else {
            System.out.println("evet veya hayir yazdiriniz");
        }



    }
}
