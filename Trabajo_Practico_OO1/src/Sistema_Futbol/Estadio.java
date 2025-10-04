package Sistema_Futbol;

public class Estadio {
	private int id;
	private String nombre;
	private String ubicacion;

	public Estadio(int id, String nombre, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	// toString
	@Override
	public String toString() {
		return "\nEstadio [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}

	// Hash y equals solo para id
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estadio other = (Estadio) obj;
		return id == other.id;
	}
}
