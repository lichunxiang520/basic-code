package soft.kdgc.demo11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> alist = new ArrayList<>();
        if (totalMoney > super.getMoney()) {
            System.out.println("余额不足");
            return alist;
        }
        int avg = totalMoney / count;
        int model = totalMoney % count;
        super.setMoney(super.getMoney()-totalMoney);
        for (int i = 0; i < count - 1; i++) {
            alist.add(avg);
        }
        alist.add(avg + model);
        return alist;

    }
}
