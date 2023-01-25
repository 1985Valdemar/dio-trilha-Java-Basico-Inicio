public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        // Pode ser assim volume = volume + 1; ou abaixo
        volume++;

        System.out.println("Aumentando o volume para: " + volume);

    }

    public void diminuirVolume() {
        // Pode ser assim volume = volume - 1; ou abaixo
        volume--;
        System.out.println("Diminuido o volume para: " + volume);
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}