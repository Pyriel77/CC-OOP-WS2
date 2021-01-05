package cc.ws2;

import static java.lang.Math.PI;

public class RoundedRectangle extends Rectangle{

    private int radius = 2;


    public RoundedRectangle(int height, int width, int size) {
        super(height, width, size);
    }

    public int getRoundRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (getHeight() * getWidth()) - (4 * (radius * radius) +
                (radius * radius * PI));

    }

    @Override
    public String toString() {
        return "RoundedRectangle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}

