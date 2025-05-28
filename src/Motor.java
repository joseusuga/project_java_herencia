public class Motor extends ComponenteVehicular {
    private int cilindros;
    private int potencia;

    public Motor(String codigo, String fabricante, int cilindros, int potencia) {
        super(codigo, fabricante);
        if (cilindros <= 0 || potencia <= 0) {
            throw new IllegalArgumentException("Cilindros y potencia deben ser mayores que cero.");
        }
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindros: " + cilindros);
        System.out.println("Potencia: " + potencia + " HP");
    }

    public void encenderMotor() {
        System.out.println("El motor ha sido encendido: " + potencia + " HP y " + cilindros + " cilindros.");
    }
}