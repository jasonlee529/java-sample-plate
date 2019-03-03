package util.threads.t5.sync.staticMethod.syncTwoLock;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
        ThreadC c = new ThreadC(service);
        c.start();
    }
}
