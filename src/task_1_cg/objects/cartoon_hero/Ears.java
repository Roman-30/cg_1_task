package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;

public class Ears extends DrawingObject {
    public Ears(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        Color oldColor = g.getColor();
        g.setColor(this.color.darker());
        g.fillOval((int) (width * this.constX), (int) (height * this.constY), width / 6, (int) (height * this.constHeight));
        g.fillOval((int) (width * this.constWidth), (int) (height * this.constY), width / 6, (int) (height * this.constHeight));
        g.setColor(Color.WHITE.darker());
        g.fillOval((int) (width * (this.constX + 0.014641288433382138)), (int) (height * (this.constY + 0.04255319148936171)), (int) (width * (this.constY - 0.02483822539731842)), (int) (height * (this.constHeight - 0.0911812541745947)));
        g.fillOval((int) (width * (0.28725970653300707 + this.constX)), (int) (height * (this.constY + 0.04255319148936171)), (int) (width * (this.constY - 0.02483822539731842)), (int) (height * (this.constHeight - 0.0911812541745947)));
        g.setColor(oldColor);

    }      // 0.27855051244509516, 0.16595744680851063, 0.5530746705710102, 0.3475177304964539
}
