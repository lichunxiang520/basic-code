import java.io.*;
import java.util.HashMap;

public class BufferReader  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
        HashMap<String, String> map = new HashMap<>();
        String line;
        while ((line = br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        for (String key : map.keySet()) {
            line=key+"."+map.get(key);
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
