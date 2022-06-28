package day11_stringManipulation;

import java.util.Locale;

public class C01_tolowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="Java Guzeldir";
        //biz string methotlarini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

    str.charAt(5);  // boyle yazdigimizda sonuz artik string degil char
                    // olacaktir dolayisi ile String' de yapmak istedigimiz
                    // tum degisiklikleri once yapip sonra charAt() methodunu kullanmaliyiz.


        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); // Java Guzeldir
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));




    }
}
