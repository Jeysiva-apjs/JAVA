public class App {
    public static void main(String[] args) throws Exception {
        BankAccount jey = new BankAccount("Jey", 1100);
        System.out.println(jey);
        jey.withdraw(150);
        jey.deposit(250);
        System.out.println(jey);
    }
}
