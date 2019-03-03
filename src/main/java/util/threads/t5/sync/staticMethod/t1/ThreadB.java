package util.threads.t5.sync.staticMethod.t1;

public class ThreadB extends Thread {

    public void run() {
        Service.printB();
    }
}
