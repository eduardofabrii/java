import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Aprendendo {

    static int somar(int a, int b) {
        int s = a + b;
        return s;
    }

    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        int chamandoFuncao = somar(2, 3);
        System.out.println(chamandoFuncao);

        String chamar = contador(1, 5);
        System.out.println(chamar);

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
        System.out.println(r);

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
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            default:
                tipo = "Louco.";

        }
        System.out.println(tipo); */

        /*
        int contador = 0;

        while (contador < 10) {
            contador++;
            if (contador == 6) {
                break;
            }
            System.out.println("Cambalhota | Número " + contador);

        for (int contador=1; contador<=101; contador+=10) {
            System.out.println(contador);
        }

        int n[] = {9, 2, 3, 6, 10};

        System.out.println("Total de casas de N " + n.length);
        for (int c=0; c<=n.length; c++) {
            System.out.println("Na posição "+ (c+1) + " temos o valor " + n[c]);
        }


        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
                "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        int diaAno[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int c = 0; c < mes.length; c++) {
            System.out.println("O mês de " + mes[c] + " tem " +
                    diaAno[c] + " dias ao todo.");
        }

        int n[] = {1, 3, 6, 2, 9, 8};

        for (int valor: n) {
            System.out.print(valor + " ");
        }

        int pos = Arrays.binarySearch(n, 6);
        System.out.println("Encontrei o valor na posição " + pos);

        int v[] = new int[20];
        Arrays.fill(v, 0);

        for (int valor: v) {
            System.out.print(valor + " ");
        }
        */

        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
