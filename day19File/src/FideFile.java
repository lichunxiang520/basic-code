import java.io.File;
import java.io.FileFilter;

public class FideFile {
    public static void main(String[] args) {
        File file = new File("E:\\");
        getFile(file);

    }
    public static void getFile (File dir){
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith("java");
            }
        });
        for (File file : files) {
            if(file.isDirectory()){
                getFile(file);
            }else {
                System.out.println(file);
            }
        }
    }
}
