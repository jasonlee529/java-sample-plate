package util.threads.t5.sync.StringAndSync;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
        this.setName(this.getClass().getSimpleName());
    }

    @Override
    public void run() {
        super.run();
        service.print("AA");
    }
}
