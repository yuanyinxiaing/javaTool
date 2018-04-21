package codewar;

import java.util.Arrays;
import java.util.List;


public class Codewars {
    public static String oddOrEven (int[] array) {
        int sum=0;
        for(int i =0;i<array.length;i++){
            //todo 注意 +=和=+是两个不同的东西
            sum+=array[i];
        }
        return sum%2==1?"odd":"even";

    }



    public static void main(String[] args) {
         String str = Codewars.oddOrEven(new int[] {2, 5, 34, 6});
            System.out.print(str);
    }
}