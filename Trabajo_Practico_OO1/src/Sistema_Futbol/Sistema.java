package Sistema_Futbol;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Equipo> listaEquipos;
	private List<Entrenador> listaEntrenador;
	private List<Jugador> listaJugador;
	private List<Torneo> listaTorneo;
	private List<Partido> listaPartido;
	private List<Registro> listaRegistro;
	
	public Sistema() {
		this.listaEquipos = new ArrayList<Equipo>();
		this.listaEntrenador = new ArrayList<Entrenador>();
		this.listaJugador = new ArrayList<Jugador>();
		this.listaTorneo = new ArrayList<Torneo>();
		this.listaPartido = new ArrayList<Partido>();
		this.listaRegistro = new ArrayList<Registro>();
	}
	
	
	public void addEquipo(Equipo equipo) {
		this.listaEquipos.add(equipo);
	}
	
	public void addEntrenador(Entrenador entrenador) {
		this.listaEntrenador.add(entrenador);
	}
	
	public void addJugador(Jugador jugador) {
		this.listaJugador.add(jugador);
	}

	public void addTorneo(Torneo torneo) {
		this.listaTorneo.add(torneo);
	}
	
	public void addPartido(Partido partido) {
		this.listaPartido.add(partido);
	}

	public void addRegistro(Registro registro) {
		this.listaRegistro.add(registro);
	}
	
	//
	
	public void removeEquipo(Equipo equipo) {
		this.listaEquipos.remove(equipo);
	}
	
	public void removeEntrenador(Entrenador entrenador) {
		this.listaEntrenador.remove(entrenador);
	}
	
	public void removeJugador(Jugador jugador) {
		this.listaJugador.remove(jugador);
	}

	public void removeTorneo(Torneo torneo) {
		this.listaTorneo.remove(torneo);
	}
	
	public void removePartido(Partido partido) {
		this.listaPartido.remove(partido);
	}

	public void removeRegistro(Registro registro) {
		this.listaRegistro.remove(registro);
	}
	
	//
	
	public List<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(List<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public List<Entrenador> getListaEntrenador() {
		return listaEntrenador;
	}

	public void setListaEntrenador(List<Entrenador> listaEntrenador) {
		this.listaEntrenador = listaEntrenador;
	}

	public List<Jugador> getListaJugador() {
		return listaJugador;
	}

	public void setListaJugador(List<Jugador> listaJugador) {
		this.listaJugador = listaJugador;
	}

	public List<Torneo> getListaTorneo() {
		return listaTorneo;
	}

	public void setListaTorneo(List<Torneo> listaTorneo) {
		this.listaTorneo = listaTorneo;
	}

	public List<Partido> getListaPartido() {
		return listaPartido;
	}

	public void setListaPartido(List<Partido> listaPartido) {
		this.listaPartido = listaPartido;
	}

	public List<Registro> getListaRegistro() {
		return listaRegistro;
	}

	public void setListaRegistro(List<Registro> listaRegistro) {
		this.listaRegistro = listaRegistro;
	}
}