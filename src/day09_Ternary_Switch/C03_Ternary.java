package day09_Ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=1400;

        //verilen sayinin 3 veya daha cok basamakli olup olmadıgını kontrol
        // eden ve sonucu yazdiran bir ternary olusturun

        String sonuc =sayi>=100 ? "Sayi 3 basamkli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        // Ternary bize sonuc döndurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // yada sonucun data türüne uygun bir variable' a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);

    }
}
