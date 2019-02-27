package util.threads.runnable;

public class Run2 {

    public static void main(String[] args) {
        Runnable mt = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + " count  : ");

            }
        };
        mt.run();
        Thread t1 = new Thread(mt, "A");
        Thread t2 = new Thread(mt, "B");
        Thread t3 = new Thread(mt, "C");
        Thread t4 = new Thread(mt, "D");
        Thread t5 = new Thread(mt, "E");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        mt.run();
    }
}
