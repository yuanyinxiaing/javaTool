import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yinxia.yyx on 18/3/20.
 */
public class AcceptMethod {
//
//    public static void  printValur(String str){
//        System.out.println("print value : "+str);
//    }
//
//    public static void main(String[] args) {
//        List<String> al = Arrays.asList("a","b","c","d");
//        for (String a: al) {
//            AcceptMethod.printValur(a);
//        }
//        //下面的for each循环和上面的循环是等价的
//        al.forEach(x->{
//            AcceptMethod.printValur(x);
//        });
//
//        al.forEach(x->{
//            AcceptMethod::printValur(x);
//        });
//    }
    //写法1
    public static void main1(String[] args) {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
        System.out.println(collected);
    }

    //写法2
    public static void main(String[] args) {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        collected = collected.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));//注意发生的变化
        System.out.println(collected);
    }
}