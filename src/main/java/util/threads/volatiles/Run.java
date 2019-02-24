package util.threads.volatiles;

public class Run {
    public static void main(String [] args){
        PrintString ps = new PrintString();
        ps.printStringMethod();
        System.out.println(" stop ! stopMeThread:"+ Thread.currentThread().getName());
        ps.setContinuePrint(false);
    }
}
