package util.threads.t4.twoObjectTwoLock;

public class HasPrivateNum {
    private int num = 0;

    public synchronized void addI(String name) {
        try {
            if ("a".equals(name)) {
                num = 100;
                System.out.println(name + " a set over!");
                Thread.sleep(1000);
            } else {
                num = 200;
                System.out.println(name + " b set over!");
            }
            System.out.println(name + " num = " + num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
