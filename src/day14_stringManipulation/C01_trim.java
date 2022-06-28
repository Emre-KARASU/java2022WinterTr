package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {
        String str="   Siz ne derseniz deyin java bildigini okur.   ";

        str.trim();
        System.out.println(str); // Siz ne derseniz deyin java bildigini okur. bosluklu

        str=str.trim();
        System.out.println(str); // Siz ne derseniz deyin java bildigini okur. bosluksuz
        System.out.println(str.length()); // 42


    }
}
