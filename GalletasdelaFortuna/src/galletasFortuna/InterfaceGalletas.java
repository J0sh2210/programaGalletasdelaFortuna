package galletasFortuna;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class InterfaceGalletas extends ListGalletas {
    private JButton botton_cookie;
    private JPanel Principanel;
    private JLabel label_welcome;
    private JLabel label_edit;

    public InterfaceGalletas() {
        botton_cookie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int indice = random.nextInt(Cookies.length);
                label_edit.setText(Cookies[indice]);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("InterfaceGalletas");
        frame.setContentPane(new InterfaceGalletas().Principanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
