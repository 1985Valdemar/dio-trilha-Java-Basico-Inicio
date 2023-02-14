import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhite {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "adicionado no carrinhho");
            mesada = mesada - valorDoce;

            /*
             * nao se preocupe quanto a formatação de valores
             * iremos explorar os recursos de formatação em breve!!
             */

        }

        System.out.println("mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);

    }
}
