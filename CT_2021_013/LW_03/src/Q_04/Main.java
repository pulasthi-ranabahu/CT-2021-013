package Q_04;

public class Main {
    public static void main(String[] args) {
        // Create a Bicycle with an owner
        Bicycle bike = new Bicycle("Pulasthi Ranabahu ", "077-1234567");

        // owner details
        System.out.println("Owner Name: " + bike.getOwnerName());
        System.out.println("Phone Number: " + bike.getPhoneNo());

        // Update owner details
        bike.setOwnerName("Kasun Ishara");
        bike.setPhoneNo("071-1234567");

        // Print updated owner details
        System.out.println("Updated Owner Name: " + bike.getOwnerName());
        System.out.println("Updated Phone Number: " + bike.getPhoneNo());
    }
}
