public class Main {

    public static void main(String[] args) {

        Department management = new Department(1,"Management");

        Employee hans = new Employee(1,"Hans",management);

        Employee shallow_clone = hans.shallow_clone();
        Employee deep_copy = new Employee(hans);

        System.out.println("-----------Original------------");
        hans.print();
        System.out.println("-----------Shallow Clone------------");
        shallow_clone.print();
        System.out.println("-----------Deep Copy---------------");
        deep_copy.print();
    }
}
