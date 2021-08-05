package soft.kdgc.demo09;

/*
 * 1.在本类的方法中使用本类的成员变量
 * 2.在本类成员方法中，访问本类中的另一个成员方法
 * 3.在本类构造方法中，访问另一个构造方法
 * 注意在第三种
 * A: this(...)调用必须是构造方法的第一个语句,唯一一个
 * B:super和this两种构造调用，不能同时使用
 * */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
      //  super();
       // this(123);//本类的无参构造调用本类的有参构造
        this(1,1);
        System.out.println("调用");
    }

    public Zi(int n) {

    }

    public Zi(int n, int m) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }

    public void methodA() {

        System.out.println("AAAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
