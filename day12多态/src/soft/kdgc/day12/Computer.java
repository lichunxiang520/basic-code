package soft.kdgc.day12;

public class Computer {
    public void  powerOff(){
        System.out.println("关闭电脑");
    }
    public void powerOn(){
        System.out.println("打开电脑");
    }
    public  void useUsbdevice(USB usb){
        if(usb instanceof Mouse){
            usb.open();
            usb.close();
            Mouse usb1 = (Mouse)usb;
            usb1.click();
        }else if (usb instanceof Keybord){
            usb.open();
            usb.close();
            ((Keybord) usb).keyType();
        }

    }
}
