//Definicion de la clase Jugador

package Sistema_Futbol;

// Importaciones de librerias
import java.time.LocalDate;

// Clase Jugador
public class Jugador {

    private int id;
    private String nombre;
    private String apellido;
    private long dni;
    private LocalDate fechaNacimiento;
    private float estatura;
    private float peso;
    private String posicion;
    private int dorsal;

    // Constructor de la clase Jugador
    public Jugador(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento, float estatura,
            float peso, String posicion, int dorsal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    // Implementacion de Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    // To string
    @Override
    public String toString() {
        return "\n Jugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
                + ", fechaNacimiento=" + fechaNacimiento + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
                + posicion + ", dorsal=" + dorsal + "]";
    }
}
