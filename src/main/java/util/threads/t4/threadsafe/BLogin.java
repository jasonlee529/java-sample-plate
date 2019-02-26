package util.threads.t4.threadsafe;

public class BLogin extends Thread {
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
