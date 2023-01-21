import java.util.Date;

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
    }

    public static void (String[] args) {
        

    }

}
