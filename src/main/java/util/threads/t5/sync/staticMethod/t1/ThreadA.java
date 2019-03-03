package util.threads.t5.sync.staticMethod.t1;

public class ThreadA extends Thread {

    public void run() {
        Service.printA();
    }
}
