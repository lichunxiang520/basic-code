import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String separator = File.separator;//文件名称分隔符
        String pathSeparator = File.pathSeparator;//路径分隔符
        System.out.println(separator);
        System.out.println(pathSeparator);
    }
}
