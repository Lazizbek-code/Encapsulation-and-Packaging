package one;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7);
        rectangle.calculate();

        rectangle.setWidth(8);
        rectangle.setHeight(10);
        rectangle.calculate();

    }
}
