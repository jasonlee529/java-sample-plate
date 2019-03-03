package util.threads.t5.sync.StringAndSync;

public class Service {
    public static void print(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
