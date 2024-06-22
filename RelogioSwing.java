import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class RelogioSwing {

    private JPanel panelPrincipal;
    private JLabel imagemCalendario;
    private JButton horaBotao;
    private JLabel labelHora;
    private JPanel painelResponsivo;

    public RelogioSwing() {
        horaBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                labelHora.setText(relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relógio Swing");
        frame.setContentPane(new RelogioSwing().painelResponsivo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
