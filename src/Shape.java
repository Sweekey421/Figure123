import java.awt.*;

public abstract class Shape {

    String color;
    int x, y;
    int a, b;
    public abstract void draw(Graphics p, int x, int y, int a, int b);
}