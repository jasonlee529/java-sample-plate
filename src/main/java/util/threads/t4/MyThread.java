package util.threads.t4;

public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" 由 " + this.currentThread().getName() + "计算 " + count);
        }
    }

    public static void main(String[] args) {
        Thread a = new MyThread("a");
        Thread b = new MyThread("b");
        Thread c = new MyThread("c");
        a.start();
        b.start();
        c.start();

//        MyThread mt = new MyThread("tt");
//        new Thread(mt,"a0").start();
//        new Thread(mt,"b0").start();
//        new Thread(mt,"c0").start();
//        new Thread(mt,"d0").start();
//        new Thread(mt,"e0").start();

    }
}
