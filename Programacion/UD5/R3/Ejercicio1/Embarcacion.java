public class Embarcacion {
    private static int numeroEmbarcaciones = 0;
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String nombre, double eslora, String tipo, String propietario, int anioFabricacion, double valorEstimado) {
        setMatricula();
        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        setAnioFabricacion(anioFabricacion);
        this.valorEstimado = valorEstimado;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula() {
        if (matricula == null || matricula.isBlank()) {
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
    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Velero") || tipo.equalsIgnoreCase("Lancha") || tipo.equalsIgnoreCase("Yate") || tipo.equalsIgnoreCase("Catamarán") || tipo.equalsIgnoreCase("Moto de agua")) {
            this.tipo = tipo;
        }
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

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion >= 1950 && anioFabricacion <= 2026) {
            this.anioFabricacion = anioFabricacion;
        }
    }

    @Override
    public String toString() {
        return nombre + ": Matricula --> " + matricula + " | Tamaño del barco --> " + eslora + "Kg | tipo --> " + tipo + " | propietario --> "
                + propietario + " |  Año de fabricacion --> " + anioFabricacion + " | Precio del Barco --> " + valorEstimado + "€";
    }

}
