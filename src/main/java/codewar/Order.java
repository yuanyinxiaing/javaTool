package codewar;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Order {
    public static String order(String words) {
        if(words.isEmpty()){
            return words;
        }
        String result = "";
        String[] str = words.split(" ");
        TreeMap<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (String subStr : str) {
            String regEx = "[^0-9]";//匹配指定范围内的数字
            //Pattern是一个正则表达式经编译后的表现模式
            Pattern p = Pattern.compile(regEx);
            // 一个Matcher对象是一个状态机器，它依据Pattern对象做为匹配模式对字符串展开匹配检查。
            Matcher m = p.matcher(subStr);
                Integer digister = Integer.valueOf( m.replaceAll("").trim());
                map.put(digister, subStr);
        }
        Set<Map.Entry<Integer, String>> entryseSet=map.entrySet();
        StringBuilder builder=new StringBuilder();
        for (Map.Entry<Integer, String> entry:entryseSet) {
            builder.append(entry.getValue())
                    .append(" ");
        }
        result = builder.toString().trim();
        return result;
    }

    public static void main(String[] args) {
        Order.order("");
    }
}
