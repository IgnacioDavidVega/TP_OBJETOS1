//Definicion de la clase Jugador

package Sistema_Futbol;

import java.time.LocalDate;

// Clase Jugador
public class Jugador extends Persona {
    private float estatura;
    private float peso;
    private String posicion;
    private int dorsal;

    // Constructor de la clase Jugador

    public Jugador(int id, String nombre, String apellido, int edad, long dni, LocalDate fechaNacimiento,
            float estatura, float peso, String posicion, int dorsal) {
        super(id, nombre, apellido, edad, dni, fechaNacimiento);
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    // Implementacion de Getters y Setters
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
        return "\nJugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni="
                + dni
                + ", fechaNacimiento=" + fechaNacimiento + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
                + posicion
                + ", dorsal=" + dorsal + "]";
    }

    // Hash y equals solo para dni
    @Override
    public int hashCode() {
        return Long.hashCode(dni);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        return dni == other.dni;
    }
}
