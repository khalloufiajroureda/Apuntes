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




    
















}
