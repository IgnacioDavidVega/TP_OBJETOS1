// TEST DEL SISTEMA
package test;

import java.time.LocalDate;

import Sistema_Futbol.*;

// Importaciones de las clases del sistema

public class TestSistema {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // TEST AGREGAR ENTRENADOR
        try {
            sistema.agregarEntrenador("Ignacio David", "Vega", 42366713, LocalDate.of(2000, 01, 11), "Ataques rapidos");
            sistema.agregarEntrenador("Ricardo Fabian", "Villalobos Valdez", 43092082, LocalDate.of(2000, 12, 26),
                    "Ataques rapidos");
            sistema.agregarEntrenador("Cletus", "Sota", 48975569, LocalDate.of(2007, 9, 30), "Posesion");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // TEST FILTRAR ENTRENADOR POR ESTRATEGIAS
        for (Entrenador entrenador : sistema.buscarEntrenador("Ataques rapidos")) {
            System.out.println(entrenador);
        }

        // TEST PARA ELIMINAR UN ENTRENADOR
        System.out.println("");
        try {
            sistema.eliminarEntrenadorPorDni(42366713);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // TEST PARA MOSTRAR ENTRENADORES DE LA LISTA
        System.out.println("");
        for (Entrenador entrenador : sistema.getListaEntrenador()) {
            System.out.println(entrenador);
        }

        // TEST PARA MODIFICAR AL ENTRENADOR, NO MODIFICA DNI
        System.out.println("");
        try {
            sistema.modificarEntrenador(43698778, null, null, LocalDate.now(), null);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("");
        for (Entrenador entrenador : sistema.getListaEntrenador()) {
            System.out.println(entrenador);
        }

        //TEST UTILIDAD CALCULO MAYOR DE EDAD
        System.out.println("");
        try {
        System.out.println(sistema.comprobarMayorEdad(sistema.traerEntrenador(3).getFechaNacimiento()));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
