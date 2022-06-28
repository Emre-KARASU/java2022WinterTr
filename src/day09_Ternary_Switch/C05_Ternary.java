package day09_Ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary' deki iki sonucun data türleri farkli olabilir
        //verilen sayi 100' den buyukse sayinin karesini alip yazdiran
        //100 den kucukse ésayi 100 den buyuk olmali yazdiran
        //bir ternary olusturalim

        int sayi=50;
        //ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        //ve bir degiskene atamaliyiz
        // Eger sonuclar farkli data turlerinde ise
        //atama yapacagimiz variable'nin data turu tek olacagindan
        // atama yapamayiz
        //Sadece direk yazdirabiliriz

        System.out.println(sayi>100 ? sayi*sayi : "sayi yuzden buyuk olmali");

    }
}
