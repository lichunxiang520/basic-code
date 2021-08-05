import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = scanner.next();
        for (char c : next.toCharArray()) {
           if(map.containsKey(c) ){
               Integer value = map.get(c);
               value++;
               map.put(c,value) ;
           } else {
              map.put(c,1);
           }
        }
        Set<Character> set = map.keySet();
        for (Character c : set) {
            System.out.println(c+"="+map.get(c));
        }

    }
}
