package util.threads.volatiles;

/**
 * 测试volatile关键字
 */
public class PrintStringThead extends  PrintString implements Runnable{

    public void printStringMethod(){
        try{
            while(isContinuePrint() == true){
                System.out.println(" run printStringMethod threadName = "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run() {
        printStringMethod();
    }
}
