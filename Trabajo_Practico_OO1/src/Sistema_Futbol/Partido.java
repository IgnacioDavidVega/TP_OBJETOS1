package Sistema_Futbol;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partido {
	
	private int idPartido;
	private LocalDate fechaPartido;
	private LocalTime horarioPartido;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	//private Estadio estadio;
	//private Torneo torneo;
	
	/// Los torneo y estadio como son clase aparte y todavia no estan hechos no puedo implementarlos
	
	public Partido(int idPartido, LocalDate fechaPartido, LocalTime horarioPartido, Equipo equipoLocal, Equipo equipoVisitante) {
        this.idPartido = idPartido;
        this.fechaPartido = fechaPartido;;
        this.horarioPartido = horarioPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
       // this.estadio = estadio;
      //  this.torneo = torneo;
     
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
	
	

}
