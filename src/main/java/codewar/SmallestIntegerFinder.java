package codewar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * 注意
 * 如特殊情况如下：

 （1）常常使用Arrays.asLisvt()后调用add，remove这些method时出现java.lang.UnsupportedOperationException异常。这是由于：

 Arrays.asLisvt() 返回java.util.Arrays$ArrayList， 而不是ArrayList。Arrays$ArrayList和ArrayList都是继承AbstractList，remove，add等 method在AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。ArrayList override这些method来对list进行操作，但是Arrays$ArrayList没有override remove(int)，add(int)等，所以throw UnsupportedOperationException。

 解决方法是使用Iterator，或者转换为ArrayList

 List list = Arrays.asList(a[]);
 List arrayList = new ArrayList(list);
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        if(args.length==0){
            return 0;
        }
        List<Integer> list = Arrays.asList();
        List<Integer> arrayList = new ArrayList(list);

        for(int i:args){
            arrayList.add(Integer.valueOf(i));
        }
        return Collections.min(arrayList);
    }

    public static void main(String[] args) {
     int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
     System.out.print(actual);
    }
}
