package taller_abstractas_interfaces.ejercicio3;

public class Mp4 extends Reproductor {
    String creador;
    String tipovideo;

    public Mp4(int minutos, float tamaño, String creador, String tipoVenta) {
        super();
        this.minutos = minutos;
        this.tamaño = tamaño;
        this.creador = creador;
        this.tipovideo = tipoVenta;

    }

    @Override
    public void reproducir() {
        System.out.println("Se esta reproduciondo un Mp4");

    }
}
