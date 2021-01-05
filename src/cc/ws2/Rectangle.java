package cc.ws2;

public class Rectangle {

    private int height;
    private int width;
    private int size;


    public Rectangle(int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle:\n" +
                "height= " + height +
                ", width= " + width +
                '.';
    }

    public void printRectangle() {
        System.out.println(toString());
    }


}
