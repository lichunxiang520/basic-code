public class RunnableImp implements Runnable {
    private int ticket = 1000;
    Object obj = new Object();

    @Override
    public void run() {

        while (true) {
//            synchronized (obj) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "正在卖票" + ticket);
//                    ticket--;
//                    System.out.println(ticket);
//                }
//            }
            sell();
        }
    }
    private void sell(){
        synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖票" + ticket);
                    ticket--;
                    System.out.println(ticket);
                }
            }
    }
}
