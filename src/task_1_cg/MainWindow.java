package task_1_cg;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException {
        this.setBounds(0, 0, 1386, 788);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        //this.setResizable(false);

        DrawPanel dp = new DrawPanel();
        this.add(dp);
    }
}
