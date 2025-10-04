package Sistema_Futbol;

import java.time.LocalDate;
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

	// Metodos

	// UTILIDAD VALIDAR DNI DIGITOS

	public boolean validarDni(long dni) throws Exception {

		// Validacion DNI tiene que ser 8 digitos
		String stringDni = String.valueOf(dni);

		if (stringDni.length() != 8) {
			throw new Exception("El DNI tiene que tener 8 digitos.");
		}

		return true;
	}

	//UTILIDAD COMPROBAR MAYOR DE EDAD

	public boolean comprobarMayorEdad (LocalDate fechaNacimiento){

		boolean mayorEdad;
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate calculoMayorEdad = fechaNacimiento.plusYears(18);
		
		if (calculoMayorEdad.isBefore(fechaActual)){
			mayorEdad = true;
		}else{
			mayorEdad = false;
		}

		return mayorEdad;
	}


	// ENTRENADORES
	// ALTA ENTRENADOR
	public boolean agregarEntrenador(String nombre, String apellido, long dni, LocalDate fechaNacimiento,
			String estrategiaFavorita) throws Exception {

		// Validacion DNI tiene que ser 8 digitos
		validarDni(dni);

		// Busqueda si existe el entrenador en la BD
		int contador = 0;
		boolean existeEntrenador = false;

		while (contador < listaEntrenador.size() && existeEntrenador == false) {
			if (listaEntrenador.get(contador).getDni() == dni) {
				existeEntrenador = true;
			}
			contador++;
		}

		if (existeEntrenador == false) {
			listaEntrenador.add(
					new Entrenador(listaEntrenador.size() + 1, nombre, apellido, dni, fechaNacimiento,
							estrategiaFavorita));
		} else {
			throw new Exception("El entrenador con DNI " + dni + " ya existe en la BD.");
		}

		return true;
	}

	// TRAER ENTRENADOR
	public Entrenador traerEntrenador(int idEntrenador) throws Exception {

		if (idEntrenador <= 0) {
			throw new Exception("El ID " + idEntrenador + " que ingreso no puede ser 0 o un numero negativo.");
		}

		int contador = 0;
		Entrenador entrenadorEncontrado = null;

		while (entrenadorEncontrado == null && contador < listaEntrenador.size()) {
			if (listaEntrenador.get(contador).getId() == idEntrenador) {
				entrenadorEncontrado = listaEntrenador.get(contador);
			}
			contador++;
		}

		if (entrenadorEncontrado == null) {
			throw new Exception("El ID " + idEntrenador + " que ingreso no existe en la BD.");
		}

		return entrenadorEncontrado;
	}

	// BAJA ENTRENADOR
	public boolean eliminarEntrenadorPorDni(long dni) throws Exception {

		validarDni(dni); // Valida SNI

		int contador = 0;
		Entrenador entrenadorAEliminar = null;

		while (entrenadorAEliminar == null && contador < listaEntrenador.size()) {
			if (getListaEntrenador().get(contador).getDni() == dni) {
				entrenadorAEliminar = getListaEntrenador().get(contador);
			}
			contador++;
		}

		if (entrenadorAEliminar != null) {
			getListaEntrenador().remove(entrenadorAEliminar);
		} else {
			throw new Exception("El entrenador con DNI " + dni + " no existe en la BD. No se pudo eliminar.");
		}

		return true;
	}

	public boolean modificarEntrenador(long dni, String nombre, String apellido,
			LocalDate fechaNacimiento, String estrategiaFavorita) throws Exception {

		validarDni(dni);

		int contador = 0;
		Entrenador entrenadorEncontrado = null;

		while (entrenadorEncontrado == null && contador < listaEntrenador.size()) {
			if (listaEntrenador.get(contador).getDni() == dni) {
				entrenadorEncontrado = listaEntrenador.get(contador);
			}
			contador++;
		}

		if (entrenadorEncontrado != null) {
			entrenadorEncontrado.setNombre(nombre);
			entrenadorEncontrado.setApellido(apellido);
			entrenadorEncontrado.setEstrategiaFavorita(estrategiaFavorita);
		} else {
			throw new Exception("MODIFICACION ENTRENADOR: El DNI " + dni + " que ingreso no existe en la BD.");
		}

		return true;
	}

	// Búsqueda de entrenadores: Crear un método que, dada una táctica preferida,
	// devuelva una lista de todos los entrenadores que la utilicen.
	public List<Entrenador> buscarEntrenador(String estrategia) {

		List<Entrenador> entrenadoresFiltrados = new ArrayList<Entrenador>();

		for (Entrenador entrenador : getListaEntrenador()) {
			if (entrenador.getEstrategiaFavorita().equals(estrategia)) {
				entrenadoresFiltrados.add(entrenador);
			}
		}
		return entrenadoresFiltrados;
	}
	
	// Agrega jugadores. Si el DNI no es válido o ya está ocupado o el jugador no es mayor de edad, tira excepción.
	public boolean agregarJugador(String nombre, String apellido, long dni, LocalDate fechaNacimiento, float estatura, float peso, String posicion, int dorsal) throws Exception{
		validarDni(dni);
		
		if (traerJugador(dni) != null) {
		    throw new Exception("El DNI ingresado ya está en uso.");
		}

		if (!comprobarMayorEdad(fechaNacimiento)) {
		    throw new Exception("El jugador debe ser mayor de edad.");
		}
		
		int id = 1;
		
		if (listaJugador.size() > 0) {
			id = listaJugador.get(listaJugador.size()-1).getId() + 1;
		}
		
		return listaJugador.add(new Jugador(id, nombre, apellido, dni, fechaNacimiento, estatura, peso, posicion, dorsal));
	};
	
	// Trae jugador por DNI.
	public Jugador traerJugador(long dni) {
		Jugador retornoJugador = null;
		
		int i = 0;
		
		while (i<listaJugador.size() && retornoJugador == null) {
			if (listaJugador.get(i).getDni() == dni) {
				retornoJugador = listaJugador.get(i);
			}
			i++;
		}
		
		return retornoJugador;
	};
	
	// Modificación de jugador. Puede modificar todo menos ID.
	public boolean modificarJugador (long dniOriginal, String nombre, String apellido, long dni, float estatura, float peso, String posicion, int dorsal) throws Exception{
		Jugador jugadorModificado = traerJugador(dniOriginal);
		
		// Compruebo que el jugador existe
		if (jugadorModificado == null) {
			throw new Exception ("El jugador no existe");
		}
		
		// Compruebo que sea un DNI válido.
		validarDni(dni);
		
		// Compruebo que el DNI no está siendo ocupado por otra persona.
		Jugador existente = traerJugador(dni);
		if (existente != null && !existente.equals(jugadorModificado)){
		    throw new Exception("El DNI ya está en uso");
		}
		
		
		jugadorModificado.setNombre(nombre);
		jugadorModificado.setApellido(apellido);
		jugadorModificado.setDni(dni);
		jugadorModificado.setEstatura(estatura);
		jugadorModificado.setPeso(peso);
		jugadorModificado.setPosicion(posicion);
		jugadorModificado.setDorsal(dorsal);
		
		return true;
	}
	
	// Elimina jugador por DNI. Si no existe el jugador, lanza excepción. 
	//(consultar si es mejor directamente traer el DNI o el traerJugador(dni) + si debe tirar excepcion si no está el jugador que se busca eliminar o es suficiente con el null).
	public boolean eliminarJugador(long dni) throws Exception{
		Jugador eliminarJugador = traerJugador(dni);
		
		if (eliminarJugador == null) {
			throw new Exception ("El jugador no existe.");
		}
		
		return listaJugador.remove(eliminarJugador);
	};
	
	
	// Búsqueda de jugadores por fecha de nacimiento: 
	//Implementar una método que retorne una lista de jugadores nacidos entre dos fechas dadas.
	public List<Jugador> traerJugadores(LocalDate fechaPrimera, LocalDate fechaSegunda) {
		List<Jugador> retornoJugadores = new ArrayList<Jugador>();
		
		for (Jugador j : listaJugador) {
			if ((j.getFechaNacimiento().isEqual(fechaPrimera) || j.getFechaNacimiento().isAfter(fechaPrimera)) &&
			   (j.getFechaNacimiento().isEqual(fechaSegunda) || j.getFechaNacimiento().isBefore(fechaSegunda))) {
				retornoJugadores.add(j);
			}
		}
		
		return retornoJugadores;
	};
}