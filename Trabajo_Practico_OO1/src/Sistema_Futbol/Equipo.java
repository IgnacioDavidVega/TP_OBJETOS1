//Definicion de la clase Equipo

package Sistema_Futbol;

// Importaciones de librerias
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Clase Equipo
public class Equipo {
    private int id;
    private String nombre;
    private String codUnico;
    private LocalDate fechaFundacion;
    private Entrenador entrenador;
    private List<Jugador> listaJugadores;
    private Estadio estadio;

    // Implementacion del constructor
    public Equipo(int id, String nombre, String codUnico, LocalDate fechaFundacion, Entrenador entrenador,
            Estadio estadio) {
        this.id = id;
        this.nombre = nombre;
        this.codUnico = codUnico;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
        this.estadio = estadio;
        this.listaJugadores = new ArrayList<Jugador>();
    }

    // Implementacion de Getters y Setters
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

    public String getCodUnico() {
        return codUnico;
    }

    public void setCodUnico(String codUnico) {
        this.codUnico = codUnico;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    // To String
    @Override
    public String toString() {
        return "\nEquipo [id=" + id + ", nombre=" + nombre + ", codUnico=" + codUnico + ", fechaFundacion="
                + fechaFundacion + ", entrenador=" + entrenador + ", listaJugadores=" + listaJugadores + ", estadio="
                + estadio + "]";
    }

    // Equals and Hash

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codUnico == null) ? 0 : codUnico.hashCode());
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
        Equipo other = (Equipo) obj;
        if (codUnico == null) {
            if (other.codUnico != null)
                return false;
        } else if (!codUnico.equals(other.codUnico))
            return false;
        return true;
    }

    // ---------------------------------------- METODOS CLASE EQUIPO --

    // Metodo para calculo de altura promedio de un equipo dado

    public float calcularAlturaPromedioEquipo() throws Exception {

        float resultado = 0;
        int cantidadJugadores = getListaJugadores().size();

        if (getListaJugadores().size() == 0) {
            throw new Exception("ERROR: No hay jugadores en el equipo para poder calcular el promedio de altura.");
        }

        for (int i = 0; i < getListaJugadores().size(); i++) {
            resultado = (resultado + getListaJugadores().get(i).getEstatura());
        }

        return (resultado / cantidadJugadores);
    }

    // Baja de jugador del equipo

    public boolean bajaJugadorDelEquipo(Jugador jugador) {
        return getListaJugadores().remove(jugador);
    }

    // Agregar jugador al equipo

    public boolean agregarJugadorAlEquipo(Jugador jugador) throws Exception {

        // Buscamos si el jugador ya esta en la lista del equipo para no repetirlo.
        boolean mismoJugador = false;
        int contador = 0;

        while (contador < getListaJugadores().size() && !mismoJugador) {
            if (getListaJugadores().get(contador).getDni() == jugador.getDni()) {
                mismoJugador = true;
            }
            contador++;
        }

        if (mismoJugador) {
            throw new Exception("El jugador con DNI " + jugador.getDni()
                    + " ya existe en la lista de Jugadores del equipo " + getNombre());
        }

        return getListaJugadores().add(jugador);
    }
}