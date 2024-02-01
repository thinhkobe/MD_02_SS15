package ra.baitap.bai3;

public class Advance {
    public static void main(String[] args) {
        int[][] arr=getArr();
        System.out.println( findIndex(arr,30));

    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    private static  boolean findIndex(int[][] arr ,int key){
        boolean check=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==key){
                    System.out.println("số "+key+"vị trí"+i+"/"+j);
                    check=true;
                }
            }
        }
        return check;
    }

}
