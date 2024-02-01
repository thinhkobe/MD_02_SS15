package ra.baitap.bai4;

import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {

       int[] arr=getArr();

        System.out.println("Số lớn nhất là :"+findMax(arr));
    }
    private  static int findMax(int[] arr){
        int max=arr[0];
        for (int i : arr) {
            if (i>max){
                max=i;
            }
        }
        return max;
    }
    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }
}
