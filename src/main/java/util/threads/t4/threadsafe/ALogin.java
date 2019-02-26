package util.threads.t4.threadsafe;

public class ALogin extends Thread {
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
