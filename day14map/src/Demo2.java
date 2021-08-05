import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三",38),"China");
        map.put(new Person("李四",18),"England");
        map.put(new Person("王五",18),"America");
        map.put(new Person("张三",38),"JaPan");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("===========================================");
        Map<Person, String> map2 = new LinkedHashMap<>();
        map2.put(new Person("张三",38),"China");
        map2.put(new Person("李四",18),"England");
        map2.put(new Person("王五",18),"America");
        map2.put(new Person("张三",38),"JaPan");
        Set<Map.Entry<Person, String>> set2 = map2.entrySet();
        for (Map.Entry<Person, String> entry : set2) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
