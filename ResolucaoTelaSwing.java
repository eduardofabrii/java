import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResolucaoTelaSwing {
    private JPanel painel;
    private JPanel painelPrincipal;
    private JLabel imgMonitor;
    private JLabel lblMsg;
    private JButton mostrarResoluçãoButton;

    public ResolucaoTelaSwing() {
        mostrarResoluçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit resolucao = Toolkit.getDefaultToolkit();
                Dimension dimensao = resolucao.getScreenSize();

                lblMsg.setText(dimensao.width + "x" + dimensao.height);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Resolução");
        frame.setContentPane(new ResolucaoTelaSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
