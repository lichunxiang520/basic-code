import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class test {
    @Test
    public void testReflect(){

        ReflectDemo1 reflectDemo1 = new ReflectDemo1();
        reflectDemo1.show();
    }
    @Before
    public void init(){
        System.out.println("init....");
    }
    @After
    public void close(){
        System.out.println("close....");
    }
    @Test
    public void testSub(){
        ReflectDemo1 reflectDemo1 = new ReflectDemo1();
        int sub = reflectDemo1.sub(1, 2);
        System.out.println(sub);
        Assert.assertEquals(2,sub);

    }
}
