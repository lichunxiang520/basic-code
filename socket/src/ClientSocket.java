import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("服务器，你好！".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        len = is.read(bytes);
        System.out.println(new String (bytes,0,len));
        is.close();
    }
}
