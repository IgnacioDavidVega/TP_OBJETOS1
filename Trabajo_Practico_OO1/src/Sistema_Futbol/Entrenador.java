package Sistema_Futbol;

import java.time.LocalDate;

public class Entrenador extends Persona {
	private String estrategiaFavorita;

	// Constructor
	public Entrenador(int id, String nombre, String apellido, int edad, long dni, LocalDate fechaNacimiento,
			String estrategiaFavorita) {
		super(id, nombre, apellido, edad, dni, fechaNacimiento);
		this.estrategiaFavorita = estrategiaFavorita;
	}

	// Getters and Setters
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
}
