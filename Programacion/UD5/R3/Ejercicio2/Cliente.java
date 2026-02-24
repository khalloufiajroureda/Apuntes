package Programacion.UD5.R3.Ejercicio2;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    public String telefono;
    public String email;
    private String direccion;

    public Cliente(String nombre, String dni, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (!dni.isBlank() || dni != null ) {
            this.dni = dni;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  nombre + " con DNI: " + dni + ", Numero de telefono: " + telefono + ", Direccion de correo electronico: " + email
                + " y Direccion: " + direccion;
    }
    
}
