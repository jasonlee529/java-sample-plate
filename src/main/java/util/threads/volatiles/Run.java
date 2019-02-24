package util.threads.volatiles;

public class Run {
    public static void main(String [] args){
//        PrintString ps = new PrintString();
//        ps.printStringMethod();
//        System.out.println(" stop ! stopMeThread:"+ Thread.currentThread().getName());
//        ps.setContinuePrint(false);

        PrintStringThead pst = new PrintStringThead();
        new Thread(pst).start();
        System.out.println(" stop ! stopMeThread:"+ Thread.currentThread().getName());
        pst.setContinuePrint(false);
    }
}
