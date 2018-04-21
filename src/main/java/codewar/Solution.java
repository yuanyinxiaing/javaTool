package codewar;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yinxia.yyx on 18/4/17.
 */
public class Solution {

    private static List<Integer> integerList = Arrays.asList(3,5);

    public int solution(int number) {
        int sum = 0;
        for(int i =0;i<number;i++){
            if(i%integerList.get(0)==0 ||i%integerList.get(1)==0){
                sum+=i;
            }
        }
        return sum;
    }

    public boolean checkThreeAndTwo(char[] chars) {
        boolean haspass = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'b' || chars[i] == 'c') {
                haspass = true;
                break;
            }
        }
        return haspass;
    }

}
