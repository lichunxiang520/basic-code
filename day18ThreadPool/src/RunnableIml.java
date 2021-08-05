public class RunnableIml implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建一个新线程");
    }
}
