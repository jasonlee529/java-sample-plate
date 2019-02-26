package util.threads.t4.threadsafe;

public class LoginServlet {
    private static String userNameRef;
    private static String passwordRef;

    public synchronized static void doPost(String userName, String password) {
        try {
            userNameRef = userName;
            if ("a".equals(userNameRef)) {
                Thread.sleep(500);
            }
            passwordRef = password;
            System.out.println("usernmae = " + userNameRef + " pasword = " + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
