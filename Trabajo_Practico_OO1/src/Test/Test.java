package Test;

import java.time.LocalDate;

import Sistema_Futbol.*;

public class Test {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // TEST ALTA ESTADIO
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

        // TEST ALTA JUGADORES A LA BD
        try {
            sistema.agregarJugador("Ignacio", "Vega", 25, 42366713, LocalDate.of(2000, 1, 11), 1.70f, 55, "Delantero",
                    10);
            sistema.agregarJugador("Ricardo", "Villalobos", 25, 43092082, LocalDate.of(2000, 12, 26), 2.36f, 86,
                    "Delantero",
                    11);
        } catch (Exception e) {
            System.out.println(e);
        }

        // TEST MODIFICACION DE ESTADIO
        try {
            sistema.modificarEstadio(sistema.traerEstadio(1), "Estadio de Independiente", "Avellaneda");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEstadio());

        // TEST ALTA DE EQUIPO
        try {
            sistema.altaEquipo("Independiente", "CAI", LocalDate.of(1905, 1, 01), null, sistema.traerEstadio(1));
            sistema.altaEquipo("River Plate", "RIV", LocalDate.of(1904, 2, 22), null, sistema.traerEstadio(3));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEquipos());

        // TEST AGREGAR JUGADOR AL EQUIPO
        try {
            sistema.agregarJugadorAlEquipo(sistema.traerEquipo(1), sistema.traerJugador(42366713));
            sistema.agregarJugadorAlEquipo(sistema.traerEquipo(1), sistema.traerJugador(43092082));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEquipos());

        // TEST BAJA DE JUGADOR DEL EQUIPO (ELIMINACION LOGICA)
        try {
        sistema.bajaJugadorDelEquipo(sistema.traerEquipo(1),
        sistema.traerJugador(42366713));
        } catch (Exception e) {
        System.out.println(e);
        }

        System.out.println("\n" + sistema.getListaEquipos());

        // TEST DE JUGADORES EN LA BD

        System.out.println(sistema.getListaJugador());

        // TEST DE BUSQUEDA POR FECHA DE FUNDACION DE EQUIPOS
        System.out.println("TEST DE BUSQUEDA POR FECHA DE FUNDACION DE EQUIPOS");
        System.out.println(sistema.busquedaEquipoPorFundacion(LocalDate.of(1903, 1, 1), LocalDate.of(1904, 2, 22)));

        // TEST CALCULO PROMEDIO ALTURA DE UN EQUIPO DADO
        System.out.println("TEST CALCULO PROMEDIO ALTURA DE UN EQUIPO DADO");
        System.out.println("Altura promedio del equipo " + sistema.traerEquipo(1).getNombre()
                + " = " + sistema.calcularAlturaPromedioEquipo(sistema.traerEquipo(1)) + " m");
    }
}
