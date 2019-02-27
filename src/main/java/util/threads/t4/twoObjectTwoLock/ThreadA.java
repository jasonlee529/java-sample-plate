package util.threads.t4.twoObjectTwoLock;

public class ThreadA extends Thread {

    private HasPrivateNum privateNum;

    public ThreadA( HasPrivateNum privateNum) {
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        super.run();
        privateNum.addI("a");
    }
}
