package soft.kdgc.day12;

public class TestUsb {
    public static void main(String[] args) {
        Computer cm = new Computer();
        USB mouse = new Mouse();
        cm.useUsbdevice(mouse);
        Keybord keybord = new Keybord();
        cm.useUsbdevice(keybord);
    }
}
