package ra.baitap.bai7;

public class FindString {
    public static void main(String[] args) {
        String s="Đề bài: Viết chương trình tìm kiếm tuyến tính trong danh sách chuỗi, nhập danh sách và chuỗi cần tìm từ bàn phím";


        System.out.println(findString(s,"trong"));

    }
    private static boolean findString(String string,String value){
        String[] strings=string.split(" ");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(value)){

                System.out.println("vị trí : "+i);
                return true;
            }
        }
        return false;
    }
}
