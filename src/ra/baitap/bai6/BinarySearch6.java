package ra.baitap.bai6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class BinarySearch6 {
    public static void main(String[] args) {

        Integer[]arr=getArr();
        System.out.println(Arrays.toString(arr));

        System.out.println(search(arr,30));;

    }
    private static int search(Integer[]arr,Integer value){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
                if (Objects.equals(arr[mid], value)){
                    return mid ;
                }
                if (arr[mid]<value){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
        }
        return -1;
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
