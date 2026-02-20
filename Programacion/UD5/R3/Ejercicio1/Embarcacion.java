public class Embarcacion {
    private static int numeroEmbarcaciones = 0;
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario, int anioFabricacion, double valorEstimado) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula() {
        if (matricula != null || !matricula.isEmpty()) {
            this.matricula = "EM-" + numeroEmbarcaciones;
            numeroEmbarcaciones++;
        }
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora(){
        return eslora;
    }
    public boolean setEslora(double eslora) {
        boolean menor = false;
        if (eslora > 0) {
            this.eslora = eslora;
            menor = true;
        }
        return menor;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean setTipo(String tipo) {
        boolean noEsTipoValido = false;
        if (tipo == "Velero" || tipo == "Lancha" || tipo == "Yate" || tipo == "Catamarán" || tipo == "Moto de agua") {
            this.tipo = tipo;
            noEsTipoValido = true;
        }
        return noEsTipoValido;
    }

    public String getPropietario(){
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnioFabricacion(){
        return anioFabricacion;
    }

    public boolean setAnioFabricacion(int anioFabricacion) {
        boolean añoNoValido = false;
        if (anioFabricacion >= 1950 && anioFabricacion <= 2026) {
            this.anioFabricacion = anioFabricacion;
            añoNoValido = true;
        }
        return añoNoValido;
    }

    @Override
    public String toString() {
        return nombre + " | Tamaño del barco --> " + eslora + "Kg | tipo --> " + tipo + " | propietario --> "
                + propietario + " |  Año de fabricacion --> " + anioFabricacion + " | Precio del Barco --> " + valorEstimado + "€";
    }

}
