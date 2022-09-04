public class KronometreThread implements Runnable{
    private Thread thread;
    private String threadName;
    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("oluşturuluyor..."+threadName);
    }
    @Override
    public void run() {

            try {
                for (int i=0;i<=10; i++){
                    System.out.println(threadName+" : "+i);
                Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("kesildi"+threadName);
            }
        System.out.println("thread bitti");
        }
        public void start(){
            System.out.println("thread nesnesi oluşuyor");
            if (thread==null){
                thread=new Thread(this,threadName);
                thread.start();
            }

        }


    }

