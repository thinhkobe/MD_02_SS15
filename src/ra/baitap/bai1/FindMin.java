package ra.baitap.bai1;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMin {
    public static void main(String[] args) {
        int[] arr=getArr();
        System.out.println(Arrays.toString(arr));

//       OptionalInt min= Arrays.stream(arr).min();
//        System.out.println(min);
        int min=arr[0];
        for (int i : arr) {
            if (i<min){
                min=i;
            }
        }
        System.out.println(min);
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

}
