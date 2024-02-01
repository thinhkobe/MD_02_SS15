package ra.baitap.bai9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[]arr=getArr();
        System.out.println(Arrays.toString(arr));
        List<Integer> list=findRange(arr,30,60);
        for (Integer integer : list) {
            System.out.println("s"+integer);
        }
    }
    private static List<Integer> findRange(Integer[] arr,int min,int max){
        int start=index(arr,min,true);
        int end=index(arr,max,false);
        List<Integer>test=new ArrayList<>();
        for (int i = start; i <=end; i++) {
            test.add(arr[i]);
        }
        return test;
    }


    private static int index(Integer[]array,int value,boolean isMin){
        int right=array.length-1;
        int left=0;
        int result=-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (array[mid]==value){
                result=mid;
            } else if (array[mid]>value) {
                right=mid-1;
                result=mid;
            } else  {
                left=mid+1;
                result=mid;
            }
        }
        return isMin?result+1:result;
    }
    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
}
