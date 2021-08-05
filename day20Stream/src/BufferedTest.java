import org.junit.Test;

import java.io.*;

/**
 * 缓冲流的使用
 * 1.BufferedInputStream
 * 2、BufferedOutputStream
 * 3.BufferedReader
 * 4.BufferedWriter
 * 提高流的读取、写入的速度
 */
public class BufferedTest {
    @Test
    public void BufferedStreaTest(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("11.png");
            File destFile = new File("12.png");
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if(bos!=null){
               try {
                   bos.close();
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
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void BufferedStreamTest2(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("a.txt")));
            bw = new BufferedWriter(new FileWriter(new File("c.txt")));
            int len;
            char[] cbuf = new char[1024];
            while ((len = br.read(cbuf))!= -1){
                bw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void BufferedStreamTest3(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("a.txt")));
            bw = new BufferedWriter(new FileWriter(new File("c.txt")));
            String data;
            while ((data =br.readLine())!=null){
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
