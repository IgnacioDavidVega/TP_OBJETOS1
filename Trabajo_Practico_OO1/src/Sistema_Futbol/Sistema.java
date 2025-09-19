package Sistema_Futbol;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Sistema {
	private List<Equipo> listadoEquipos;
	private List<Entrenador> listadoEntrenadores;
	private List<Jugador> listadoJugadores;
	private List<Torneo> listadoTorneos;
	private List<Partido> listadoPartidos;
	private List<Registro> listadoRegistros;
	
	public Sistema(List<Equipo> listadoEquipos, List<Entrenador> listadoEntrenadores, List<Jugador> listadoJugadores,
			List<Torneo> listadoTorneos, List<Partido> listadoPartidos, List<Registro> listadoRegistros) {
		this.listadoEquipos = new ArrayList<Equipo>();
		this.listadoEntrenadores = new ArrayList<Entrenador>();
		this.listadoJugadores = new ArrayList<Jugador>();
		this.listadoTorneos = new ArrayList<Torneo>();
		this.listadoPartidos = new ArrayList<Partido>();
		this.listadoRegistros = new ArrayList<Registro>();
	}
	
	// Agregué este constructor para que no haga falta tener listas ya creadas cuando se quiera iniciar Sistema
	public Sistema() {
		super();
		this.listadoEquipos = new ArrayList<Equipo>();
		this.listadoEntrenadores = new ArrayList<Entrenador>();
		this.listadoJugadores = new ArrayList<Jugador>();
		this.listadoTorneos = new ArrayList<Torneo>();
		this.listadoPartidos = new ArrayList<Partido>();
		this.listadoRegistros = new ArrayList<Registro>();
	}
	
	
	public void addEquipo(Equipo equipo) {
		this.listadoEquipos.add(equipo);
	}
	
	public void addEntrenador(Entrenador entrenador) {
		this.listadoEntrenadores.add(entrenador);
	}
	
	public void addJugador(Jugador jugador) {
		this.listadoJugadores.add(jugador);
	}

	public void addTorneo(Torneo torneo) {
		this.listadoTorneos.add(torneo);
	}
	
	public void addPartido(Partido partido) {
		this.listadoPartidos.add(partido);
	}

	public void addRegistro(Registro registro) {
		this.listadoRegistros.add(registro);
	}
	
	//
	
	public void removeEquipo(Equipo equipo) {
		this.listadoEquipos.remove(equipo);
	}
	
	public void removeEntrenador(Entrenador entrenador) {
		this.listadoEntrenadores.remove(entrenador);
	}
	
	public void removeJugador(Jugador jugador) {
		this.listadoJugadores.remove(jugador);
	}

	public void removeTorneo(Torneo torneo) {
		this.listadoTorneos.remove(torneo);
	}
	
	public void removePartido(Partido partido) {
		this.listadoPartidos.remove(partido);
	}

	public void removeRegistro(Registro registro) {
		this.listadoRegistros.remove(registro);
	}
	
	//
	
	public List<Equipo> getListaEquipos() {
		return listadoEquipos;
	}

	public void setListaEquipos(List<Equipo> listadoEquipos) {
		this.listadoEquipos = listadoEquipos;
	}

	public List<Entrenador> getListaEntrenador() {
		return listadoEntrenadores;
	}

	public void setListaEntrenador(List<Entrenador> listadoEntrenadores) {
		this.listadoEntrenadores = listadoEntrenadores;
	}

	public List<Jugador> getListaJugador() {
		return listadoJugadores;
	}

	public void setListaJugador(List<Jugador> listadoJugadores) {
		this.listadoJugadores = listadoJugadores;
	}

	public List<Torneo> getListaTorneo() {
		return listadoTorneos;
	}

	public void setListaTorneo(List<Torneo> listadoTorneos) {
		this.listadoTorneos = listadoTorneos;
	}

	public List<Partido> getListaPartido() {
		return listadoPartidos;
	}

	public void setListaPartido(List<Partido> listadoPartidos) {
		this.listadoPartidos = listadoPartidos;
	}

	public List<Registro> getListaRegistro() {
		return listadoRegistros;
	}

	public void setListaRegistro(List<Registro> listadoRegistros) {
		this.listadoRegistros = listadoRegistros;
	}
	
	// MÉTODOS RELACIONADOS A ENTRENADOR
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

	
	public boolean eliminarEntrenador(int dni) throws Exception{
		if (traerEntrenador(dni) == null) {
			throw new Exception("Error al eliminar entrenador: el entrenador no existe.");
		}
		return listadoEntrenadores.remove(traerEntrenador(dni));
	}
	
	/* NO CREO QUE HAGA FALTA ESTE METODO
	public Entrenador traerEntrenador(int id) {
		Entrenador retornoEntrenador = null;
		
		int i = 0;
		
		while (i < listadoEntrenadores.size() && retornoEntrenador == null) {
			if (listadoEntrenadores.get(i).getId() == id) {
				retornoEntrenador = listadoEntrenadores.get(i);
			}
			i++;
		}
		return retornoEntrenador;
	}*/
	
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
			}
		}
		return entrenadoresFiltrados;
	}
	
}