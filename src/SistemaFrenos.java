public class SistemaFrenos extends ComponenteVehicular {
    private boolean tieneABS;
    private String tipoDiscos;
    private double pesoChasis; 

    public SistemaFrenos(String codigo, String fabricante, boolean tieneABS, String tipoDiscos, double pesoChasis) {
        super(codigo, fabricante);
        this.tieneABS = tieneABS;
        this.tipoDiscos = tipoDiscos;
        this.pesoChasis = pesoChasis;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema ABS: " + (tieneABS ? "Sí" : "No"));
        System.out.println("Tipo de discos: " + tipoDiscos);
        System.out.println("Peso del chasis: " + pesoChasis + " kg");
        System.out.println("Carga máxima estimada: " + calcularCargaMaxima() + " kg");
    }

    public void verificarABS() {
        if (tieneABS) {
            System.out.println("Sistema ABS operativo.");
        } else {
            System.out.println("Este vehículo no tiene ABS.");
        }
    }

    // Método para calcular la carga máxima estimada
    public double calcularCargaMaxima() {
        // Ejemplo: la carga máxima es 1.5 veces el peso del chasis
        return pesoChasis * 1.5;
    }

    
    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    public String getTipoDiscos() {
        return tipoDiscos;
    }

    public void setTipoDiscos(String tipoDiscos) {
        this.tipoDiscos = tipoDiscos;
    }

    public double getPesoChasis() {
        return pesoChasis;
    }

    public void setPesoChasis(double pesoChasis) {
        this.pesoChasis = pesoChasis;
    }
}