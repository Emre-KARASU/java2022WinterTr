package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir arrays e yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7,5,2};
        int eklenecekElement=1;

        arr=arrayeElemanEkle(arr,eklenecekElement);
        arr=arrayeElemanEkle(arr,25);

        System.out.println(Arrays.toString(arr)); //[3, 5, 7, 4]

    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArrays[]=new int[arr.length+1];  // [0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArrays[i]=arr[i];

        }

        yeniArrays[yeniArrays.length-1]=eklenecekElement;

        return yeniArrays;

    }
}
