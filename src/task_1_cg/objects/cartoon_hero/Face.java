package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;

public class Face extends DrawingObject {
    public Face(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        g.setColor(this.color.darker());
        g.drawOval((int) (width * this.constX), (int) (height * this.constY), width / 35, width / 35);
        g.drawOval((int) (width * this.constWidth), (int) (height * this.constY), width / 35, width / 35);
        g.setColor(Color.WHITE);
        g.fillOval((int) (width * this.constX), (int) (height * this.constY), width / 35, width / 35);
        g.fillOval((int) (width * this.constWidth), (int) (height * this.constY), width / 35, width / 35);

        g.setColor(Color.BLACK);

        g.fillOval((int) (width * this.constHeight), (int) (height * (0.011347517730496415 + this.constY)), width / 70, width / 70);
        g.fillOval((int) (width * (this.constX + 0.007320644216691041)), (int) (height * (0.011347517730496415 + this.constY)), width / 70, width / 70);

        g.drawArc((int) (width * (this.constX + 0.03806734992679356)), height / 3, width / 35, width / 35, 210, 120);
        g.setColor(oldColor);

    }
}
