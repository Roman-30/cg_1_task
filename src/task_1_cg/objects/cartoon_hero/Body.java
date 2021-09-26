package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;

public class Body extends DrawingObject {
    public Body(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setColor(this.color.darker());
        g.setStroke(new BasicStroke(5));

        double heightB = height * this.constWidth;
        double widthD = width * this.constHeight;

        g.drawOval((int) (width * this.constX), (int) (height * this.constY), (int) heightB, (int) widthD);
        g.drawOval((int) (width * this.constX / 0.932), (int) (height * this.constY), (int) (heightB / 2), (int) (widthD / 1.5));
        g.setColor(this.color);
        g.fillOval((int) (width * this.constX), (int) (height * this.constY), (int) heightB, (int) widthD);

        g.setColor(Color.WHITE.darker());

        g.fillOval((int) (width * this.constX / 0.932), (int) (height * this.constY), (int) (heightB / 2), (int) (widthD / 1.5));

        g.setStroke(oldStr);
        g.setColor(oldColor);
    }
}
