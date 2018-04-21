/**
 * Created by yinxia.yyx on 18/3/28.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Integer bizType1=6000;
        Integer bizType2=6000;
        int bizType3=6000;
        System.out.print(bizType1==bizType2);
        System.out.print(bizType1.equals(bizType2));
        System.out.print(bizType2.equals(bizType3));
        System.out.print(bizType2 == bizType3);
    }
}
