public class App {
    public static void main(String[] args) throws Exception {
        Employee jey = new Employee("JEY", 25, 500, Location.Madurai);
        Employee vidhya = new Employee("Vidhya", 35, 1000, Location.Bangalore);

        jey.raiseSalary(150);
        System.out.println(jey);
        System.out.println(vidhya);

    }
}
