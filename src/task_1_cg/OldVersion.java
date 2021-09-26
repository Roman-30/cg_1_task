package task_1_cg;

public class OldVersion {
    /*public static void drawField(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x08E0F3));
        g.fillRect(0, 0, width, height);

        g.setColor(c.darker());
        g.setStroke(new BasicStroke(5));
        g.drawOval(-(width / height + 50), (int) (height / 1.5), width + 100, height);
        g.setColor(c);
        g.fillOval(-(width / height + 50), (int) (height / 1.5), width + 100, height);
        g.setColor(oldColor);
    }

    public static void drawFeet(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setColor(c.darker());
        g.setStroke(new BasicStroke(10));

        int y = (height / 2 - 70) + (width / 5 + 2) - 19;
        int x = width / 2 - ((height / 4 - 5) / 2);

        g.fillArc(x + 7, y, width / 26, height / 17, 0, 180);
        g.fillArc(x + 107, y, width / 26, height / 17, 0, 180);

        g.setStroke(oldStr);

        g.setColor(oldColor);
    }

    public static void drawHead(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setColor(c.darker());
        g.setStroke(new BasicStroke(10));
        g.drawOval((width / 2) - height / 5 + 6, (height / 2) - height / 3, (int) (width / 5.13) + 4, height / 3 - 20);
        g.drawOval((width / 2) - height / 5 + 26, (height / 2) - height / 3 + 20, (int) (width / 5.13) - 35, height / 3 - 60);
        g.setStroke(oldStr);
        g.fillOval((width / 2) - height / 5 + 6, (height / 2) - height / 3, (int) (width / 5.13) + 4, height / 3 - 20);
        g.setColor(Color.WHITE.darker());
        g.fillOval((width / 2) - height / 5 + 26, (height / 2) - height / 3 + 20, (int) (width / 5.13) - 35, height / 3 - 60);
        g.setColor(oldColor);
    }

    public static void printD(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c.darker());
        g.fillOval((width / 2) - height / 2 + 45, (height / 2) - height / 3, (int) (width / 6), height / 3 + 10);
        g.fillOval((width / 2) - height / 2 + 425, (height / 2) - height / 3, (int) (width / 6), height / 3 + 10);
        g.setColor(Color.WHITE.darker());
        g.fillOval((width / 2) - height / 2 + 65, (height / 2) - height / 3 + 30, (int) (width / 6) - 35, height / 3 - 45);
        g.fillOval((width / 2) - height / 2 + 440, (height / 2) - height / 3 + 30, (int) (width / 6) - 35, height / 3 - 45);
    }

    public static void printFace(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c.darker());
        g.drawOval(width / 2 - 70, height / 4 + 20, width / 35, width / 35);
        g.drawOval(width / 2 + 45, height / 4 + 20, width / 35, width / 35);
        g.setColor(Color.WHITE);
        g.drawOval(width / 2 - 70, height / 4 + 20, width / 35, width / 35);
        g.drawOval(width / 2 + 45, height / 4 + 20, width / 35, width / 35);

        g.setColor(Color.BLACK);

        g.fillOval(width / 2 + 55, height / 4 + 28, width / 70, width / 70);
        g.fillOval(width / 2 - 60, height / 4 + 28, width / 70, width / 70);

        g.drawArc(width / 2 - 18, height / 3, width / 35, width / 35, 210, 120);


    }

    public static void drawHands(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c.darker());

        Ellipse2D right = new Ellipse2D.Double(575, -605, 170, 50);
        Ellipse2D left = new Ellipse2D.Double(-275, 685, 170, 50);
        AffineTransform at0 = AffineTransform.getTranslateInstance(0, 0);
        AffineTransform at1 = AffineTransform.getTranslateInstance(0, 0);
        at0.rotate(Math.toRadians(70));
        at1.rotate(Math.toRadians(-70));
        g.fill(at0.createTransformedShape(right));
        g.fill(at1.createTransformedShape(left));


    }

    public static void drawD(Graphics2D g, int width, int height, Color c) {
        Color oldColor = g.getColor();
        BasicStroke oldStr = (BasicStroke) g.getStroke();
        g.setColor(c.darker());
        g.setStroke(new BasicStroke(5));

        g.drawOval(width / 2 - ((height / 4 - 5) / 2), height / 2 - 70, height / 4 - 5, width / 5 + 2);
        g.drawOval(width / 2 - ((height / 4 - 5) / 2) / 2, (height / 2 - 70), (height / 4 - 5) / 2, (int) ((width / 5 + 2) / 1.5));
        g.setColor(c);
        g.fillOval(width / 2 - ((height / 4 - 5) / 2), height / 2 - 70, height / 4 - 5, width / 5 + 2);

        g.setColor(Color.WHITE.darker());

        g.fillOval(width / 2 - ((height / 4 - 5) / 2) / 2, (height / 2 - 70), (height / 4 - 5) / 2, (int) ((width / 5 + 2) / 1.5));


        g.setStroke(oldStr);
        g.setColor(oldColor);
    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = x + r * Math.cos(a);
            double y1 = y + r * Math.sin(a);
            double x2 = x + (r + l) * Math.cos(a);
            double y2 = y + (r + l) * Math.sin(a);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
        g.setColor(oldColor);
    }

    //public static Random random = new Random();
                  */


    //drawField(gr, getWidth(), getHeight(), Color.GREEN);
    //drawFeet(gr, getWidth(), getHeight(), new Color(0x522E0F));
    //drawHands(gr, getWidth(), getHeight(), new Color(0x522E0F));
    //drawD(gr, getWidth(), getHeight(), new Color(0x522E0F));
    //printD(gr, getWidth(), getHeight(), new Color(0x522E0F));
    //drawHead(gr, getWidth(), getHeight(), new Color(0x522E0F));
    //printFace(gr, getWidth(), getHeight(), new Color(0x522E0F));
}
