import org.junit.Test;

import java.io.*;

public class fileinputstream {
    public static void main(String[] args) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            File file = new File("day20Stream\\11.png");
            is = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            os = new FileOutputStream("day20Stream\\12.png");
            int len = 0;
            while ((len=is.read())!=-1){
                os.write(bytes,0,len);
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test2(){
        FileReader is = null;
        FileWriter os = null;
        try {
            File file = new File("11.txt");
            is = new FileReader(file);
           char[] buff = new char[1024];
            os = new FileWriter("12.txt");
            int len = 0;
            while ((len=is.read(buff))!=-1){
                os.write(buff,0,len);
                System.out.println(new String(buff,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
