package four;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen(25, 1);

        pen.click();

        pen.write("Hello, World!");

        pen.displayInkLevel();

        pen.write("Assalomu alaykum");

        pen.displayInkLevel();
    }
}
