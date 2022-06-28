package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilar alin ve
        // kullanicci 0'a basincaya kadar devam edin.
        //kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i=1; i<1000000 ; i++){
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();

            if (sayi==0){
                break;
            }else{
                toplam+=sayi;
            }
        }
        System.out.println(toplam);

    }
}
