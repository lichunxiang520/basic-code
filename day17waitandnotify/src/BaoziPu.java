public class BaoziPu extends Thread {
    private Baozi bz;

    public BaoziPu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }

                count++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
            }
        }
    }
}
