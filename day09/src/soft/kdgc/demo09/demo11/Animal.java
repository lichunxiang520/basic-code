package soft.kdgc.demo09.demo11;
/*
抽象方法，加上abstract,然后去掉大括号，加上分号
抽象类：抽象方法所在的类，必须是抽象类才行，在class之前加上abstract即可
如果使用抽象类和抽象方法
1.不能直接创建new抽象类对象
2.必须用一个子类来继承父类
3.子类必须实现抽象父类中所有的抽象方法
* */
public abstract   class Animal {
    //这是个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
    public abstract void eat();
    //这是普通的成员方法
    public void normalMethod(){

    }

}
