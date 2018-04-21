import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by yinxia.yyx on 18/3/6.
 */
public class JsonObjectUtils {



    String  attributes;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public  void addAttribute(String name, String value) {
        if (StringUtils.isNotBlank(name) && StringUtils.isNotBlank(value)) {
            JSONObject attrJSONObject = null;
            if(StringUtils.isBlank(attributes)){
                attrJSONObject = new JSONObject();
            }else{
                attrJSONObject = JSONObject.parseObject(attributes);
            }
            attrJSONObject.put(name,value);
            this.attributes = JSONObject.toJSONString(attrJSONObject);
        }
    }


    public   Map<String,String> getAttributeMap(){
        JSONObject attrJSONObject = null;
        if(StringUtils.isBlank(attributes)){
            attrJSONObject = new JSONObject();
        }else{
            attrJSONObject = JSONObject.parseObject(attributes);
        }
        Map<String,String> valueMap = new TreeMap<String,String>();
        for (Map.Entry<String,Object> entry : attrJSONObject.entrySet()) {
            if (entry instanceof JSONObject)
                throw new IllegalArgumentException("json object in json is not support");

            valueMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return valueMap;
    }


//    @Test
//    public  void main(){
//        addAttribute("no","067573");
//        addAttribute("name","yinxia");
//        Map<String,String>  map =  getAttributeMap();
//        System.out.print(map.toString());
//
//    }

    public static int getDayNoOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dayNo = calendar.get(Calendar.DAY_OF_MONTH);
        return dayNo;
    }

    @Test
    public  void  main(){
        System.out.print( getDayNoOfMonth(new Date()));
    }




}
