import java.lang.reflect.Method;

import static java.lang.Class.*;

@Pro(className ="Demo2",methodName ="show")
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<ReflectDemo> reflectDemoClass = ReflectDemo.class;
        Pro p = reflectDemoClass.getAnnotation(Pro.class);
        String className = p.className();
        String methodName = p.methodName();
        Class cls = forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
