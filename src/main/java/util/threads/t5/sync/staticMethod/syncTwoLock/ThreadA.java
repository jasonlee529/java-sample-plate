package util.threads.t5.sync.staticMethod.syncTwoLock;


public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.setName(this.getClass().getSimpleName());
        this.service = service;
    }

    public void run() {
        service.printA();
    }
}
