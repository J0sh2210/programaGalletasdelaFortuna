package galletasFortuna;

import javax.swing.*;

public class InterfaceGalletas {
    private JButton botton_cookie;
    private JPanel Principanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfaceGalletas");
        frame.setContentPane(new InterfaceGalletas().Principanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
