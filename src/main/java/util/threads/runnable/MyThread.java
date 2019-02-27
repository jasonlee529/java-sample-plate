package util.threads.runnable;

public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    public void run() {
        count--;
        System.out.println(this.currentThread().getName() + " -- " + this.getName() + " count  : " + count);
    }
}
