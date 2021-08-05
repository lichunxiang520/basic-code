package soft.kdgc.demo11;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void reserve(ArrayList<Integer> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        int del = list.remove(index);
        super.setMoney(super.getMoney()+del);

    }
}
