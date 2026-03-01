package Programacion.UD5.PT5Tarea;

import java.util.ArrayList;

/**
 * Clase Zoologico.
 * Se encarga de gestionar la lista de animales.
 */
public class Zoologico {

    private ArrayList<Animal> animales;

    /**
     * Constructor de la clase.
     * @param animales Lista de animales que tendrá el zoológico.
     */
    public Zoologico(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    /**
     * Devuelve la lista de animales.
     * @return Lista de animales.
     */
    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    /**
     * Modifica la lista de animales.
     * @param animales Nueva lista de animales.
     */
    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    /**
     * Muestra todos los animales del zoológico.
     * @return Texto con los animales o mensaje si no hay.
     */
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

    /**
     * Busca un animal por su código.
     * 
     * @param codigo Código del animal.
     * @return Mensaje con el animal encontrado o aviso si no existe.
     */
    public String buscarAnimal(String codigo) {
        String animalEncontrado = "Animal no encontrado";
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo().equals(String.valueOf(codigo))) {
                animalEncontrado = "Animal encontrado: \n" + animales.get(i);
            }
        }
        return animalEncontrado;
    }

    /**
     * Agrega ejemplares a un animal.
     * 
     * @param codigo   Código del animal.
     * @param cantidad Cantidad a añadir.
     * @return Mensaje indicando el resultado.
     */
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

    /**
     * Retira ejemplares de un animal.
     * 
     * @param codigo   Código del animal.
     * @param cantidad Cantidad a retirar.
     * @return Mensaje indicando el resultado.
     */
    public String retirarEjemplares(String codigo, int cantidad) {
        String mensaje = "Animal no encontrado";
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo().equals(codigo)) {
                if (animales.get(i).getCantidad() >= cantidad) {
                    animales.get(i).setCantidad(animales.get(i).getCantidad() - cantidad);
                    mensaje = "Ejemplares retirados correctamente";
                } else {
                    mensaje = "No se puede retirar más ejemplares de los disponibles.";
                }
            }
        }
        return mensaje;
    }

    /**
     * Elimina un animal del zoológico por su código.
     * 
     * @param codigo Código del animal.
     * @return Mensaje indicando el resultado.
     */
    public String eliminarAnimal(String codigo) {
        String mensaje = "Animal no encontrado";
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getCodigo().equals(codigo)) {
                animales.remove(i);
                mensaje = "Animal eliminado correctamente";
            }
        }
        return mensaje;
    }
}
