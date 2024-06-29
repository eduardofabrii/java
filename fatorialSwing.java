import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class fatorialSwing {
    private JPanel panel1;
    private JSpinner spinnerValue;
    private JPanel painel;
    private JLabel labelResultado;

    public fatorialSwing() {
        spinnerValue.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = (int) spinnerValue.getValue();
                int fatorial = 1;
                int contador = value;

                while (contador >= 1) {
                    fatorial *= contador;
                    contador--;
                    System.out.println(contador+1);
                }


                labelResultado.setText(Integer.toString(fatorial));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fatorial");
        frame.setContentPane(new fatorialSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setResizable(false);
    }
}