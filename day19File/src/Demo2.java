import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
    show01();
    }
    public static void show01(){
        File f1 = new File("E:\\workspace\\basic-code\\a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        File f2 = new File("a.txt");
        System.out.println(f2.getAbsolutePath());


    }
}
