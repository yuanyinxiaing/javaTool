import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by yinxia.yyx on 18/3/25.
 */
public class GroupByMethodTest {

    public static void main(String[] args) {

        group();

    }

    private  static class ReplenishAdviseItem{
        public  ReplenishAdviseItem(Long supplierId,Long scItemId,String storeCode){
            this.supplierId = supplierId;
            this.scItemId = scItemId;
            this.storeCode = storeCode;
        }

        private   Long supplierId;

        private  Long scItemId;

        private  String storeCode;

        public  Long getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
        }

        public  Long getScItemId() {
            return scItemId;
        }

        public void setScItemId(Long scItemId) {
            this.scItemId = scItemId;
        }

        public  String getStoreCode() {
            return storeCode;
        }

        public void setStoreCode(String storeCode) {
            this.storeCode = storeCode;
        }
    }

    private static  Map<Long, Map<Long, Map<String, List<ReplenishAdviseItem>>>> group(){
        List<ReplenishAdviseItem> list = new ArrayList<ReplenishAdviseItem>();
        ReplenishAdviseItem replenishAdviseItem1 =  new ReplenishAdviseItem(111l,34343l,"HGH302");
        ReplenishAdviseItem replenishAdviseItem2 =  new ReplenishAdviseItem(111l,34344l,"HGH302");
        ReplenishAdviseItem replenishAdviseItem3 =  new ReplenishAdviseItem(111l,34343l,"HGH303");
        ReplenishAdviseItem replenishAdviseItem4=  new ReplenishAdviseItem(222l,34344l,"HGH303");
        ReplenishAdviseItem replenishAdviseItem5 =  new ReplenishAdviseItem(222l,34343l,"HGH304");
        ReplenishAdviseItem replenishAdviseItem6 =  new ReplenishAdviseItem(222l,34344l,"HGH305");
        list.add(replenishAdviseItem1);
        list.add(replenishAdviseItem2);
        list.add(replenishAdviseItem3);
        list.add(replenishAdviseItem4);
        list.add(replenishAdviseItem5);
        list.add(replenishAdviseItem6);
        //分组 供应商+后端货品+仓库分组
        Map<Long, Map<Long, Map<String, List<ReplenishAdviseItem>>>> group = list
                .stream()
                .collect(groupingBy(ReplenishAdviseItem::getSupplierId,
                        groupingBy(ReplenishAdviseItem::getScItemId,
                                groupingBy(ReplenishAdviseItem::getStoreCode))));
        return  group;
    }

}


