import java.io.File;

public class Demo3 {
    public static void main(String[] args) {
        show01();
    }
    public static void show01(){
        //File f1 = new File("E:\\workspace\\basic-code\\a.txt");
        File f1 = new File("E:\\workspace\\basic-code");
        System.out.println(f1.exists());
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
    }
}
