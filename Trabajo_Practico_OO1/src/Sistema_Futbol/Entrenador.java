package Sistema_Futbol;

import java.time.LocalDate;
//import java.util.ArrayList; No creo que sea necesario en la clase entrenador
//import java.util.List; No creo que sea necesario en la clase entrenador

public class Entrenador {
	private int id;
	private String nombre;
	private String apellido;
	private long dni;
	private LocalDate fechaNacimiento;
	private String estrategiaFavorita;

	// Constructor
	public Entrenador(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento,
			String estrategiaFavorita) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.estrategiaFavorita = estrategiaFavorita;
	}

	// Getters and Setters
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

	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}

	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}

	// To String
	@Override
	public String toString() {
		return "Entrenador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + ", estrategiaFavorita=" + estrategiaFavorita + "]";
	}

	// Hash and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Entrenador other = (Entrenador) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
