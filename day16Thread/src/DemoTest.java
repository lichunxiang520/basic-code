public class DemoTest {
    public static void main(String[] args) {
        RunnableImp run = new RunnableImp();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
