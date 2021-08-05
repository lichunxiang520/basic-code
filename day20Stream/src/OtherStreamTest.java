import org.junit.Test;

import java.io.*;

public class OtherStreamTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true){
                System.out.println("请输入字符串：");
                String s = br.readLine();
                if("e".equalsIgnoreCase(s)||"exit".equalsIgnoreCase(s)){
                    System.out.println("程序结束");
                    break;
                }
                String s1 = s.toUpperCase();
                System.out.println(s1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
    public void test(){
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true){
                System.out.println("请输入字符串：");
                String s = br.readLine();
                if("e".equalsIgnoreCase(s)||"exit".equalsIgnoreCase(s)){
                    System.out.println("程序结束");
                    break;
                }
                String s1 = s.toLowerCase();
                System.out.println(s1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
    public void test2(){
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");
            ps = new PrintStream(fos, true);
            if(ps!=null){
                System.setOut(ps);
            }
            for(int i=0;i<=255;i++){
                System.out.print((char) i);
                if(i%50==0)
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ps!=null){
                ps.close();
            }
        }

    }
    /**
     * 3.数据流
     * 3.1 DataInputStream 和 DataOutputStream
     * 3.2 作用：用于读取和写出基本数据类型的变量或字符串
     */
    @Test
    public void test3(){
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("data.txt"));
            dos.writeUTF("张三");
            dos.flush();
            dos.writeInt(23);
            dos.flush();
            dos.writeBoolean(true);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dos!=null){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test4() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        String s = dis.readUTF();
        int i = dis.readInt();
        boolean b = dis.readBoolean();
        dis.close();
        System.out.println("name="+s);
        System.out.println("年龄="+i);
        System.out.println("是否是男性="+b);
        dis.close();
    }
}
