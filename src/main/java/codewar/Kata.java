package codewar;

import java.util.*;
import java.util.stream.Collectors;


public class Kata {
    public static String HighAndLow(String numbers) {

        String[] integers =  numbers.split(" ");
        List<String> integerList = Arrays.asList(integers);
        List<Integer> listInteger = integerList.stream().map(str->{
            return Integer.valueOf(str);

        }).collect(Collectors.toList());

        Integer max = Collections.max(listInteger);
        Integer min = Collections.min(listInteger);


        // Code here or
        return max+" "+min;
    }

    public static void main(String[] args) {
       String result =  Kata.expandedForm(42);
       System.out.print(result);
    }


    public static String expandedForm(int num)
    {
        String result = "";
        TreeMap treeMap = getTreeMap(num);
        Set<Map.Entry<Integer, Integer>> entryseSet=treeMap.entrySet();
        for(Map.Entry<Integer,Integer> entry : entryseSet){
            if(entry.getValue()>0){
                if(result==""){
                    result = entry.getValue()*entry.getKey()+"";
                }else{
                    result+=" + "+  entry.getValue()*entry.getKey();
                }

            }
        }
        return result;

    }

    static int getNweiNo(int num,int b){
        return (num%(b*10))/b;
    }


    static TreeMap getTreeMap(int num){
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int bit=1;bit<1000000000;bit=bit*10){
            treeMap.put(bit,getNweiNo(num,bit));
        }
        return treeMap;
    }



}
