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
	private List<Estadio> listaEstadio;

	public Sistema() {
		this.listaEquipos = new ArrayList<Equipo>();
		this.listaEntrenador = new ArrayList<Entrenador>();
		this.listaJugador = new ArrayList<Jugador>();
		this.listaTorneo = new ArrayList<Torneo>();
		this.listaPartido = new ArrayList<Partido>();
		this.listaRegistro = new ArrayList<Registro>();
		this.listaEstadio = new ArrayList<Estadio>();
	}

	public List<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public List<Entrenador> getListaEntrenador() {
		return listaEntrenador;
	}

	public List<Jugador> getListaJugador() {
		return listaJugador;
	}

	public List<Torneo> getListaTorneo() {
		return listaTorneo;
	}

	public List<Partido> getListaPartido() {
		return listaPartido;
	}

	public List<Registro> getListaRegistro() {
		return listaRegistro;
	}

	public List<Estadio> getListaEstadio() {
		return listaEstadio;
	}

	// Metodos

	// UTILIDADES
	//
	//
	// VALIDACION DE DNI SOLO POR DIGITOS
	public boolean validarDni(long dni) throws Exception {

		// Validacion DNI tiene que ser 8 digitos
		String stringDni = String.valueOf(dni);

		if (stringDni.length() != 8) {
			throw new Exception("El DNI tiene que tener 8 digitos.");
		}

		return true;
	}

	// ENTRENADORES
	//
	//
	// ALTA ENTRENADOR
	public boolean agregarEntrenador(String nombre, String apellido, int edad, long dni, LocalDate fechaNacimiento,
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
					new Entrenador(listaEntrenador.size() + 1, nombre, apellido, edad, dni, fechaNacimiento,
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

	// MODIFICAR ENTRENDADOR: SE PASA POR PARAMETRO EL DNI; SOLO SE MODIFICA NOMBRE,
	// APELLIDO Y ESTRATEGIA FAVORITA.
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

	// BUSQUEDA DE ENTRENADOR: Crear un método que, dada una táctica preferida,
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

	// ABM JUGADORES
	//
	//
	// Agrega jugadores. Si el DNI no es válido o ya está ocupado o el jugador no es
	// mayor de edad, tira excepción.
	public boolean agregarJugador(String nombre, String apellido, int edad, long dni, LocalDate fechaNacimiento,
			float estatura,
			float peso, String posicion, int dorsal) throws Exception {
		validarDni(dni);

		if (traerJugador(dni) != null) {
			throw new Exception("El DNI ingresado ya está en uso.");
		}

		// Crear un objeto temporal para verificar mayoría de edad ya que el metodo esta
		// en la clase Persona
		Persona personaTemp = new Persona(0, "", "", 0, 0, fechaNacimiento);
		if (personaTemp.comprobarMayorEdad(fechaNacimiento) == false) {
			throw new Exception("El jugador debe ser mayor de edad.");
		}

		int id = 1;

		if (listaJugador.size() > 0) {
			id = listaJugador.get(listaJugador.size() - 1).getId() + 1;
		}

		return listaJugador
				.add(new Jugador(id, nombre, apellido, edad, dni, fechaNacimiento, estatura, peso, posicion, dorsal));
	};

	// Trae jugador por DNI.
	public Jugador traerJugador(long dni) {
		Jugador retornoJugador = null;

		int i = 0;

		while (i < listaJugador.size() && retornoJugador == null) {
			if (listaJugador.get(i).getDni() == dni) {
				retornoJugador = listaJugador.get(i);
			}
			i++;
		}

		return retornoJugador;
	};

	// Modificación de jugador. Puede modificar todo menos DNI e ID.
	public boolean modificarJugador(Jugador jugador, String nombre, String apellido, float estatura,
			float peso, String posicion, int dorsal) throws Exception {
		Jugador jugadorModificado = traerJugador(jugador.getDni());

		if (jugadorModificado == null) {
			throw new Exception("El jugador no existe");
		}

		validarDni(jugador.getDni());

		jugadorModificado.setNombre(nombre);
		jugadorModificado.setApellido(apellido);
		jugadorModificado.setEstatura(estatura);
		jugadorModificado.setPeso(peso);
		jugadorModificado.setPosicion(posicion);
		jugadorModificado.setDorsal(dorsal);

		return true;
	}

	// Elimina jugador por objeto
	public boolean eliminarJugador(Jugador jugador) {
		return listaJugador.remove(jugador);
	};

	// Búsqueda de jugadores por fecha de nacimiento:
	// Implementar una método que retorne una lista de jugadores nacidos entre dos
	// fechas dadas.
	public List<Jugador> traerJugadores(LocalDate fechaPrimera, LocalDate fechaSegunda) {
		List<Jugador> retornoJugadores = new ArrayList<Jugador>();

		for (Jugador j : listaJugador) {
			if (!(j.getFechaNacimiento().isBefore(fechaPrimera) || j.getFechaNacimiento().isAfter(fechaSegunda))) {
				retornoJugadores.add(j);
			}
		}

		return retornoJugadores;
	}

	// ABM REGISTRO
	// Agrega el registro y en caso de que exista ese registro (lo comprueba
	// mediante el jugador y partido), lanza una excepción.
	public boolean agregarRegistro(int cantidadGoles, int cantidadAsistencias, int minutosJugados, Partido partido,
			Jugador jugador) throws Exception {
		Registro registroAgregar = new Registro(0, cantidadGoles, cantidadAsistencias, minutosJugados, partido,
				jugador);

		if (existeRegistro(registroAgregar)) {
			throw new Exception("Ya hay un registro con el mismo partido y jugador");
		}

		int id = 1;
		if (listaRegistro.size() > 0) {
			id = listaRegistro.get(listaRegistro.size() - 1).getIdRegistro() + 1;
		}
		registroAgregar.setIdRegistro(id);

		return listaRegistro.add(registroAgregar);
	}

	// Trae el registro en base al jugador y partido. Si no existe, devuelve null.
	public Registro traerRegistro(Jugador jugador, Partido partido) {
		Registro retornoRegistro = null;

		int i = 0;

		while (i < listaRegistro.size() && retornoRegistro == null) {
			if (listaRegistro.get(i).getJugador().equals(jugador)
					&& listaRegistro.get(i).getPartido().equals(partido)) {
				retornoRegistro = listaRegistro.get(i);
			}
			i++;
		}

		return retornoRegistro;
	}

	// Comprobamos si el registro existe: se basa completamente en si un registro
	// tiene el mismo jugador y mismo partido, cosa que no debería suceder porque no
	// juega más de 1 partido por día.
	public boolean existeRegistro(Registro registro) {
		boolean registroExiste = false;

		int i = 0;

		while (i < listaRegistro.size() && registroExiste == false) {
			if (listaRegistro.get(i).equals(registro)) {
				registroExiste = true;
			}
			i++;
		}

		return registroExiste;
	}

	// Modifica el registro menos la id, el jugador al que pertenece y el partido
	// que jugó. Si el registro no existe, lanza una excepción.
	public boolean modificarRegistro(Registro registro, int cantidadGoles, int cantidadAsistencias, int minutosJugados)
			throws Exception {
		if (!existeRegistro(registro)) {
			throw new Exception("El registro no existe");
		}

		Registro registroModificado = traerRegistro(registro.getJugador(), registro.getPartido());

		registroModificado.setCantidadGoles(cantidadGoles);
		registroModificado.setCantidadAsistencias(cantidadAsistencias);
		registroModificado.setMinutosJugados(minutosJugados);

		return true;
	}

	// Elimina el jugador de lista recibiendo el registro.
	public boolean eliminarRegistro(Registro registro) {
		return listaRegistro.remove(registro);
	}

	//
	//
	// ABM EQUIPO

	// TRAER EQUIPO

	public Equipo traerEquipo(int id) {
		Equipo equipoEncontrado = null;
		int contador = 0;

		while (equipoEncontrado == null && contador < getListaEquipos().size()) {
			if (getListaEquipos().get(contador).getId() == id) {
				equipoEncontrado = getListaEquipos().get(contador);
			}
			contador++;
		}

		return equipoEncontrado;
	}

	// ALTA EQUIPO

	public boolean altaEquipo(String nombre, String codUnico, LocalDate fechaFundacion, Entrenador entrenador,
			Estadio estadio) throws Exception {

		// Buscamos si el nombre que se paso por parametro coincide con uno existente en
		// la BD. De ser asi,
		// lanza una excepcion.

		boolean mismoNombre = false;
		int contador = 0;

		while (!mismoNombre && contador < getListaEquipos().size()) {
			if (getListaEquipos().get(contador).getNombre().equals(nombre)) {
				mismoNombre = true;
			}
			contador++;
		}

		if (mismoNombre) {
			throw new Exception("El nombre " + nombre + " que ingreso ya existe en la BD.");
		}

		// Agregamos el equipo
		int id = 1;

		if (listaEquipos.size() > 0) {
			id = listaEquipos.get(listaEquipos.size() - 1).getId() + 1;
		}

		return listaEquipos.add(new Equipo(id, nombre, codUnico, fechaFundacion, entrenador, estadio));
	}

	// BAJA DE EQUIPO

	public boolean bajaEquipo(Equipo equipo) {
		return listaEquipos.remove(equipo);
	}

	// MODIFICACION DE EQUIPO

	public boolean modificarEquipo(int id, String nombre, String codUnico, LocalDate fechaFundacion,
			Entrenador entrenador,
			Estadio estadio) throws Exception {

		Equipo equipoModificar = traerEquipo(id);

		if (equipoModificar.getNombre().equals(nombre)) {
			throw new Exception("El nombre " + nombre + " es el mismo.");
		}

		if (equipoModificar.getCodUnico().equals(codUnico)) {
			throw new Exception("El codigo unico " + codUnico + " es el mismo.");
		}

		equipoModificar.setNombre(nombre);
		equipoModificar.setCodUnico(codUnico);
		equipoModificar.setFechaFundacion(fechaFundacion);
		equipoModificar.setEntrenador(entrenador);

		return true;
	}

	// Agregar jugador al equipo

	public boolean agregarJugadorAlEquipo(Equipo equipo, Jugador jugador) throws Exception {

		// Buscamos si el jugador ya esta en la lista del equipo para no repetirlo.
		boolean mismoJugador = false;
		int contador = 0;

		while (contador < equipo.getListaJugadores().size() && !mismoJugador) {
			if (equipo.getListaJugadores().get(contador).getDni() == jugador.dni) {
				mismoJugador = true;
			}
			contador++;
		}

		if (mismoJugador) {
			throw new Exception("El jugador con DNI " + jugador.dni + " ya existe en la lista de Jugadores del equipo "
					+ equipo.getNombre());
		}

		return equipo.getListaJugadores().add(jugador);
	}

	// CLASE ESTADIO

	// Traer Estadio

	public Estadio traerEstadio(int id) {
		Estadio estadio = null;
		int contador = 0;

		while (contador < getListaEstadio().size() && estadio == null) {
			if (listaEstadio.get(contador).getId() == id) {
				estadio = listaEstadio.get(contador);
			}
			contador++;
		}

		return estadio;
	}

	// Alta Estadio

	public boolean altaEstadio(String nombre, String ubicacion) throws Exception {

		boolean mismoNombreEstadio = false;
		int contador = 0;

		while (contador < getListaEstadio().size() && !mismoNombreEstadio) {
			if (listaEstadio.get(contador).getNombre().equalsIgnoreCase(nombre)) {
				mismoNombreEstadio = true;
			}
			contador++;
		}

		if (mismoNombreEstadio) {
			throw new Exception("El nombre " + nombre + " que ingreso ya existe como Estadio.");
		}

		// Agregamos el estadio
		int id = 1;

		if (listaEstadio.size() > 0) {
			id = listaEstadio.get(listaEstadio.size() - 1).getId() + 1;
		}

		return listaEstadio.add(new Estadio(id, nombre, ubicacion));
	}

	// Modificacion de Estadio

	public boolean modificarEstadio(Estadio estadio, String nombre, String ubicacion) throws Exception {

		if (estadio.getNombre().equalsIgnoreCase(nombre)) {
			throw new Exception("El nombre del estadio es el mismo.");
		}

		estadio.setNombre(nombre);
		estadio.setUbicacion(ubicacion);

		return true;
	}

	// Baja de Estadio

	public boolean eliminarEstadio(Estadio estadio) {
		return listaEstadio.remove(estadio);
	}
};