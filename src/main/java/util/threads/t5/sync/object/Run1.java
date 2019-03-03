package util.threads.t5.sync.object;

public class Run1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        ThreadB b = new ThreadB(service, object);
        a.start();
        b.start();
    }
}
