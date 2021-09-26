package task_1_cg;

import task_1_cg.objects.Background;
import task_1_cg.objects.Grass;
import task_1_cg.objects.World;
import task_1_cg.objects.cartoon_hero.Сheburashka;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final World world;

    public DrawPanel() {
        world = new World(0, 0, 0, 0, Color.GRAY);
        world.addDrawingObject(new Background(0.038021660799767404, 1, 1.0732064421669107, 1, Color.GREEN));
        world.addDrawingObject(new Grass(0.09150805270863836, 0, 0.029282576866764276, 0.05673758865248227, Color.GREEN));
        world.addDrawingObject(new Сheburashka(0, 0, 0, 0, new Color(0x522E0F)));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        this.world.draw(gr, this.getWidth(), getHeight());
    }
}
