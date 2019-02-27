package util.threads.t4.interrupt;

public class Run {
    public static void main(String[] args) {
        try {
            Thread mt = new MyThread();
            mt.start();
            mt.sleep(500);
            mt.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
