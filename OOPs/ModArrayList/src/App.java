public class App {
    public static void main(String[] args) throws Exception {
        ModArrayList<Integer> list = new ModArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list.getUsingMod(5));
    }
}
