package task_1_cg.objects.cartoon_hero;

import task_1_cg.objects.DrawingObject;

import java.awt.*;
import java.util.ArrayList;

public class Сheburashka extends DrawingObject {
    private final ArrayList<DrawingObject> drawingObjects = new ArrayList<DrawingObject>();

    public Сheburashka(double constX, double constY, double constWidth, double constHeight, Color color) {
        super(constX, constY, constWidth, constHeight, color);

        drawingObjects.add(new Feet(0.4425329428989751, 0.7631205673758865, 0.5157393850658858, 1, this.color));
        drawingObjects.add(new Hands(0.42003703, -0.856156, 0.12445095, 0.07092199, this.color));
        drawingObjects.add(new Body(0.43777454, 0.4, 0.24255319, 0.20131771, this.color));
        drawingObjects.add(new Ears(0.27855051244509516, 0.16595744680851063, 0.5530746705710102, 0.3475177304964539, this.color));
        drawingObjects.add(new Head(0.4011713030746706, 0.16595744680851063, 0.383371351941714, 0.15739385065885797, this.color));
        drawingObjects.add(new Face(0.44875549048316254, 0.27801418439716313, 0.5329428989751098, 0.5402635431918009, this.color));
    }

    @Override
    public void draw(Graphics2D g, int width, int height) {
        for (DrawingObject drawingObject : drawingObjects) {
            drawingObject.draw(g, width, height);
        }
    }
}
