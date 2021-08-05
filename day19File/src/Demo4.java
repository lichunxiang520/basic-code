import java.io.File;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) {
        show01();
        show02();
    }
    public static void show01(){
        File f1 = new File("E:\\workspace\\basic-code\\a.txt");
        try {
            boolean b1= f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f2 = new File("b2.txt");
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void show02(){
        File f1 = new File("aaa");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);
        File f2 = new File("11\\22\\333");
        boolean mkdirs = f2.mkdirs();
        System.out.println(mkdirs);
    }
}
