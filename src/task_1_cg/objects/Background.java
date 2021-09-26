package task_1_cg.objects;

import java.awt.*;

public class Background extends DrawingObject {
    public Background(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x08E0F3));
        g.fillRect(0, 0, width, height);

        g.setColor(this.color.darker());
        g.setStroke(new BasicStroke(5));
        g.drawOval(-(int) (this.constX * width), (int) (height / 1.5), (int) (width * this.constWidth), height);
        g.setColor(this.color);
        g.fillOval(-(int) (this.constX * width), (int) (height / 1.5), (int) (width * this.constWidth), height);
        g.setColor(oldColor);

    }
}
