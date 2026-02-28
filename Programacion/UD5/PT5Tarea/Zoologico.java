package Programacion.UD5.PT5Tarea;

import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animales;

    public Zoologico(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public String mostrarAnimales() {
        String mostrarAnimal = "";
        if (animales.size() > 0) {
            for (int i = 0; i < animales.size(); i++) {
                mostrarAnimal += animales.get(i);
            }
        } else {
            mostrarAnimal = "NO hay animales";
        }
        return mostrarAnimal;
    }

    public String buscarAnimal(String codigo) {
        String animalEncontrado = "Animal no encontrado";
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo().equals(String.valueOf(codigo))) {
                animalEncontrado = "Animal encontrado: \n" + animales.get(i);
            }
        }
        return animalEncontrado;
    }

    public String agregarEjemplares(String codigo, int cantidad) {
        String mensaje = "Animal no encontrado";
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo().equals(codigo)) {
                animales.get(i).setCantidad(animales.get(i).getCantidad() + cantidad);
                mensaje = "Ejemplares agregados correctamente";
            }
        }
        return mensaje;
    }




















}
