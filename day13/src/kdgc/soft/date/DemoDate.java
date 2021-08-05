package kdgc.soft.date;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        Date date = new Date();
        long d = date.getTime();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(d));
    }
}
