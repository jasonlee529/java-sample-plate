package util.threads.t4.twoObjectTwoLock;

public class Run {
    public static void main(String[] args) {
        HasPrivateNum num1 = new HasPrivateNum();
        HasPrivateNum num2 = new HasPrivateNum();
        ThreadA a = new ThreadA(num1);
        ThreadB b = new ThreadB(num1);
        a.start();
        b.start();
    }
}
