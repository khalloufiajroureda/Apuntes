public class Asistente extends Empleado{
    private int horasExtras;

    public Asistente(String nombre, double sueldoBase, int horasExtras) {
        super(nombre, sueldoBase);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() + horasExtras;
    }
}
