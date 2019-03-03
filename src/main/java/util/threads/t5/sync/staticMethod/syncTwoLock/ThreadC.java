package util.threads.t5.sync.staticMethod.syncTwoLock;


public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.setName(this.getClass().getSimpleName());
        this.service = service;
    }

    public void run() {
        service.printC();
    }
}
