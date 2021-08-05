import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        ArrayList<Map<String,Integer>> maps = new ArrayList();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        maps.add(map);
        System.out.println(maps);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> it = set.iterator();
//        while (it.hasNext()){
//           Map.Entry<String, Integer> entry = it.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
        System.out.println("============================================");
        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("赵丽颖",168);
        hashMap.put("杨颖",165);
        hashMap.put("林志玲",178);
        System.out.println("hasmap"+hashMap);
        Set<Map.Entry<String, Integer>> set2 = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : set2) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);

        }
    }
}
