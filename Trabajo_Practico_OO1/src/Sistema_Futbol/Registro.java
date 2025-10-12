package Sistema_Futbol;

public class Registro {
	private int idRegistro;
	private int cantidadGoles;
	private int cantidadAsistencias;
	private int minutosJugados;
	private Partido partido;
	private Jugador jugador;

	public Registro(int idRegistro, int cantidadGoles, int cantidadAsistencias, int minutosJugados, Partido partido,
			Jugador jugador) {

		this.cantidadAsistencias = cantidadAsistencias;
		this.cantidadGoles = cantidadGoles;
		this.idRegistro = idRegistro;
		this.minutosJugados = minutosJugados;
		this.partido = partido;
		this.jugador = jugador;

	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public int getCantidadAsistencias() {
		return cantidadAsistencias;
	}

	public void setCantidadAsistencias(int cantidadAsistencias) {
		this.cantidadAsistencias = cantidadAsistencias;
	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}

	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}

	public int getMinutosJugados() {
		return minutosJugados;
	}

	public void setMinutosJugados(int minutosJugados) {
		this.minutosJugados = minutosJugados;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	// To String
	@Override
	public String toString() {
		return "\n Registro [idRegistro=" + idRegistro + ", cantidadGoles=" + cantidadGoles + ", cantidadAsistencias="
				+ cantidadAsistencias + ", minutosJugados=" + minutosJugados + ", partido=" + partido + ", jugador="
				+ jugador + "]";
	}

	// Hash y equals solo para idRegistro
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRegistro;
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
		Registro other = (Registro) obj;
		if (idRegistro != other.idRegistro)
			return false;
		return true;
	}
}
