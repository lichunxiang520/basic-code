package cn.com.kdsoft;

public class Zi extends Fu {
    int num = 10;

    public void method() {
        super.method();//访问父类中的method
        System.out.println("子类中的方法");
    }
    //子类必须调用父类的构造方法，不写赠送super(),写了则用写的指定super调用，super只能是一个，还必须是第一个
    public Zi(){
        super(100);
       // super();
        System.out.println("子类构造方法");
    }
    //在子类的成员放法中访问父类的成员变量
    public void methodZi(){
        System.out.println(super.num);
    }
}
