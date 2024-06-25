import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotacaoSwing {
    private JTextField textoAno;
    private JButton botaoVoto;
    private JLabel labelResultado;
    private JPanel painel;
    private JLabel labelIdade;

    public VotacaoSwing() {
        botaoVoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano_nascimento = Integer.parseInt(textoAno.getText());
                int calculo_idade = 2024 - ano_nascimento;

                labelIdade.setText(Integer.toString(calculo_idade));

                if (calculo_idade < 16) {
                    labelResultado.setText("Não vota!");
                } else if (((calculo_idade >= 16 && calculo_idade < 18) || (calculo_idade > 70))) {
                    labelResultado.setText("Voto Opcional!");
                } else {
                    labelResultado.setText("Voto Obrigatório!");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Votação");
        frame.setContentPane(new VotacaoSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
