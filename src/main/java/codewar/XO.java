package codewar;

import java.util.HashMap;

public class XO {

    public static boolean getXO (String str) {
        if(str.isEmpty()){
            return true;
        }
        char[] chars = str.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        int countX = 0;
        int counto = 0;
        for(char n : chars){
            if(n == 'x' ||n == 'X'){
                countX  +=1;
            }
            if(n == 'o' ||n == 'O'){
                counto +=  1;
            }

        }
        map.put("x",countX);
        map.put("o",counto);

        return map.get("x")==map.get("o");
    }



}