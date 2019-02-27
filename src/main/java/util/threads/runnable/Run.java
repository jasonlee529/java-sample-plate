package util.threads.runnable;

public class Run {

    public static void main(String[] args) {
        MyThread mt = new MyThread("ccc");
        Thread t1 = new Thread(mt, "A");
        Thread t2 = new Thread(mt, "B");
        Thread t3 = new Thread(mt, "C");
        Thread t4 = new Thread(mt, "D");
        Thread t5 = new Thread(mt, "E");
        Thread t6 = new Thread(mt, "F");
        t6.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
