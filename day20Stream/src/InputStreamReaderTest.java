import org.junit.Test;

import java.io.*;

/**
 * 转换流的使用
 * 1.转换流：属于字符流
 * inputStreamReader 将一个字节的输入流转换为字符的输入流
 * OutputStreamWriter 将一个字符的输出流转为字节的输出流
 * 2.作用：提供字节流和字符流之间的转换
 * 3.解码：字节，字节数组--->字符数组，字符串
 * 编码：字符数组，字符串---> 字节，字节数组
 */
public class InputStreamReaderTest {
    @Test
    public void test1() {
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("11.txt");
            isr = new InputStreamReader(fis, "utf-8");
            char[] buff = new char[1024];
            int len;
            while ((len = isr.read(buff)) != -1) {
                System.out.println(new String(buff,0,len));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            FileInputStream fis = new FileInputStream("11.txt");
            FileOutputStream fos = new FileOutputStream("11_gbk.txt");
            isr = new InputStreamReader(fis, "utf-8");
            osw = new OutputStreamWriter(fos, "gbk");
            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
@Test
    public void test3() {
        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("11_gbk.txt");
            isr = new InputStreamReader(fis, "gbk");
            char[] cbuf = new char[20];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                System.out.println(new String(cbuf,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
