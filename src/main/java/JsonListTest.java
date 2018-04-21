import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yinxia.yyx on 18/3/31.
 */
public class JsonListTest {

    public static void main(String[] args) {
                String a[] = new String[]{ "arp", "live", "strong" };
                String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
                String r[] = new String[] { "arp", "live", "strong" };
                List<String> a1= Arrays.asList(a);
                List<String> b1= Arrays.asList(b);
                List<String> r1 = Arrays.asList(r);
                List<String> r2 = new ArrayList<>();
                for(String str: r1){
                    if(a1.contains(str) ||b1.contains(str)){
                        r2.add(str);
                    }
                }
            String[] arrrresult = (String[])r2.toArray();
                System.out.print(JSONObject.toJSONString(arrrresult));
            }
}
