package util.threads.t5.sync.s3;

public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String tmp1 = " 1 threadName = " + Thread.currentThread().getName();
            String tmp2 = " 2 threadName = " + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = tmp1;
                getData2 = tmp2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
