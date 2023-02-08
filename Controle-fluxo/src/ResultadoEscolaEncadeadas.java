// CONDICIONAL COMPOSTA MAIS DE UMA VARIAVEL
// CONDICIONAL ENCADEADA (else if) FICA ABAIXO DO SE (if) 

public class ResultadoEscolaEncadeadas {
    public static void main(String[] args) {
        double nota = 7.1;

        // SE NOTA MAIOR QUE 7
        if (nota >= 7)
            System.out.println("APROVADO");

        // FUNÇÃO ENCADEADA ABAIXO
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova Recuperação");

        // SE NÃO NOTA MENOR QUE 7
        else
            System.out.println("REPROVADO");

    }

}
