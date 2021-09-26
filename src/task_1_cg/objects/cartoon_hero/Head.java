package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;

public class Head extends DrawingObject {

    public Head(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setColor(this.color.darker());
        g.setStroke(new BasicStroke(10));
        g.drawOval((int) (width * this.constX), (int) (height * this.constY), (int) (height * this.constWidth), (int) (width * this.constHeight));
        g.drawOval((int) (width * (this.constX + 0.014641288433382138)), (int) (height * (this.constY + 0.028368794326241148)), (int) (width * (this.constWidth - 0.21406183282099045)), (int) (height * (this.constHeight + 0.09083309969575196)));
        g.fillOval((int) (width * this.constX), (int) (height * this.constY), (int) (height * this.constWidth), (int) (width * this.constHeight));
        g.setColor(Color.WHITE.darker());
        g.fillOval((int) (width * (this.constX + 0.014641288433382138)), (int) (height * (this.constY + 0.028368794326241148)), (int) (width * (this.constWidth - 0.21406183282099045)), (int) (height * (this.constHeight + 0.09083309969575196)));

        g.setStroke(oldStr);
        g.setColor(oldColor);
    }
}
