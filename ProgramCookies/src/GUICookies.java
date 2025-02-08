import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUICookies extends CookiesData{
    private JPanel PanelIni;
    private JLabel welcometext;
    private JLabel textedit;
    private JButton obténTuGalletaButton;

    public GUICookies() {
        obténTuGalletaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int indice = random.nextInt(Cookies.length);
            textedit.setText(Cookies[indice]);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUICookies");
        frame.setContentPane(new GUICookies().PanelIni);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
    }
}
