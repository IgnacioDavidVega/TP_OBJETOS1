package Sistema_Futbol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private int id;
    private String nombre;
    private String temporada;
    private List<Partido> listaPartido;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    public Torneo(int id, String nombre, String temporada, List<Partido> listaPartido, LocalDate fechaInicio,
            LocalDate fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.temporada = temporada;
        this.listaPartido = new ArrayList<>();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
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
    public String getTemporada() {
        return temporada;
    }
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    public List<Partido> getListaPartido() {
        return listaPartido;
    }
    public void setListaPartido(List<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
