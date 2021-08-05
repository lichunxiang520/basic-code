package soft.kdgc.day12;

public class Keybord implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘USB");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘USB");
    }
    public void keyType(){
        System.out.println("键盘输入");
    }
}
