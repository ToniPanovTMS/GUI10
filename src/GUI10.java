import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class GUI10 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("кино");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - 100 / 2, dim.height / 2 - 100 / 2, 100, 100);
        JPanel panel = new JPanel();
        panel.setFocusable(true);
        frame.add(panel);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                int key = e.getKeyChar();
                if (key == 32) {
                    JOptionPane.showMessageDialog(null, "Toni");
                }
            }
        });
        frame.setVisible(true);

    }
}
