package Sistema_Futbol;

import java.time.LocalDate;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected long dni;
    protected LocalDate fechaNacimiento;

    // Constructor
    public Persona(int id, String nombre, String apellido, int edad, long dni, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    // Método para verificar mayoría de edad
    public boolean comprobarMayorEdad(LocalDate fechaNacimiento) {
        boolean mayorEdad;
        LocalDate fechaActual = LocalDate.now();
        LocalDate calculoMayorEdad = fechaNacimiento.plusYears(18);

        if (calculoMayorEdad.isBefore(fechaActual)) {
            mayorEdad = true;
        } else {
            mayorEdad = false;
        }

        return mayorEdad;
    }

    // To String
    @Override
    public String toString() {
        return "\nPersona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni="
                + dni
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    // Hash y Equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (dni ^ (dni >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni != other.dni)
            return false;
        return true;
    }
}
