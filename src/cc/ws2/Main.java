package cc.ws2;

public class Main {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(5, 4, 0);
        Rectangle rRec1 = new RoundedRectangle(10, 5, 0);

        rec1.printRectangle();
        rRec1.printRectangle();
    }
}
