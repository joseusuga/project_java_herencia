public class Neumatico extends ComponenteVehicular {
    private static final double PRESION_MINIMA = 30.0;
    private static final double PRESION_MAXIMA = 35.0;

    int tamaño;
    double presion;

    public Neumatico(String codigo, String fabricante, int tamaño, double presion) {
        super(codigo, fabricante);
        this.tamaño = tamaño;
        this.presion = presion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + tamaño + " pulgadas");
        System.out.println("Presión: " + presion + " PSI");
    }

    public void verificarPresion() {
        if (presion >= PRESION_MINIMA && presion <= PRESION_MAXIMA) {
            System.out.println("Presión óptima.");
        } else if (presion < PRESION_MINIMA) {
            System.out.println("Presión baja (" + presion + " PSI). Debe estar entre " + PRESION_MINIMA + " y " + PRESION_MAXIMA + " PSI.");
        } else {
            System.out.println("Presión alta (" + presion + " PSI). Debe estar entre " + PRESION_MINIMA + " y " + PRESION_MAXIMA + " PSI.");
        }
    }
}