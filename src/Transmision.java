public class Transmision extends ComponenteVehicular {
    String tipo;
    int marchas;
    int marchaActual = 1; // Suponiendo que inicia en 1

    public Transmision(String codigo, String fabricante, String tipo, int marchas) {
        super(codigo, fabricante);
        this.tipo = tipo;
        this.marchas = marchas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de marchas: " + marchas);
        System.out.println("Marcha actual: " + marchaActual);
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha < 1 || nuevaMarcha > marchas) {
            System.out.println("Marcha inválida. Debe estar entre 1 y " + marchas + ".");
        } else if (nuevaMarcha == marchaActual) {
            System.out.println("Ya estás en la marcha " + nuevaMarcha + ".");
        } else {
            System.out.println("Cambiando de la marcha " + marchaActual + " a la marcha " + nuevaMarcha + "...");
            marchaActual = nuevaMarcha;
        }
    }
}