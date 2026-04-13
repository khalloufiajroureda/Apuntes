package Programacion.UD6.AgrupacionMusical;

import java.util.ArrayList;

public class Director extends PersonaAgrupacion implements GestionHumana {
    private String especialidad;
    private int maximoMusicos;
    private ArrayList<PersonaAgrupacion> musicosAsignados;
    private double plusDireccion;

    public Director(String nombre, int edad, int antiguedad, String especialidad, int maximoMusicos, double plusDireccion) {
        super(nombre, edad, antiguedad);
        this.especialidad = especialidad;
        this.maximoMusicos = maximoMusicos;
        this.plusDireccion = plusDireccion;
        this.musicosAsignados = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMaximoMusicos() {
        return maximoMusicos;
    }

    public void setMaximoMusicos(int maximoMusicos) {
        this.maximoMusicos = maximoMusicos;
    }

    public ArrayList<PersonaAgrupacion> getMusicosAsignados() {
        return musicosAsignados;
    }

    public void setMusicosAsignados(ArrayList<PersonaAgrupacion> musicosAsignados) {
        this.musicosAsignados = musicosAsignados;
    }

    public double getPlusDireccion() {
        return plusDireccion;
    }

    public void setPlusDireccion(double plusDireccion) {
        this.plusDireccion = plusDireccion;
    }

    @Override
    public double calcularAportacion() {
        return getAntiguedad() * 10 + plusDireccion + (musicosAsignados.size() * 5);
    }

    @Override
    public boolean puedeParticipar() {
        return getEdad() >= 18;
    }

    @Override
    public boolean asignarMusico(PersonaAgrupacion persona) {

        if (persona == null) return false;
        for (PersonaAgrupacion p : musicosAsignados) {
            if (p.getNombre().equals(persona.getNombre())) {
                return false;
            }
        }

        if (musicosAsignados.size() >= maximoMusicos) {
            return false;
        }

        musicosAsignados.add(persona);
        return true;
    }

    @Override
    public boolean expulsarMusico(String nombre) {

        for (PersonaAgrupacion p : musicosAsignados) {
            if (p.getNombre().equals(nombre)) {
                musicosAsignados.remove(p);
                return true;
            }
        }

        return false;
    }

    public int contarMusicosAsignados() {
        return musicosAsignados.size();
    }

    public double calcularValorTotalAportacionMusicos() {
        double total = 0;

        for (PersonaAgrupacion p : musicosAsignados) {
            total += p.calcularAportacion();
        }

        return total;
    }
}
