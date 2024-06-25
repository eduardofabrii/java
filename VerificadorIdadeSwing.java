import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VerificadorIdadeSwing {
    private JTextField textoAno;
    private JButton botaoCalcular;
    private JLabel idadeResult;
    private JLabel situacaoResult;
    private JPanel painel;

    public VerificadorIdadeSwing() {
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNascimento = Integer.parseInt(textoAno.getText());
                int idade = 2024 - anoNascimento;
                String situacao = ((idade>=16 && idade<=18) || (idade>70))?"Voto Opcional":"Voto Não Opcional";

                idadeResult.setText(Integer.toString(idade));
                situacaoResult.setText(situacao);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Verificador de idade");
        frame.setContentPane(new VerificadorIdadeSwing().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
