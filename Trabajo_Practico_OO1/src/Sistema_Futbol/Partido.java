package Sistema_Futbol;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partido {

	private int idPartido;
	private LocalDate fechaPartido;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Estadio estadio;

	public Partido(int idPartido, LocalDate fechaPartido, Equipo equipoLocal, Equipo equipoVisitante, Estadio estadio) {
		this.idPartido = idPartido;
		this.fechaPartido = fechaPartido;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.estadio = estadio;
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

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", fechaPartido=" + fechaPartido + ", equipoLocal=" + equipoLocal
				+ ", equipoVisitante=" + equipoVisitante + ", estadio=" + estadio + "]";
	}

	// Hash y equals solo para idPartido
	@Override
	public int hashCode() {
		return Integer.hashCode(idPartido);
	}

	
	public boolean equals(Partido partido) {
		return (partido.getFechaPartido().isEqual(this.fechaPartido) &&
				(partido.getEquipoLocal().equals(this.getEquipoLocal()) && partido.getEquipoVisitante().equals(this.equipoVisitante)));
	}
}
