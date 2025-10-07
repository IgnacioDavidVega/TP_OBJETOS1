package Sistema_Futbol;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partido {

	private int idPartido;
	private LocalDate fechaPartido;
	private LocalTime horarioPartido;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Estadio estadio;
	private Torneo torneo;

	public Partido(int idPartido, LocalDate fechaPartido, LocalTime horarioPartido, Equipo equipoLocal,
			Equipo equipoVisitante, Estadio estadio, Torneo torneo) {
		this.idPartido = idPartido;
		this.fechaPartido = fechaPartido;
		this.horarioPartido = horarioPartido;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.estadio = estadio;
		this.torneo = torneo;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public LocalDate getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(LocalDate fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	public LocalTime getHorarioPartido() {
		return horarioPartido;
	}

	public void setHorarioPartido(LocalTime horarioPartido) {
		this.horarioPartido = horarioPartido;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	// To String
	@Override
	public String toString() {
		return "\nPartido [idPartido=" + idPartido + ", fechaPartido=" + fechaPartido + ", horarioPartido="
				+ horarioPartido + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", estadio=" + estadio + ", torneo=" + torneo + "]";
	}

	// Hash y equals solo para idPartido
	@Override
	public int hashCode() {
		return Integer.hashCode(idPartido);
	}

	
	public boolean equals(Partido partido) {
		return partido.getFechaPartido().isEqual(this.fechaPartido);
	}
}
