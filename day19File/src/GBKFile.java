import java.io.FileReader;
import java.io.IOException;

public class GBKFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("我是GBK格式的文档.txt");
        int len = 0;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }
        fr.close();
    }
}
