import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PicTest {
    //图片的加密
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("11.png");
            fos = new FileOutputStream("11secret.png");
            byte[] buff = new byte[10];
            int len ;
            while ((len=fis.read(buff))!=-1){
                for (int i =0;i<len;i++){
                    buff[i]= (byte) (buff[i]^5);
                }
                fos.write(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("11secret.png");
            fos = new FileOutputStream("14.png");
            byte[] buff = new byte[10];
            int len ;
            while ((len=fis.read(buff))!=-1){
                for (int i =0;i<len;i++){
                    buff[i]= (byte) (buff[i]^5);
                }
                fos.write(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
