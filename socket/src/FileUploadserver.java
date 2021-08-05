import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class FileUploadserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true){
            Socket accept = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = accept.getInputStream();
                        String fileName = "kdgcsoft"+System.currentTimeMillis()+ new Random().nextInt(999999999)+".png";
                        File file = new File("D:\\upload");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len=is.read(bytes))!=-1){
                            fos.write(bytes,0,len);
                        }
                        accept.getOutputStream().write("文件上传成功".getBytes());
                        fos.close();
                        accept.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }finally {

                    }
                }
            });

        }




    }
}
