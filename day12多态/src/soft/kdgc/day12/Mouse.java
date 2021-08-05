package soft.kdgc.day12;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标USB");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标USB");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
