import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdivinharNumeroSwing {
    private JPanel jpanel;
    private JPanel mainPanel;
    private JSpinner spinnerValue;
    private JButton palpiteButton;
    private JPanel painel;
    private JLabel labelResultado;

    public AdivinharNumeroSwing() {
        palpiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomNumero = (int) (1 + Math.random() * (6-1));
                int numeroAdivinhado = (int) spinnerValue.getValue();

                String palpite;
                palpite = (randomNumero == numeroAdivinhado)?"Você acertou!":"Você errou, pensei no número " + randomNumero + ".";
                labelResultado.setText(palpite);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicativo de adivinhar.");
        frame.setContentPane(new AdivinharNumeroSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
