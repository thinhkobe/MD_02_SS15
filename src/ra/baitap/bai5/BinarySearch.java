package ra.baitap.bai5;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr=getArr();
        System.out.println("Array"+arr);

    }
    // phương thức tìm kiếm nhị phân
    private static int find(int[] arr,int key){
        int right=arr.length-1;
        int left=0;
        while (left<=right){
          int  mid=(left+right)/2;
          if (key<arr[mid]){
              right=mid-1;
          } else if (key==arr[mid]) {
              return mid;
          }else{
              left=mid+1;
          }
        }
        return -1;
    }
    //tạo mảng số ngẫu nhiên
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
