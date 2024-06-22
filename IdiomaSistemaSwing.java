import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class IdiomaSistemaSwing {
    private JPanel painel;
    private JPanel main;
    private JLabel imgWorld;
    private JLabel labelMsg;
    private JButton botaoMostrar;

    public IdiomaSistemaSwing() {
        botaoMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Locale lang = Locale.getDefault();

                labelMsg.setText("O idioma é " + lang.getDisplayLanguage());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mostrar Idioma");
        frame.setContentPane(new IdiomaSistemaSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
