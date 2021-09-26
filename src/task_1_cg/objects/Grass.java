package task_1_cg.objects;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.util.Random;

public class Grass extends DrawingObject {
    Random rnd = new Random();

    public Grass(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setStroke(new BasicStroke(3));
        g.setColor(this.color.darker());

        for (int i = 0; i < (int) (width * this.constX); i++) {
            g.drawArc((width / 5) + rnd.nextInt(width * 3 / 5), (int) (height / 1.33) + rnd.nextInt(height / 3), (int) (width * this.constWidth), (int) (height * this.constHeight), 0, 90 + rnd.nextInt(50));
            Arc2D arc2D = new Arc2D.Double(new Rectangle((int) (width * this.constWidth), (int) (height * this.constHeight)), 0, 90 + rnd.nextInt(50), Arc2D.OPEN);
            AffineTransform at1 = AffineTransform.getTranslateInstance((int) (width / 5) + rnd.nextInt(width * 3 / 5), (int) (height / 1.33) + rnd.nextInt(height / 3));
            at1.rotate(Math.toRadians(270));
            g.draw(at1.createTransformedShape(arc2D));
        }

        g.setColor(oldColor);
        g.setStroke(oldStr);
    }
}
