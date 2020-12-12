package flappyBird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    private static final long serialVersionUID = 1L;

    //Hàm công cụ để vẽ các độ họa
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
