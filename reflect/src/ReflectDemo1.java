import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo1 {
    /**
     * 获取字节码文件的三种方式
     */
    public static void main(String[] args) throws Exception {
//        Class cls1 = Class.forName("Person");//多用于配置文件
//        System.out.println(cls1);
//        Class<Person> cls2 = Person.class;//多用于传参
//        System.out.println(cls2);
//        Person p= new Person();
//        Class cls3 = p.getClass();//多用于对象获取字节码的方式
//        System.out.println(cls3);
//        System.out.println(cls1==cls2);
//        System.out.println(cls2==cls3);
        InputStream is = ReflectDemo1.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pro = new Properties();
        pro.load(is);
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);



    }
    public void show(){
        System.out.println("吃饭");
    }
    public int sub(int a,int b){
        return a+b;
    }
}
