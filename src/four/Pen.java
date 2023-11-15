package four;

public class Pen {
    private int inkLevel;
    private boolean clicked;
    private int oneLetter;

    public Pen(int inkLevel, int oneLetter) {
        this.inkLevel = inkLevel;
        this.clicked = false;
        this.oneLetter = oneLetter;
    }

    public void click() {
        if (!clicked) {
            clicked = true;
            System.out.println("Qalam bosiladi. Yozishga tayyor.");
        } else {
            System.out.println("Qalam allaqachon bosilgan.");
        }
    }

    public void write(String text) {
        if (clicked) {
            for (char c : text.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    inkLevel -= 2 * oneLetter;
                } else if (Character.isLowerCase(c)) {
                    inkLevel -= oneLetter;
                }

                if (inkLevel < 0) {
                    System.out.println("Siyoh tugadi. Yozishni to'xtating.");
                    return;
                }
            }

            System.out.println("Yozilgan matn: " + text);
        } else {
            System.out.println("Qalam bosilmaydi. Yozishdan oldin bosing.");
        }
    }

    public void displayInkLevel() {
        System.out.println("Miqdor: " + inkLevel);
    }

}
