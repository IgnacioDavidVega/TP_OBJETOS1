package Sistema_Futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private int id;
    private String nombre;
    private String apellido;
    private long dni;
    private LocalDate fechaNacimiento;
    private String estrategiaFavorita;
    
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
	
	/* MÉTODOS QUE HAY QUE AGREGAR A LA CLASE SISTEMA


	public boolean agregarEntrenador(String nombre, String apellido, long dni, LocalDate fechaNacimiento,
			String estrategiaFavorita) throws Exception {
		if (traerEntrenador(dni) != null) {
			throw new Exception("Error al ingresar entrenador: el entrenador ya existe en el catalogo");
		}
		int id = 1;
		if (listadoEntrenadores.size() > 0) {
			id = listadoEntrenadores.get(listadoEntrenadores.size() - 1).getId() + 1;
		}
		return listadoEntrenadores.add(new Entrenador(id, nombre, apellido, dni, fechaNacimiento, estrategiaFavorita));
	}

	
	public boolean eliminarEntrenador(int idEntrenador) throws Exception{
		if (traerEntrenador(idEntrenador) == null) {
			throw new Exception("Error al eliminar entrenador: el entrenador no existe.");
		}
		System.out.println("Entrenador eliminado con exito.");
		return listadoEntrenadores.remove(traerEntrenador(idEntrenador));
	}
	
	public Entrenador traerEntrenador(int id) {
		Entrenador retornoEntrenador = null;
		
		int i = 0;
		
		while (i < listadoEntrenadores.size() && retornoEntrenador == null) {
			if (listadoEntrenadores.get(i).getId() == idEntrenador) {
				retornoEntrenador = listadoEntrenadores.get(i);
			}
			i++;
		}
		return retornoEntrenador;
	}
	
	public Entrenador traerEntrenador(long dni) {
		Entrenador retornoEntrenador = null;
		
		int i = 0;
		
		while (i < listadoEntrenadores.size() && retornoEntrenador == null) {
			if (listadoEntrenadores.get(i).getDni() == dni) {
				retornoEntrenador = listadoEntrenadores.get(i);
			}
			i++;
		}
		return retornoEntrenador;
	}
	
	public List<Entrenador> traerEntrenadores(String estrategiaFavorita) {
		List<Entrenador> entrenadoresFiltrados = new ArrayList<>();
		
		for (Entrenador e : listadoEntrenadores) {
			if (e.getEstrategiaFavorita().equals(estrategiaFavorita)) {
				entrenadoresFiltrados.add(e);
				e.toString();
			}
		}
		return entrenadoresFiltrados;
	}
	
	*/
}
