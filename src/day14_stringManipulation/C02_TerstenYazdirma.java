package day14_stringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin.

        String input="Olga";

        String tersstr=input.substring(3).toUpperCase()+
                        input.substring(2,3).toUpperCase()+
                        input.substring(1,2).toUpperCase()+
                        input.substring(0,1).toUpperCase();
        System.out.println(tersstr);




    }
}
