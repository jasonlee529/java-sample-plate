package util.threads.t5.sync.staticMethod.t1;

public class Service {
    public synchronized static void printA() {
        try {
            System.out.println(Thread.currentThread().getName() + "  " + System.currentTimeMillis() + " 进入方法 PrintA ");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + "  " + System.currentTimeMillis() + " 离开方法 PrintA ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized static void printB() {
        try {
            System.out.println(Thread.currentThread().getName() + "  " + System.currentTimeMillis() + " 进入方法 printB ");
            System.out.println(Thread.currentThread().getName() + "  " + System.currentTimeMillis() + " 离开方法 printB ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
