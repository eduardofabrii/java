import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomandoValores {
    private JButton verificar;
    private JTextField textoValorUm;
    private JTextField textoValorDois;
    private JLabel resultado;
    private JPanel painel;

    public SomandoValores() {
        verificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(textoValorUm.getText());
                int valor2 = Integer.parseInt(textoValorDois.getText());
                int soma = valor1 + valor2;
                resultado.setText(Integer.toString(soma));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane((new SomandoValores()).painel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }

}
