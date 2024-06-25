import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParOuImparSwing {
    private JButton verificarButton;
    private JPanel panel1;
    private JTextArea caixaValor;
    private JLabel resultado;
    private JPanel painel;

    public ParOuImparSwing() {
        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(caixaValor.getText());

                if (value%2 == 0) {
                    resultado.setText("O número é par.");
                } else {
                    resultado.setText("O número é impar.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Verificar Números");
        frame.setContentPane(new ParOuImparSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
