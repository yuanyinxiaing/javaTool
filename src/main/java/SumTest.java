import java.util.Arrays;
import java.util.List;

/**
 * Created by yinxia.yyx on 18/3/20.
 */
public class SumTest {

    public static void main(String[] args) {
        List<MyValue> list = Arrays.asList(new MyValue("1",2),new MyValue("",null));
        int sum = list.stream().mapToInt(MyValue::getValue).sum();
        System.out.print(sum);
    }



}

class MyValue{
    Integer value;
    String  name;

    MyValue(String name,Integer value){
        this.name = name;
        this.value = value;
    }
    Integer getValue(){
        return this.value;
    }

}
