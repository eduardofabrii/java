import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class triangulosSwing {
    private JPanel painelMain;
    private JSlider sliderA;
    private JSlider sliderB;
    private JSlider sliderC;
    private JButton verificarButton;
    private JLabel labelA;
    private JLabel labelB;
    private JLabel labelC;
    private JPanel painelRespostas;
    private JLabel labelStatus;
    private JLabel labelTipo;
    private JPanel painel;

    public triangulosSwing() {
        painelRespostas.setVisible(false);
        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painelRespostas.setVisible(true);

                int a = sliderA.getValue();
                int b = sliderB.getValue();
                int c = sliderC.getValue();

                if (a < b+c && b < a+c && c < a+b) {
                    labelStatus.setText("Formam um triângulo!");
                    if (a == b && b == c) {
                        labelTipo.setText("Equilatero");
                    } else if (a != b && b != c && a != c) {
                        labelTipo.setText("Escaleno");
                    } else {
                        labelTipo.setText("Isosceles");
                    }
                } else {
                    labelStatus.setText("Não formam um triângulo!");
                    labelTipo.setText("----");
                }

            }
        });
        sliderA.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelA.setText(Integer.toString(sliderA.getValue()));
            }
        });
        sliderB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelB.setText(Integer.toString(sliderB.getValue()));
            }
        });
        sliderC.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelC.setText(Integer.toString(sliderC.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triângulos");
        frame.setContentPane(new triangulosSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 450);
        frame.setResizable(false);
    }
}
