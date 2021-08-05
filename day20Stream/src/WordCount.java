import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

@Test
public void testWordCount(){
    Map<Character, Integer> map = new HashMap<>();
    FileReader fr = null;
    BufferedWriter bw = null;
    try {
        fr = new FileReader("11.txt");
        int c =0;
        while ((c=fr.read())!=-1){
            char ch =(char)c;
            if(map.get(ch)==null){
                map.put(ch,1);
            }else {
                map.put(ch,map.get(ch)+1);
            }
        }
        bw = new BufferedWriter(new FileWriter("wordcount.txt"));
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character,Integer> entry:entrySet){
            switch (entry.getKey()){
                case' ':
                    bw.write("空格="+entry.getValue());
                    break;
                case'\t':
                    bw.write("tab键="+entry.getValue());
                    break;
                case'\r':
                    bw.write("回车="+entry.getValue());
                    break;
                case'\n':
                    bw.write("换行="+entry.getValue());
                    break;
              default:
                    bw.write(entry.getKey()+"="+entry.getValue());
                    break;
            }
            bw.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if(bw!=null){
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(fr!=null){
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}



}

