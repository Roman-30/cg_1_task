package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

public class Hands extends DrawingObject {
    public Hands(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        g.setColor(this.color.darker());

        Ellipse2D right = new Ellipse2D.Double(this.constX * width, this.constY * height, this.constWidth * width, this.constHeight * height);
        Ellipse2D left = new Ellipse2D.Double(width * (this.constX + (-0.6222547)), height * (-(this.constY - 0.1134752)), this.constWidth * width, this.constHeight * height);

        AffineTransform at0 = AffineTransform.getTranslateInstance(0, 0);
        AffineTransform at1 = AffineTransform.getTranslateInstance(0, 0);

        at0.rotate(Math.toRadians(70));
        at1.rotate(Math.toRadians(-70));

        g.fill(at0.createTransformedShape(right));
        g.fill(at1.createTransformedShape(left));
        g.setColor(oldColor);

    }
}
