package taller_abstractas_interfaces.ejercicio3;

public class Wav extends Reproductor {

    public Wav() {
        super();
    }

    @Override
    public void reproducir() {
        System.out.println("Esta reproduciondo el Wav");
    }

}