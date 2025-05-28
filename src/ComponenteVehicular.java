public class ComponenteVehicular {
    private String codigo;
    private String fabricante;

    public ComponenteVehicular(String codigo, String fabricante) {
        this.codigo = codigo;
        this.fabricante = fabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Fabricante: " + fabricante);
    }
}
