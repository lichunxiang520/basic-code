import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arra {
    public static void main(String[] args) {
        ArrayList<Map<String,Object>> list= new ArrayList<>();
        HashMap<String, Object> hp = new HashMap<>();
        hp.put("name","张三");
        hp.put("value",122);
        list.add(hp);
        HashMap<String, Object> hp1 = new HashMap<>();
        hp1.put("name","李四");
        hp1.put("value",77);
        list.add(hp1);
        System.out.println(list);

        int arr [] = {1,2,3,4,5,6};
        System.out.println(arr.toString());
        String msg = null;
        List<Map<String,Object>> values = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("name","未审核");
        map.put("value",0);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("name","审核通过");
        map1.put("value",0);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("name","审核不通过");
        map2.put("value",0);
        values.add(map);
        values.add(map1);
        values.add(map2);
        OffSiteAccessFlowMapExt offSiteAccessFlowMapExt = new OffSiteAccessFlowMapExt(msg == null ? "此时间段内无数据" : msg, values);
        System.out.println("values=="+offSiteAccessFlowMapExt.getValues());
    }

}
