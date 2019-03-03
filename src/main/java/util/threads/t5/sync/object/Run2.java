package util.threads.t5.sync.object;

public class Run2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject objecta = new MyObject();
        MyObject objectb = new MyObject();
        ThreadA a = new ThreadA(service, objecta);
        ThreadB b = new ThreadB(service, objectb);
        a.start();
        b.start();
    }
}
