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

    // Constructor
    public Torneo(int id, String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.temporada = temporada;
        this.listaPartido = new ArrayList<Partido>();
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

    // To String
    @Override
    public String toString() {
        return "\nTorneo [id=" + id + ", nombre=" + nombre + ", temporada=" + temporada + ", listaPartido="
                + listaPartido + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
    }

    // Hash y equals solo para id
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Torneo other = (Torneo) obj;
        return id == other.id;
    }
}
