package Test;

import java.time.LocalDate;
import Sistema_Futbol.*;

public class Test {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        System.out.println("=== INICIANDO TESTS DEL TORNEO CLAUSURA 2025 ===\n");

        // 1. CREAR ENTRENADORES
        System.out.println("--- CREANDO ENTRENADORES ---");

        // Entrenador Carlos Gómez (Leones)
        try {
            sistema.agregarEntrenador("Carlos", "Gómez", 45, 12345678, LocalDate.of(1978, 3, 15), "4-4-2");
            System.out.println("✓ Entrenador Carlos Gómez creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando entrenador Carlos Gómez: " + e.getMessage());
        }

        // Entrenador Luis Martínez (Tigres)
        try {
            sistema.agregarEntrenador("Luis", "Martínez", 42, 22345678, LocalDate.of(1981, 7, 22), "4-3-3");
            System.out.println("✓ Entrenador Luis Martínez creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando entrenador Luis Martínez: " + e.getMessage());
        }

        // Entrenador Jorge Pérez (Halcones)
        try {
            sistema.agregarEntrenador("Jorge", "Pérez", 38, 32345678, LocalDate.of(1985, 11, 8), "3-5-2");
            System.out.println("✓ Entrenador Jorge Pérez creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando entrenador Jorge Pérez: " + e.getMessage());
        }

        // Entrenador Andrés Suárez (Lobos)
        try {
            sistema.agregarEntrenador("Andrés", "Suárez", 50, 42345678, LocalDate.of(1973, 4, 12), "5-3-2");
            System.out.println("✓ Entrenador Andrés Suárez creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando entrenador Andrés Suárez: " + e.getMessage());
        }

        // 2. CREAR ESTADIOS
        System.out.println("\n--- CREANDO ESTADIOS ---");

        try {
            sistema.altaEstadio("Estadio León", "Ciudad León");
            System.out.println("✓ Estadio León creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando Estadio León: " + e.getMessage());
        }

        try {
            sistema.altaEstadio("Estadio Tigre", "Ciudad Tigre");
            System.out.println("✓ Estadio Tigre creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando Estadio Tigre: " + e.getMessage());
        }

        try {
            sistema.altaEstadio("Estadio Halcón", "Ciudad Halcón");
            System.out.println("✓ Estadio Halcón creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando Estadio Halcón: " + e.getMessage());
        }

        try {
            sistema.altaEstadio("Estadio Lobo", "Ciudad Lobo");
            System.out.println("✓ Estadio Lobo creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando Estadio Lobo: " + e.getMessage());
        }

        // 3. CREAR JUGADORES
        System.out.println("\n--- CREANDO JUGADORES ---");

        // Jugadores del equipo Leones
        try {
            sistema.agregarJugador("Juan", "Pérez", 25, 11111111, LocalDate.of(2000, 2, 10), 1.80f, 75.0f, "delantero",
                    9);
            System.out.println("✓ Jugador Juan Pérez (Leones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Juan Pérez: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Martín", "López", 27, 11111112, LocalDate.of(1998, 6, 12), 1.82f, 78.0f, "defensor",
                    4);
            System.out.println("✓ Jugador Martín López (Leones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Martín López: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Lucas", "Díaz", 24, 11111113, LocalDate.of(2001, 4, 18), 1.75f, 72.0f,
                    "mediocampista", 8);
            System.out.println("✓ Jugador Lucas Díaz (Leones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Lucas Díaz: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Franco", "Ruiz", 26, 11111114, LocalDate.of(1999, 11, 3), 1.85f, 80.0f, "arquero",
                    1);
            System.out.println("✓ Jugador Franco Ruiz (Leones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Franco Ruiz: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Agustín", "Torres", 23, 11111115, LocalDate.of(2002, 7, 21), 1.78f, 73.0f,
                    "delantero", 10);
            System.out.println("✓ Jugador Agustín Torres (Leones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Agustín Torres: " + e.getMessage());
        }

        // Jugadores del equipo Tigres
        try {
            sistema.agregarJugador("Diego", "González", 26, 22222221, LocalDate.of(1999, 2, 4), 1.83f, 79.0f, "arquero",
                    1);
            System.out.println("✓ Jugador Diego González (Tigres) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Diego González: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Nicolás", "Romero", 28, 22222222, LocalDate.of(1997, 9, 10), 1.80f, 76.0f,
                    "defensor", 2);
            System.out.println("✓ Jugador Nicolás Romero (Tigres) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Nicolás Romero: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Rodrigo", "Sosa", 25, 22222223, LocalDate.of(2000, 12, 12), 1.74f, 71.0f,
                    "mediocampista", 6);
            System.out.println("✓ Jugador Rodrigo Sosa (Tigres) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Rodrigo Sosa: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Matías", "Vera", 23, 22222224, LocalDate.of(2002, 1, 5), 1.79f, 74.0f, "delantero",
                    9);
            System.out.println("✓ Jugador Matías Vera (Tigres) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Matías Vera: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Pablo", "Castro", 27, 22222225, LocalDate.of(1998, 5, 22), 1.81f, 77.0f, "defensor",
                    3);
            System.out.println("✓ Jugador Pablo Castro (Tigres) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Pablo Castro: " + e.getMessage());
        }

        // Jugadores del equipo Halcones
        try {
            sistema.agregarJugador("Emiliano", "Cabrera", 26, 33333331, LocalDate.of(1999, 3, 14), 1.86f, 81.0f,
                    "arquero", 1);
            System.out.println("✓ Jugador Emiliano Cabrera (Halcones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Emiliano Cabrera: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Javier", "Morales", 24, 33333332, LocalDate.of(2001, 10, 19), 1.79f, 75.0f,
                    "defensor", 5);
            System.out.println("✓ Jugador Javier Morales (Halcones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Javier Morales: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Gonzalo", "Rivas", 25, 33333333, LocalDate.of(2000, 8, 30), 1.77f, 73.0f,
                    "mediocampista", 7);
            System.out.println("✓ Jugador Gonzalo Rivas (Halcones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Gonzalo Rivas: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Lautaro", "Fernández", 22, 33333334, LocalDate.of(2003, 2, 17), 1.83f, 78.0f,
                    "delantero", 11);
            System.out.println("✓ Jugador Lautaro Fernández (Halcones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Lautaro Fernández: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Mateo", "Blanco", 23, 33333335, LocalDate.of(2002, 4, 23), 1.72f, 69.0f,
                    "mediocampista", 8);
            System.out.println("✓ Jugador Mateo Blanco (Halcones) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Mateo Blanco: " + e.getMessage());
        }

        // Jugadores del equipo Lobos
        try {
            sistema.agregarJugador("Facundo", "Herrera", 27, 44444441, LocalDate.of(1998, 12, 8), 1.84f, 80.0f,
                    "arquero", 1);
            System.out.println("✓ Jugador Facundo Herrera (Lobos) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Facundo Herrera: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Ignacio", "Ramos", 26, 44444442, LocalDate.of(1999, 9, 1), 1.80f, 76.0f, "defensor",
                    4);
            System.out.println("✓ Jugador Ignacio Ramos (Lobos) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Ignacio Ramos: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Tomás", "Benítez", 25, 44444443, LocalDate.of(2000, 5, 15), 1.74f, 72.0f,
                    "mediocampista", 6);
            System.out.println("✓ Jugador Tomás Benítez (Lobos) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Tomás Benítez: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Sebastián", "Luna", 24, 44444444, LocalDate.of(2001, 7, 7), 1.81f, 77.0f,
                    "delantero", 9);
            System.out.println("✓ Jugador Sebastián Luna (Lobos) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Sebastián Luna: " + e.getMessage());
        }

        try {
            sistema.agregarJugador("Enzo", "Correa", 23, 44444445, LocalDate.of(2002, 3, 28), 1.78f, 74.0f, "defensor",
                    2);
            System.out.println("✓ Jugador Enzo Correa (Lobos) creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando jugador Enzo Correa: " + e.getMessage());
        }

        // 4. CREAR EQUIPOS
        System.out.println("\n--- CREANDO EQUIPOS ---");

        try {
            Entrenador entrenadorLeones = sistema.traerEntrenador(1);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.altaEquipo("Leones", "E001", LocalDate.of(2010, 1, 1), entrenadorLeones, estadioLeones);
            System.out.println("✓ Equipo Leones creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando equipo Leones: " + e.getMessage());
        }

        try {
            Entrenador entrenadorTigres = sistema.traerEntrenador(2);
            Estadio estadioTigres = sistema.traerEstadio(2);
            sistema.altaEquipo("Tigres", "E002", LocalDate.of(2012, 3, 15), entrenadorTigres, estadioTigres);
            System.out.println("✓ Equipo Tigres creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando equipo Tigres: " + e.getMessage());
        }

        try {
            Entrenador entrenadorHalcones = sistema.traerEntrenador(3);
            Estadio estadioHalcones = sistema.traerEstadio(3);
            sistema.altaEquipo("Halcones", "E003", LocalDate.of(2015, 7, 20), entrenadorHalcones, estadioHalcones);
            System.out.println("✓ Equipo Halcones creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando equipo Halcones: " + e.getMessage());
        }

        try {
            Entrenador entrenadorLobos = sistema.traerEntrenador(4);
            Estadio estadioLobos = sistema.traerEstadio(4);
            sistema.altaEquipo("Lobos", "E004", LocalDate.of(2013, 9, 5), entrenadorLobos, estadioLobos);
            System.out.println("✓ Equipo Lobos creado exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error creando equipo Lobos: " + e.getMessage());
        }

        // 5. AGREGAR JUGADORES A LOS EQUIPOS
        System.out.println("\n--- AGREGANDO JUGADORES A LOS EQUIPOS ---");

        // Agregar jugadores a Leones
        try {
            Equipo equipoLeones = sistema.traerEquipo(1);
            equipoLeones.agregarJugadorAlEquipo(sistema.traerJugador(11111111)); // Juan Pérez
            equipoLeones.agregarJugadorAlEquipo(sistema.traerJugador(11111112)); // Martín López
            equipoLeones.agregarJugadorAlEquipo(sistema.traerJugador(11111113)); // Lucas Díaz
            equipoLeones.agregarJugadorAlEquipo(sistema.traerJugador(11111114)); // Franco Ruiz
            equipoLeones.agregarJugadorAlEquipo(sistema.traerJugador(11111115)); // Agustín Torres
            System.out.println("✓ Jugadores agregados al equipo Leones exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error agregando jugadores a Leones: " + e.getMessage());
        }

        // Agregar jugadores a Tigres
        try {
            Equipo equipoTigres = sistema.traerEquipo(2);
            equipoTigres.agregarJugadorAlEquipo(sistema.traerJugador(22222221)); // Diego González
            equipoTigres.agregarJugadorAlEquipo(sistema.traerJugador(22222222)); // Nicolás Romero
            equipoTigres.agregarJugadorAlEquipo(sistema.traerJugador(22222223)); // Rodrigo Sosa
            equipoTigres.agregarJugadorAlEquipo(sistema.traerJugador(22222224)); // Matías Vera
            equipoTigres.agregarJugadorAlEquipo(sistema.traerJugador(22222225)); // Pablo Castro
            System.out.println("✓ Jugadores agregados al equipo Tigres exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error agregando jugadores a Tigres: " + e.getMessage());
        }

        // Agregar jugadores a Halcones
        try {
            Equipo equipoHalcones = sistema.traerEquipo(3);
            equipoHalcones.agregarJugadorAlEquipo(sistema.traerJugador(33333331)); // Emiliano Cabrera
            equipoHalcones.agregarJugadorAlEquipo(sistema.traerJugador(33333332)); // Javier Morales
            equipoHalcones.agregarJugadorAlEquipo(sistema.traerJugador(33333333)); // Gonzalo Rivas
            equipoHalcones.agregarJugadorAlEquipo(sistema.traerJugador(33333334)); // Lautaro Fernández
            equipoHalcones.agregarJugadorAlEquipo(sistema.traerJugador(33333335)); // Mateo Blanco
            System.out.println("✓ Jugadores agregados al equipo Halcones exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error agregando jugadores a Halcones: " + e.getMessage());
        }

        // Agregar jugadores a Lobos
        try {
            Equipo equipoLobos = sistema.traerEquipo(4);
            equipoLobos.agregarJugadorAlEquipo(sistema.traerJugador(44444441)); // Facundo Herrera
            equipoLobos.agregarJugadorAlEquipo(sistema.traerJugador(44444442)); // Ignacio Ramos
            equipoLobos.agregarJugadorAlEquipo(sistema.traerJugador(44444443)); // Tomás Benítez
            equipoLobos.agregarJugadorAlEquipo(sistema.traerJugador(44444444)); // Sebastián Luna
            equipoLobos.agregarJugadorAlEquipo(sistema.traerJugador(44444445)); // Enzo Correa
            System.out.println("✓ Jugadores agregados al equipo Lobos exitosamente");
        } catch (Exception e) {
            System.out.println("✗ Error agregando jugadores a Lobos: " + e.getMessage());
        }

        // 6. CREAR TORNEO
        System.out.println("\n--- CREANDO TORNEO CLAUSURA 2025 ---");

        try {
            sistema.altaTorneo("Torneo Clausura 2025", "2025", LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 14));
            Torneo torneoClausura = sistema.traerTorneo(1);
            System.out.println("✓ Torneo Clausura 2025 creado exitosamente");
            System.out.println("  - ID: " + torneoClausura.getId());
            System.out.println("  - Nombre: " + torneoClausura.getNombre());
            System.out.println("  - Temporada: " + torneoClausura.getTemporada());
            System.out.println("  - Fecha inicio: " + torneoClausura.getFechaInicio());
            System.out.println("  - Fecha fin: " + torneoClausura.getFechaFin());
        } catch (Exception e) {
            System.out.println("✗ Error creando torneo: " + e.getMessage());
        }

        // 7. CREAR PARTIDOS (TODOS CONTRA TODOS - 6 PARTIDOS)
        System.out.println("\n--- CREANDO PARTIDOS DEL TORNEO ---");

        // Leones vs Tigres
        try {
            Equipo equipoLeones = sistema.traerEquipo(1);
            Equipo equipoTigres = sistema.traerEquipo(2);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.agregarPartido(LocalDate.of(2025, 10, 2), equipoLeones, equipoTigres, estadioLeones);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(1);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Leones vs Tigres creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Leones vs Tigres: " + e.getMessage());
        }

        // Halcones vs Lobos
        try {
            Equipo equipoHalcones = sistema.traerEquipo(3);
            Equipo equipoLobos = sistema.traerEquipo(4);
            Estadio estadioHalcones = sistema.traerEstadio(3);
            sistema.agregarPartido(LocalDate.of(2025, 10, 3), equipoHalcones, equipoLobos, estadioHalcones);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(2);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Halcones vs Lobos creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Halcones vs Lobos: " + e.getMessage());
        }

        // Leones vs Halcones
        try {
            Equipo equipoLeones = sistema.traerEquipo(1);
            Equipo equipoHalcones = sistema.traerEquipo(3);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.agregarPartido(LocalDate.of(2025, 10, 5), equipoLeones, equipoHalcones, estadioLeones);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(3);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Leones vs Halcones creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Leones vs Halcones: " + e.getMessage());
        }

        // Tigres vs Lobos
        try {
            Equipo equipoTigres = sistema.traerEquipo(2);
            Equipo equipoLobos = sistema.traerEquipo(4);
            Estadio estadioTigres = sistema.traerEstadio(2);
            sistema.agregarPartido(LocalDate.of(2025, 10, 6), equipoTigres, equipoLobos, estadioTigres);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(4);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Tigres vs Lobos creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Tigres vs Lobos: " + e.getMessage());
        }

        // Leones vs Lobos
        try {
            Equipo equipoLeones = sistema.traerEquipo(1);
            Equipo equipoLobos = sistema.traerEquipo(4);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.agregarPartido(LocalDate.of(2025, 10, 8), equipoLeones, equipoLobos, estadioLeones);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(5);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Leones vs Lobos creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Leones vs Lobos: " + e.getMessage());
        }

        // Tigres vs Halcones
        try {
            Equipo equipoTigres = sistema.traerEquipo(2);
            Equipo equipoHalcones = sistema.traerEquipo(3);
            Estadio estadioTigres = sistema.traerEstadio(2);
            sistema.agregarPartido(LocalDate.of(2025, 10, 9), equipoTigres, equipoHalcones, estadioTigres);

            Torneo torneo = sistema.traerTorneo(1);
            Partido partido = sistema.traerPartido(6);
            sistema.agregarPartidoTorneo(torneo, partido);
            System.out.println("✓ Partido Tigres vs Halcones creado y agregado al torneo");
        } catch (Exception e) {
            System.out.println("✗ Error creando partido Tigres vs Halcones: " + e.getMessage());
        }

        // 8. CREAR REGISTROS DETALLADOS POR PARTIDO
        System.out.println("\n--- CREANDO ESTADÍSTICAS DETALLADAS POR PARTIDO ---");

        // PARTIDO 1 — Leones 2 - 1 Tigres (2025-03-10 15:00)
        System.out.println("\n*** PARTIDO 1 — Leones 2 - 1 Tigres ***");
        System.out.println("    2025-03-10 15:00");

        // Actualizar fecha del partido 1
        try {
            Partido partido1 = sistema.traerPartido(1);
            Equipo leones = sistema.traerEquipo(1);
            Equipo tigres = sistema.traerEquipo(2);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.modificarPartido(partido1, LocalDate.of(2025, 3, 10), leones, tigres, estadioLeones);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 1: " + e.getMessage());
        }

        // Juan Pérez - Leones: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido1 = sistema.traerPartido(1);
            Jugador juanPerez = sistema.traerJugador(11111111);
            sistema.agregarRegistro(1, 0, 90, partido1, juanPerez);
            System.out.println("✓ Juan Pérez (Leones): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Juan Pérez: " + e.getMessage());
        }

        // Agustín Torres - Leones: 1 gol, 0 asistencias, 85 minutos
        try {
            Partido partido1 = sistema.traerPartido(1);
            Jugador agustinTorres = sistema.traerJugador(11111115);
            sistema.agregarRegistro(1, 0, 85, partido1, agustinTorres);
            System.out.println("✓ Agustín Torres (Leones): 1 gol, 0 asistencias, 85 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Agustín Torres: " + e.getMessage());
        }

        // Matías Vera - Tigres: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido1 = sistema.traerPartido(1);
            Jugador matiasVera = sistema.traerJugador(22222224);
            sistema.agregarRegistro(1, 0, 90, partido1, matiasVera);
            System.out.println("✓ Matías Vera (Tigres): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Matías Vera: " + e.getMessage());
        }

        // PARTIDO 2 — Halcones 1 - 1 Lobos (2025-03-17 16:00)
        System.out.println("\n*** PARTIDO 2 — Halcones 1 - 1 Lobos ***");
        System.out.println("    2025-03-17 16:00");

        // Actualizar fecha del partido 2
        try {
            Partido partido2 = sistema.traerPartido(2);
            Equipo halcones = sistema.traerEquipo(3);
            Equipo lobos = sistema.traerEquipo(4);
            Estadio estadioHalcones = sistema.traerEstadio(3);
            sistema.modificarPartido(partido2, LocalDate.of(2025, 3, 17), halcones, lobos, estadioHalcones);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 2: " + e.getMessage());
        }

        // Lautaro Fernández - Halcones: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido2 = sistema.traerPartido(2);
            Jugador lautaroFernandez = sistema.traerJugador(33333334);
            sistema.agregarRegistro(1, 0, 90, partido2, lautaroFernandez);
            System.out.println("✓ Lautaro Fernández (Halcones): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Lautaro Fernández: " + e.getMessage());
        }

        // Sebastián Luna - Lobos: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido2 = sistema.traerPartido(2);
            Jugador sebastianLuna = sistema.traerJugador(44444444);
            sistema.agregarRegistro(1, 0, 90, partido2, sebastianLuna);
            System.out.println("✓ Sebastián Luna (Lobos): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Sebastián Luna: " + e.getMessage());
        }

        // PARTIDO 3 — Leones 3 - 0 Halcones (2025-03-24 15:00)
        System.out.println("\n*** PARTIDO 3 — Leones 3 - 0 Halcones ***");
        System.out.println("    2025-03-24 15:00");

        // Actualizar fecha del partido 3
        try {
            Partido partido3 = sistema.traerPartido(3);
            Equipo leones = sistema.traerEquipo(1);
            Equipo halcones = sistema.traerEquipo(3);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.modificarPartido(partido3, LocalDate.of(2025, 3, 24), leones, halcones, estadioLeones);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 3: " + e.getMessage());
        }

        // Juan Pérez - Leones: 2 goles, 0 asistencias, 90 minutos
        try {
            Partido partido3 = sistema.traerPartido(3);
            Jugador juanPerez = sistema.traerJugador(11111111);
            sistema.agregarRegistro(2, 0, 90, partido3, juanPerez);
            System.out.println("✓ Juan Pérez (Leones): 2 goles, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Juan Pérez en partido 3: " + e.getMessage());
        }

        // Agustín Torres - Leones: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido3 = sistema.traerPartido(3);
            Jugador agustinTorres = sistema.traerJugador(11111115);
            sistema.agregarRegistro(1, 0, 90, partido3, agustinTorres);
            System.out.println("✓ Agustín Torres (Leones): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Agustín Torres en partido 3: " + e.getMessage());
        }

        // PARTIDO 4 — Tigres 0 - 2 Lobos (2025-03-31 16:00)
        System.out.println("\n*** PARTIDO 4 — Tigres 0 - 2 Lobos ***");
        System.out.println("    2025-03-31 16:00");

        // Actualizar fecha del partido 4
        try {
            Partido partido4 = sistema.traerPartido(4);
            Equipo tigres = sistema.traerEquipo(2);
            Equipo lobos = sistema.traerEquipo(4);
            Estadio estadioTigres = sistema.traerEstadio(2);
            sistema.modificarPartido(partido4, LocalDate.of(2025, 3, 31), tigres, lobos, estadioTigres);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 4: " + e.getMessage());
        }

        // Sebastián Luna - Lobos: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido4 = sistema.traerPartido(4);
            Jugador sebastianLuna = sistema.traerJugador(44444444);
            sistema.agregarRegistro(1, 0, 90, partido4, sebastianLuna);
            System.out.println("✓ Sebastián Luna (Lobos): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Sebastián Luna en partido 4: " + e.getMessage());
        }

        // Enzo Correa - Lobos: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido4 = sistema.traerPartido(4);
            Jugador enzoCorrea = sistema.traerJugador(44444445);
            sistema.agregarRegistro(1, 0, 90, partido4, enzoCorrea);
            System.out.println("✓ Enzo Correa (Lobos): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Enzo Correa: " + e.getMessage());
        }

        // PARTIDO 5 — Leones 1 - 3 Lobos (2025-04-07 15:30)
        System.out.println("\n*** PARTIDO 5 — Leones 1 - 3 Lobos ***");
        System.out.println("    2025-04-07 15:30");

        // Actualizar fecha del partido 5
        try {
            Partido partido5 = sistema.traerPartido(5);
            Equipo leones = sistema.traerEquipo(1);
            Equipo lobos = sistema.traerEquipo(4);
            Estadio estadioLeones = sistema.traerEstadio(1);
            sistema.modificarPartido(partido5, LocalDate.of(2025, 4, 7), leones, lobos, estadioLeones);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 5: " + e.getMessage());
        }

        // Agustín Torres - Leones: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido5 = sistema.traerPartido(5);
            Jugador agustinTorres = sistema.traerJugador(11111115);
            sistema.agregarRegistro(1, 0, 90, partido5, agustinTorres);
            System.out.println("✓ Agustín Torres (Leones): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Agustín Torres en partido 5: " + e.getMessage());
        }

        // Sebastián Luna - Lobos: 2 goles, 0 asistencias, 80 minutos
        try {
            Partido partido5 = sistema.traerPartido(5);
            Jugador sebastianLuna = sistema.traerJugador(44444444);
            sistema.agregarRegistro(2, 0, 80, partido5, sebastianLuna);
            System.out.println("✓ Sebastián Luna (Lobos): 2 goles, 0 asistencias, 80 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Sebastián Luna en partido 5: " + e.getMessage());
        }

        // Enzo Correa - Lobos: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido5 = sistema.traerPartido(5);
            Jugador enzoCorrea = sistema.traerJugador(44444445);
            sistema.agregarRegistro(1, 0, 90, partido5, enzoCorrea);
            System.out.println("✓ Enzo Correa (Lobos): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Enzo Correa en partido 5: " + e.getMessage());
        }

        // PARTIDO 6 — Tigres 2 - 2 Halcones (2025-04-14 15:30)
        System.out.println("\n*** PARTIDO 6 — Tigres 2 - 2 Halcones ***");
        System.out.println("    2025-04-14 15:30");

        // Actualizar fecha del partido 6
        try {
            Partido partido6 = sistema.traerPartido(6);
            Equipo tigres = sistema.traerEquipo(2);
            Equipo halcones = sistema.traerEquipo(3);
            Estadio estadioTigres = sistema.traerEstadio(2);
            sistema.modificarPartido(partido6, LocalDate.of(2025, 4, 14), tigres, halcones, estadioTigres);
        } catch (Exception e) {
            System.out.println("✗ Error actualizando fecha del partido 6: " + e.getMessage());
        }

        // Rodrigo Sosa - Tigres: 1 gol, 0 asistencias, 80 minutos
        try {
            Partido partido6 = sistema.traerPartido(6);
            Jugador rodrigoSosa = sistema.traerJugador(22222223);
            sistema.agregarRegistro(1, 0, 80, partido6, rodrigoSosa);
            System.out.println("✓ Rodrigo Sosa (Tigres): 1 gol, 0 asistencias, 80 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Rodrigo Sosa: " + e.getMessage());
        }

        // Matías Vera - Tigres: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido6 = sistema.traerPartido(6);
            Jugador matiasVera = sistema.traerJugador(22222224);
            sistema.agregarRegistro(1, 0, 90, partido6, matiasVera);
            System.out.println("✓ Matías Vera (Tigres): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Matías Vera en partido 6: " + e.getMessage());
        }

        // Gonzalo Rivas - Halcones: 1 gol, 0 asistencias, 85 minutos
        try {
            Partido partido6 = sistema.traerPartido(6);
            Jugador gonzaloRivas = sistema.traerJugador(33333333);
            sistema.agregarRegistro(1, 0, 85, partido6, gonzaloRivas);
            System.out.println("✓ Gonzalo Rivas (Halcones): 1 gol, 0 asistencias, 85 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Gonzalo Rivas: " + e.getMessage());
        }

        // Lautaro Fernández - Halcones: 1 gol, 0 asistencias, 90 minutos
        try {
            Partido partido6 = sistema.traerPartido(6);
            Jugador lautaroFernandez = sistema.traerJugador(33333334);
            sistema.agregarRegistro(1, 0, 90, partido6, lautaroFernandez);
            System.out.println("✓ Lautaro Fernández (Halcones): 1 gol, 0 asistencias, 90 min");
        } catch (Exception e) {
            System.out.println("✗ Error creando registro para Lautaro Fernández en partido 6: " + e.getMessage());
        }

        // 9. MOSTRAR RESUMEN DE ESTADÍSTICAS POR PARTIDO
        System.out.println("\n=== RESUMEN DE ESTADÍSTICAS POR PARTIDO ===");

        try {
            System.out.println("\nPARTIDO 1 — Leones 2 - 1 Tigres (2025-03-10)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Juan Pérez\t\tLeones\t\t1\t0\t\t90");
            System.out.println("Agustín Torres\t\tLeones\t\t1\t0\t\t85");
            System.out.println("Matías Vera\t\tTigres\t\t1\t0\t\t90");

            System.out.println("\nPARTIDO 2 — Halcones 1 - 1 Lobos (2025-03-17)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Lautaro Fernández\tHalcones\t1\t0\t\t90");
            System.out.println("Sebastián Luna\t\tLobos\t\t1\t0\t\t90");

            System.out.println("\nPARTIDO 3 — Leones 3 - 0 Halcones (2025-03-24)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Juan Pérez\t\tLeones\t\t2\t0\t\t90");
            System.out.println("Agustín Torres\t\tLeones\t\t1\t0\t\t90");

            System.out.println("\nPARTIDO 4 — Tigres 0 - 2 Lobos (2025-03-31)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Sebastián Luna\t\tLobos\t\t1\t0\t\t90");
            System.out.println("Enzo Correa\t\tLobos\t\t1\t0\t\t90");

            System.out.println("\nPARTIDO 5 — Leones 1 - 3 Lobos (2025-04-07)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Agustín Torres\t\tLeones\t\t1\t0\t\t90");
            System.out.println("Sebastián Luna\t\tLobos\t\t2\t0\t\t80");
            System.out.println("Enzo Correa\t\tLobos\t\t1\t0\t\t90");

            System.out.println("\nPARTIDO 6 — Tigres 2 - 2 Halcones (2025-04-14)");
            System.out.println("Jugador\t\t\tEquipo\t\tGoles\tAsistencias\tMinutos");
            System.out.println("Rodrigo Sosa\t\tTigres\t\t1\t0\t\t80");
            System.out.println("Matías Vera\t\tTigres\t\t1\t0\t\t90");
            System.out.println("Gonzalo Rivas\t\tHalcones\t1\t0\t\t85");
            System.out.println("Lautaro Fernández\tHalcones\t1\t0\t\t90");

        } catch (Exception e) {
            System.out.println("✗ Error mostrando estadísticas: " + e.getMessage());
        }

        // 10. PRUEBAS DE FUNCIONALIDADES DEL SISTEMA
        System.out.println("\n--- PROBANDO FUNCIONALIDADES DEL SISTEMA ---");

        // Buscar entrenadores por táctica
        try {
            System.out.println("\n• Entrenadores que usan táctica 4-4-2:");
            var entrenadores442 = sistema.buscarEntrenador("4-4-2");
            for (Entrenador ent : entrenadores442) {
                System.out.println("  - " + ent.getNombre() + " " + ent.getApellido() + " (DNI: " + ent.getDni() + ")");
            }
        } catch (Exception e) {
            System.out.println("✗ Error buscando entrenadores: " + e.getMessage());
        }

        // Calcular altura promedio de equipos
        try {
            System.out.println("\n• Altura promedio por equipo:");
            for (int i = 1; i <= 4; i++) {
                Equipo equipo = sistema.traerEquipo(i);
                if (equipo != null) {
                    float alturaPromedio = equipo.calcularAlturaPromedioEquipo();
                    System.out.printf("  - %s: %.2f metros%n", equipo.getNombre(), alturaPromedio);
                }
            }
        } catch (Exception e) {
            System.out.println("✗ Error calculando altura promedio: " + e.getMessage());
        }

        // Equipo con mayor promedio de altura en el torneo
        try {
            Torneo torneo = sistema.traerTorneo(1);
            if (torneo != null) {
                Equipo equipoMayorAltura = sistema.promedioAlturaMayorTorneo(torneo);
                System.out.println(
                        "\n• Equipo con mayor promedio de altura en el torneo: " + equipoMayorAltura.getNombre());
                System.out.printf("  Altura promedio: %.2f metros%n", equipoMayorAltura.calcularAlturaPromedioEquipo());
            }
        } catch (Exception e) {
            System.out.println("✗ Error encontrando equipo con mayor altura: " + e.getMessage());
        }

        // Goles y asistencias de jugadores
        try {
            Torneo torneo = sistema.traerTorneo(1);
            Jugador juanPerez = sistema.traerJugador(11111111);
            if (torneo != null && juanPerez != null) {
                int goles = sistema.golesJugadorPorRegistro(juanPerez, torneo);
                int asistencias = sistema.asistenciasJugadorPorRegistro(juanPerez, torneo);
                System.out.println("\n• Estadísticas de Juan Pérez en el torneo:");
                System.out.println("  - Goles: " + goles);
                System.out.println("  - Asistencias: " + asistencias);
            }
        } catch (Exception e) {
            System.out.println("✗ Error calculando estadísticas: " + e.getMessage());
        }

        // Buscar jugadores por rango de fechas
        try {
            System.out.println("\n• Jugadores nacidos entre 2000-2002:");
            var jugadoresRango = sistema.traerJugadores(LocalDate.of(2000, 1, 1), LocalDate.of(2002, 12, 31));
            for (Jugador jug : jugadoresRango) {
                System.out.println("  - " + jug.getNombre() + " " + jug.getApellido() + " (nacido: "
                        + jug.getFechaNacimiento() + ")");
            }
        } catch (Exception e) {
            System.out.println("✗ Error buscando jugadores por fecha: " + e.getMessage());
        }

        // Buscar equipos por fecha de fundación
        try {
            System.out.println("\n• Equipos fundados entre 2010-2015:");
            var equiposRango = sistema.busquedaEquipoPorFundacion(LocalDate.of(2010, 1, 1), LocalDate.of(2015, 12, 31));
            for (Equipo eq : equiposRango) {
                System.out.println("  - " + eq.getNombre() + " (fundado: " + eq.getFechaFundacion() + ")");
            }
        } catch (Exception e) {
            System.out.println("✗ Error buscando equipos por fecha: " + e.getMessage());
        }

        // 11. RESUMEN FINAL
        System.out.println("\n=== RESUMEN FINAL DEL TORNEO CLAUSURA 2025 ===");
        try {
            Torneo torneo = sistema.traerTorneo(1);
            if (torneo != null) {
                System.out.println("Torneo: " + torneo.getNombre());
                System.out.println("Temporada: " + torneo.getTemporada());
                System.out.println("Partidos programados: " + torneo.getListaPartido().size());
                System.out.println("Equipos participantes: 4");
                System.out.println("Total de jugadores: " + sistema.getListaJugador().size());
                System.out.println("Total de entrenadores: " + sistema.getListaEntrenador().size());
                System.out.println("Total de estadios: " + sistema.getListaEstadio().size());
                System.out.println("Total de registros: " + sistema.getListaRegistro().size());
            }
        } catch (Exception e) {
            System.out.println("✗ Error mostrando resumen: " + e.getMessage());
        }

        System.out.println("\n=== TESTS COMPLETADOS ===");
    }
}
