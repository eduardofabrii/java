import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpAritmeticos {
    private JPanel painel;
    private JPanel testeOperadores;
    private JTextField denomUm;
    private JTextField numeraUm;
    private JButton botaoDivisor;
    private JLabel divisaoRes;
    private JLabel resultadoRaiz;
    private JLabel printDivisao;
    private JLabel printRaiz;


    public OpAritmeticos() {
        botaoDivisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(numeraUm.getText());
                int valor2 = Integer.parseInt(denomUm.getText());

                int divisao = valor1 / valor2;
                float resultado = (float) Math.sqrt(valor1);

                divisaoRes.setText(Float.toString(divisao));
                resultadoRaiz.setText(Float.toString(resultado));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("testeOperadores");
        frame.setContentPane((new OpAritmeticos()).testeOperadores);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
