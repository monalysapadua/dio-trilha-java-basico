public class SmartTv {
    // atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void dimunuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
    }

    public void dimunuirCanal() {
        canal--;
    }

    public void mudarCanal(int novocanal) {
        canal = novocanal;
        System.out.println("Mundando o canal para: " + canal);
    }
}
