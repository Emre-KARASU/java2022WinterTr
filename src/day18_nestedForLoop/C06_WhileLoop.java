package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip bu sayilari ve
        // aralarindaki tum tamsayilari yazdiran bir kod yazdirin
        int baslangic=40;
        int bitis=60;

        for (int i=baslangic;  i<=bitis; i++){
            System.out.print(i+" ");
        }
        System.out.println("");

        // ayni soruyu while ile yapalim


        while (baslangic<=bitis){
            System.out.print(baslangic + " ");
            baslangic++;
        }
        System.out.println(baslangic); //


    }
}
