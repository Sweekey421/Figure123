import java.awt.*;

public class Circle extends Shape{
    @Override
    public void draw(Graphics p,  int x, int y,int a,int b) {
        p.drawOval(x, y, a, b);
    }
    public Circle(int x, int y, int a, int b){
        super.a = a;
        super.b = b;
        super.x = x;
        super.y = y;
    }
}