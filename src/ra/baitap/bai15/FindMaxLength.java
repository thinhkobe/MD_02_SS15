package ra.baitap.bai15;

import java.util.ArrayList;
import java.util.List;

public class FindMaxLength {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        String string="abcabcdgabxy";


        for (int i = 0; i < string.length(); i++) {
          String temp= String.valueOf(string.charAt(i));
          if (string.charAt(i)>string.charAt(i+1)){
              temp+=string.charAt(i+1);
          }else {
              list.add(temp);
              temp= String.valueOf(string.charAt(i+1));
          }
        }

        System.out.println(list);
    }
}
