public class Chihuo extends Thread{
    private Baozi bz;
    public Chihuo(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
       while(true){
           synchronized (bz){
               if(bz.flag == false){
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println("吃货正在"+bz.pi+bz.xian);
               bz.flag = false;
               bz.notify();
               System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了，包子铺开始生产包子");
               System.out.println("------------------------------------------");
           }
       }
    }
}
