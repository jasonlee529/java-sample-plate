package util.threads.t5.sync.StringAndSync;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.setName(this.getClass().getSimpleName());
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.print("AA");
    }
}
