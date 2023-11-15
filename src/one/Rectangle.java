package one;

public class Rectangle {
    private int width;
    private int height;

    private int result;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int result) {
        this.width = width;
        this.height = height;
        this.result = result;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void calculate(){
        result = width * height;
        System.out.println("Area of the rectangle: " + result);
    }
}
