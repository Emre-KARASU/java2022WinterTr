package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
       //bu cumlede bosluk disindaki karkter sayisini bulunuz?

        System.out.println("space haric karekter sayisi : " +str.replace( "", ""  ).length());
        // atama yapilmadigi surece orjinal// atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karekter sayisi : " + str.length());

        // str da kalici degisiklik yapalim
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz

        str=str.replace("Bugun", "yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : " + str);
        str.replace("ne cok", "ne az");
        System.out.println(str);




    }
}
