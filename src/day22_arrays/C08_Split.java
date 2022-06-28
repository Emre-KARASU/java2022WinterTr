package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {

        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        //method olusturun

        String cumle="Nerede o 'hello world' yazdirayaman ogrenciler";
        String harf="e";
        harfKacKereKullanilmis(cumle, harf);


    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac=0;
        String harfStr=""+harf;
        String karekterler[]=cumle.split("");
        for (int i=0; i< karekterler.length; i++){
            if(karekterler[i].equals(harf)){
                sayac++;
            }
        }

        System.out.println("Aradiginiz " +harf+" verilen cumlede " +sayac+" adet kullanilmis");
    }
}
