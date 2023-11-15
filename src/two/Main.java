package two;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Lazizbek");
        user.setLastName("Muzafarov");
        user.setPhoneNumber("+9998992254447");
        user.setAge(26);
        user.setIsMale("Male");

        user.print();
    }
}
