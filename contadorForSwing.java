import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

public class contadorForSwing {
    private JPanel panel1;
    private JButton botaoContar;
    private JSlider sliderStart;
    private JSlider sliderStop;
    private JSlider sliderRange;
    private JLabel resStart;
    private JLabel resStop;
    private JLabel resRange;
    private JPanel painel;
    private JList list;

    public contadorForSwing() {
        sliderStart.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valueStart = sliderStart.getValue();
                resStart.setText(Integer.toString(valueStart));
            }
        });
        sliderStop.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valueStop = sliderStop.getValue();
                resStop.setText(Integer.toString(valueStop));
            }
        });
        sliderRange.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valueRange = sliderRange.getValue();
                resRange.setText(Integer.toString(valueRange));
            }
        });
        botaoContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valueStart = sliderStart.getValue();
                int valueStop = sliderStop.getValue();
                int valueRange = sliderRange.getValue();

                DefaultListModel lista = new DefaultListModel();

                for (int c = valueStart;c <= valueStop;c += valueRange) {
                    lista.addElement(c);
                }

                list.setModel(lista);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Contador");
        frame.setContentPane(new contadorForSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
    }
}
