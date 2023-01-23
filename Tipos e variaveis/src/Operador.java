import java.util.Date;

import javax.imageio.ImageTranscoder;

public class Operador {
    public static void main(String[] args) {

        String nomeCompleto = "LINGUAGEM" + "JAVA"; // + = Concatenacao de texto

        System.out.println(nomeCompleto);

        // Atribuicao e suas regras ABAIXO

        String nome = "VALDEMAR"; // sempre entre aspas
        System.out.println(nome);

        int idade = 22; // valor literal inteiro sem ponto
        System.out.println(idade);

        double peso = 68.5; // valor quebrado com PONTO convencao amaericana
        System.out.println(peso);

        char sexo = 'M'; // caracter aspas simples para definir valor
        System.out.println(sexo);

        boolean doadorOrgao = false; // valor false ou true
        System.out.println(doadorOrgao);

        Date dataNascimento = new Date(); // new atribuicao nova.
        System.out.println(dataNascimento);

        // classes Operadores.java
        double soma = 10.5 + 15.7;
        System.out.println(soma);

        int subtracao = 113 - 25;
        System.out.println(subtracao);

        int multiplicacao = 20 * 7;
        System.out.println(multiplicacao);

        int divisao = 15 / 3;
        System.out.println(divisao);

        int modulo = 18 % 3;
        System.out.println(modulo);

        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);

        // declementar
        int numero = 5;
        System.out.println(numero--);
        System.out.println(numero);

        // inclementar
        int numero1 = 5;
        System.out.println(numero1++);
        System.out.println(numero1);

        // Inverter variavel boleana
        boolean variavel = true;

        // inverter !
        variavel = !variavel;

        System.out.println(variavel);

        // operador ternario falso
        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado1);

        // operador ternario verdadeiro
        int a1, b1;
        a1 = 6;
        b1 = 6;

        String resultado2 = a1 == b1 ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        // metodo comparacao
        // operadores relacionais
        int numero2 = 1;
        int numero3 = 2;

        boolean simNao = numero2 == numero3;

        System.out.println("numeroDois e igual a numeroTreis?" + simNao);

        simNao = numero2 != numero3;

        System.out.println("numeroDois e diferente a numeroTreis?" + simNao);

        simNao = numero2 > numero3;

        System.out.println("numeroDois e maior que numeroTreis?" + simNao);

        // Comparacao nomes
        String nomeUm = "Valdemar";
        String nomeDois = "Valdemar";

        System.out.println(nomeUm == nomeDois);

    }

}
