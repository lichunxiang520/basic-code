public class ThreadWaityAndNotiyAll {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客1告知老板要的包子的数量和种类");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1包子已经做好了，开吃！");
                        System.out.println("=========================================");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (o) {
                        System.out.println("顾客2告知老板要的包子的数量和种类");
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2包子已经做好了，开吃！");
                        System.out.println("=========================================");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (o) {
                        System.out.println("老板在5秒之后做好包子，告知顾客，可以吃包子了");
                       // o.notify();
                       o.notifyAll();
                    }
                }
            }
        }.start();
    }

}
