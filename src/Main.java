import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedImage okno = new BufferedImage(1080, 1080, BufferedImage.TYPE_INT_ARGB);
        Graphics o = okno.createGraphics();
        Circle circle = new Circle(50, 50, 200, 200);
        Rectanqle rectanqle = new Rectanqle(300, 50, 300, 50 );

        Shape[] shapes = { circle, rectanqle};
        for (int i = 0; i < shapes.length; i++){
            shapes[i].draw(o, shapes[i].x, shapes[i].y, shapes[i].a, shapes[i].b);
        }
        File file = new File("Shape.png");
        try {
            ImageIO.write(okno,"png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}