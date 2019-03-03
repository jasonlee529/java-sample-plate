package util.threads.t5.sync.StringAndSync2;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
        this.setName(this.getClass().getSimpleName());
    }

    @Override
    public void run() {
        super.run();
        service.print(new Object());
    }
}
