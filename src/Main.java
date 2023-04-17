public class Main {
    public static void main(String[] args) {
        LogTest Ma = new LogTest();
        boolean TrueLogin = Ma.isLoginValid("yaf1st");
        if (TrueLogin) System.out.println("Логин подходит!");
        else System.out.println("Логин не подходит!");
    }
}