package util.threads.t4.twoObjectTwoLock;

public class ThreadB extends Thread {

    private HasPrivateNum privateNum;

    public ThreadB(HasPrivateNum privateNum) {
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        super.run();
        privateNum.addI("b");
    }
}
