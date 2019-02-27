package util.threads.t5.sync.s3;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        a.start();
        ThreadB b = new ThreadB(task);
        b.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println(" 耗时 : " + (endTime - beginTime) / 1000);

    }
}
