import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket accept = server.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os = accept.getOutputStream();
        os.write("收到，谢谢!".getBytes());
        is.close();
        os.close();
    }
}
