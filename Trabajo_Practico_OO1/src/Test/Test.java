package Test;

import java.time.LocalDate;

import Sistema_Futbol.*;

public class Test {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        try {
            sistema.altaEstadio("Libertadores de America", "Avellaneda");
            sistema.altaEstadio("Estadio Juan Domingo Peron", "Avellaneda");
            sistema.altaEstadio("El Monumental", "Buenos Aires");
            sistema.altaEstadio("Godoy Cruz", "Mendoza");
            sistema.altaEstadio("Maracana", "Sao Paulo");
            sistema.altaEstadio("Maracana", "Sao Paulo");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(sistema.getListaEstadio());

        try {
            sistema.agregarJugador("Ignacio", "Vega", 25, 42366713, LocalDate.of(2000, 1, 11), 1.70f, 55, "Delantero",
                    10);
            sistema.agregarJugador("Ricardo", "Villalobos", 25, 43092082, LocalDate.of(2000, 12, 26), 1.70f, 86,
                    "Delantero",
                    11);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            sistema.modificarEstadio(sistema.traerEstadio(1), "Estadio de Independiente", "Avellaneda");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEstadio());

        try {
            sistema.altaEquipo("Independiente", "CAI", LocalDate.of(1905, 1, 01), null, sistema.traerEstadio(1));
            sistema.altaEquipo("River Plate", "RIV", LocalDate.of(1904, 2, 22), null, sistema.traerEstadio(3));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEquipos());

        try {
            sistema.agregarJugadorAlEquipo(sistema.traerEquipo(1), sistema.traerJugador(42366713));
            sistema.agregarJugadorAlEquipo(sistema.traerEquipo(2), sistema.traerJugador(43092082));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEquipos());
    }
}
