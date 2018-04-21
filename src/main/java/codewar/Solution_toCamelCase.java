package codewar;


public class Solution_toCamelCase {

    private static String split1="-";
    private static  String split22="_";

    static String toCamelCase(String s){
        String result="";
        if( s.isEmpty() ){
            return s;
        }
        result = s.substring(0,1);
        String[] split =  s.substring(1,s.length()).split(split1);
        String[] split2 =  s.substring(1,s.length()).split(split22);
        if(split.length>2){
            for(String subStr : split){
                result = result+upperCase(subStr);
            }
        }
        if(split2.length>2){
            for(String subStr : split2){
                result = result+upperCase(subStr);
            }
        }
        return result;
    }

    public  static String upperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public  static String lowerCase(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
