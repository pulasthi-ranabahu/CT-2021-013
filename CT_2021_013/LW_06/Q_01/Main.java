package Q_01;

public class Main {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.setName("Tommy");

        System.out.println(obj1.speak());
        System.out.println(obj1.getName());

        Cat obj2 = new Cat();
        obj2.setName("Kitty");
        System.out.println(obj2.speak());
        System.out.println(obj2.getName());
    }
}
