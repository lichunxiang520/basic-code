import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    public static void show01(){
        File f1 = new File("E:\\workspace\\untitled");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static void show02(){
        File f1 = new File("E:\\workspace\\untitled");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        
    }
}
