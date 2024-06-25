import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Aprendendo {
    public static void main(String[] args) {
        /* int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média eh igual a " + media);

        int numero = 10;
        int valor = 4 + --numero;
        System.out.println(valor);

        int x = 4;
        x *= 2;
        System.out.println(x);

        float v = 8.49f;
        int arredondado = (int) Math.round(v);
        System.out.println(arredondado);

        double aleatorio = Math.random();
        int numero = (int) (950+ aleatorio * (1000-950));
        System.out.println(numero);

        Date relogio = new Date();
        System.out.println("A hora do sistema é " + relogio.toString());

        Locale lang = Locale.getDefault();
        System.out.println("A linguagem do sistema está em " + lang.getDisplayLanguage());

        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        System.out.println("A resolução da sua tela é " + dimensao.width + " x " + dimensao.height);

        int n1, n2, r;
        n1 = 15;
        n2 = 14;
        r = (n1>n2)?n1:n2;
        System.out.println(r);

        String nome1 = "gustavo";
        String nome2 = "gustavo";
        String nome3 = new String("gustavo");
        String resultado;
        resultado = (nome2.equals(nome3))?"iguais":"diferentes";
        System.out.println(resultado);

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r); */

        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();

        float media = (n1 + n2) / 2;

        System.out.println("Sua média foi "+ media);

        if (media>9) {
            System.out.println("Parabéns, sua média é maior que 9!");
        } else {
            System.out.println("Média menor que 9!");
        }



    }
}
