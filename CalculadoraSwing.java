import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.*;

public class CalculadoraSwing {
    private JPanel painelMain;
    private JButton calcularButton;
    private JSpinner spinnerValue;
    private JLabel imgCalc;
    private JLabel resultDivision;
    private JLabel resultCube;
    private JLabel resultRaiz;
    private JLabel resultRaizC;
    private JLabel resultValueAbs;
    private JPanel painel;
    private JPanel painelResults;
    private JPanel fromValue;

    public CalculadoraSwing() {
        painelResults.setVisible(false);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelResults.setVisible(true);
                int value = (int) spinnerValue.getValue();

                float resto = (float) value % 2;
                resultDivision.setText(String.valueOf(resto));

                float cube = (float) pow(value, 3);
                resultCube.setText(String.valueOf(cube));

                float raizQ = (float) sqrt(value);
                resultRaiz.setText(String.format("%.2f", raizQ));

                float raizC = (float) cbrt(value);
                resultRaizC.setText(String.format("%.2f", raizC));

                float absoluteValue = (float) abs(value);
                resultValueAbs.setText(String.valueOf(absoluteValue));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new CalculadoraSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
