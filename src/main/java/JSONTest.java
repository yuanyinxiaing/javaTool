import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by yinxia.yyx on 18/3/19.
 */
public class JSONTest {

    //写法1 for循环
    public static void main1(String[] args) {
        String str = "[{name:'a',value:'aa'},{name:'b',value:'bb'},{name:'c',value:'cc'},{name:'d',value:'dd'}]";
        JSONArray array = JSON.parseArray(str);
        for(Object object : array){
            JSONObject jsonObject = (JSONObject)object;
            System.out.print("name:"+jsonObject.get("name")+" ");
            System.out.print("value:"+jsonObject.get("value")+" ");
        }
//        JSONObject jsonObject = JSONObject.parseObject(str);
//        System.out.print(jsonObject.toJSONString());
    }

    //写法2
    public static void main(String[] args) {
        String str = "[{name:'a',value:'aa'},{name:'b',value:'bb'},{name:'c',value:'cc'},{name:'d',value:'dd'}]";
        JSONArray jsonArray = (JSONArray) JSON.parseArray(str);
        jsonArray.stream().forEach(obj ->
        {
            JSONObject jsonObject = (JSONObject) obj;
            System.out.print("name:" + jsonObject.get("name") + " ");
            System.out.print("value:" + jsonObject.get("value") + " ");
        });
    }
}
