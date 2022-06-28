package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan kac sayi toplamak istedigini
        // alin; bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi=5;

        Scanner scan = new Scanner(System.in);
        int sayi=0;

        for (int i=1; i<=sayiAdedi; i++){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();

        }



    }
}
