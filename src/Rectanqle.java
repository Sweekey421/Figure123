import java.awt.*;

public class Rectanqle extends Shape{

    public Rectanqle(int x, int y, int a, int b ){
        super.a = a;
        super.b = b;
        super.x = x;
        super.y = y;
    }
    @Override
    public void draw(Graphics p, int x, int y, int a, int b) {
        p.drawRect(x, y, a, b);
    }
}