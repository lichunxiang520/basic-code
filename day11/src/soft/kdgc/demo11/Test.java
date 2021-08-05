package soft.kdgc.demo11;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 100);
        Member one = new Member("A", 0);
        Member two = new Member("B", 0);
        Member three = new Member("C", 0);
        Member four = new Member("D", 0);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        ArrayList<Integer> list = manager.send(70, 4);
        one.reserve(list);
        two.reserve(list);
        three.reserve(list);
        four.reserve(list);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
