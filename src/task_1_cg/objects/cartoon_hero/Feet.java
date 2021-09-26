package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;

public class Feet extends DrawingObject {

    public Feet(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();

        g.setColor(this.color.darker());
        g.setStroke(new BasicStroke(10));

        g.fillArc((int) (this.constX * width), (int) (this.constY * height), width / 26, height / 17, 0, 180);
        g.fillArc((int) (this.constWidth * width), (int) (this.constY * height), width / 26, height / 17, 0, 180);

        g.setStroke(oldStr);
        g.setColor(oldColor);

    }
}
