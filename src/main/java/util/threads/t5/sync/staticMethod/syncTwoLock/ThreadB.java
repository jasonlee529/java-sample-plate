package util.threads.t5.sync.staticMethod.syncTwoLock;


public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.setName(this.getClass().getSimpleName());
        this.service = service;
    }

    public void run() {
        service.printB();
    }
}
