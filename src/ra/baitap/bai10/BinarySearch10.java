package ra.baitap.bai10;

import java.util.Arrays;

public class BinarySearch10 {
    public static void main(String[] args) {
        Integer[] list=getArr();
        System.out.println(Arrays.toString(list));
    }


//    private static int FindIndex(Integer[] arr,int value,boolean isMin){
//        int left
//    }

    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
}
