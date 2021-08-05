import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);//创建线程池
        es.submit(new RunnableIml());//获取线程，执行线程
        es.submit(new RunnableIml());
        es.submit(new RunnableIml());
        es.shutdown();//关闭线程池
        es.submit(new RunnableIml());
    }
}
