import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BhaskaraSwing {
    private JSpinner spinnerA;
    private JSpinner spinnerB;
    private JSpinner spinnerC;
    private JButton calcularBhaskaraButton;
    private JPanel painel;
    private JLabel labelResultado;
    private JLabel labelB;
    private JLabel labelA;
    private JLabel labelC;
    private JPanel painelRes;
    private JLabel labelTiposRaiz;


    public BhaskaraSwing() {
        painelRes.setVisible(false);
        calcularBhaskaraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelRes.setVisible(true);
                int numeroA = (int) spinnerA.getValue();
                int numeroB = (int) spinnerB.getValue();
                int numeroC = (int) spinnerC.getValue();

                int delta;
                delta = (int) Math.pow(numeroB, 2) - 4*numeroA*numeroC;
                labelResultado.setText(Integer.toString(delta));

                if (delta<0) {
                    labelTiposRaiz.setText("Não existem Raízes Reais.");
                } else {
                    labelTiposRaiz.setText("Existem Raízes Reais.");
                }
            }
        });
        spinnerA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelA.setText(spinnerA.getValue().toString());
            }
        });
        spinnerB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelB.setText(spinnerB.getValue().toString());
            }
        });
        spinnerC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelC.setText(spinnerC.getValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bhaskara");
        frame.setContentPane(new BhaskaraSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 250);
    }
}
