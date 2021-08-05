import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Class cls = calculator.getClass();
        Method[] methods = cls.getMethods();
        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常名称" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因" + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-----------------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次一共出现了" + num + "次异常");
        bw.flush();
        bw.close();

    }
}
