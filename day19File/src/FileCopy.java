import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\cotton.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\cotton.jpg");
       int len = 0;
//        while((len=fis.read())!=-1){
//            fos.write(len);
//        }
        byte[] bytes = new byte[1024];
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }

}
