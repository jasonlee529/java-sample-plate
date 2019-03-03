package util.threads.t5.sync.staticMethod.t1;

public class Run {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();
        ThreadB b = new ThreadB();
        b.start();

    }
}
