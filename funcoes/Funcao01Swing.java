package funcoes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Funcao01Swing {
    private JSpinner txtNum;
    private JButton button1;
    private JLabel txtFormula;
    private JLabel txtResultado;
    private JPanel painel;

    public static class Fatorial {
        private int num = 0;
        private int fat = 1;
        private String formula = "";

        public void setValor(int n) {
            num = n;
            int f = 1;
            String s = " ";
            for (int c = n; c > 1; c--) {
                f *= c;
                s += c + " x ";
            }
            s += "1 = ";
            fat = f;
            formula = s;
        }

        public int getFatorial() {
            return fat;
        }

        public String getFormula() {
            return formula;
        }
    }

    public Funcao01Swing() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getValue().toString());
                Fatorial f = new Fatorial();
                f.setValor(n);
                txtFormula.setText(f.getFormula());
                txtResultado.setText(Integer.toString(f.getFatorial()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste de Função");
        frame.setContentPane(new Funcao01Swing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
    }
}

