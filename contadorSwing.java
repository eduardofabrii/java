import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contadorSwing {
    private JPanel panel1;
    private JButton contarButton;
    private JPanel painel;
    private JLabel resultadoCont;

    public contadorSwing() {
        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador = 1;
                String contagem = "";
                while (contador < 6) {
                    ;
                    contagem += contador + " ";
                    contador++;
                }
                resultadoCont.setText(contagem);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Contador");
        frame.setContentPane(new contadorSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
