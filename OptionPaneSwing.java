import javax.swing.JOptionPane;

public class OptionPaneSwing {
    public static void main(String[] args) {
        int numero, soma = 0, contador = 0, pares = 0, impares = 0, maior100 = 0;
        double media = 0;

            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "<html>Informe um número: <br><em>(valor 0 interrompe)</em>.</html>"));

                soma += numero; // somatorio

                contador = contador + 1; // contador

                if (numero%2 == 0) {
                    pares++; // contador de pares
                }
                else {
                    impares++; // contador de impares
                }

                media = (double) soma / contador; // media

                if (numero > 100) {
                    maior100++; // contador numeros maiores que 100
                }
            }

            while (numero != 0); {
                JOptionPane.showMessageDialog(null, "<html>Resultado: <br><hr>" +
                        "Somátorio vale: " + soma + "<br>" +
                        "Total de valores: " + contador + "<br>" +
                        "Total de Pares: " + pares +"<br>" +
                        "Total de Ímpares: " + impares + "<br>" +
                        "Média dos valores: " + media + "<br>" +
                        "Ácima de 100: " + maior100);
            }
    }
}

