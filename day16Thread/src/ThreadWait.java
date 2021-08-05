public class ThreadWait {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("告知老板要的包子的数量和种类");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，开吃！");
                        System.out.println("=========================================");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (true){
                    synchronized (o) {
                        System.out.println("老板在5秒之后做好包子，告知顾客，可以吃包子了");
                        o.notify();
                    }
                }
            }
        }.start();
    }
}
