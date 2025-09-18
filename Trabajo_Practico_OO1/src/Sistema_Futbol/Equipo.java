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
    private List<Jugador> listaJugadores = new ArrayList<>();
    private Estadio estadio;

    
    //Implementacion del constructor
    public Equipo(int id, String nombre, String codUnico, LocalDate fechaFundacion, Entrenador entrenador, Estadio estadio) {
        this.id = id;
        this.nombre = nombre;
        this.codUnico = codUnico;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
        this.estadio = estadio;
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
}