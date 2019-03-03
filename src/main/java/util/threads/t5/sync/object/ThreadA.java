package util.threads.t5.sync.object;

public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        this.setName("A");
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
