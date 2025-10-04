package Test;

import java.time.LocalDate;

import Sistema_Futbol.*;

public class Test {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        try {
            sistema.agregarJugador("Ignacio", "Vega", 25, 42366713, LocalDate.of(2000, 2, 25), 170.3f, 55, "Delantero",
                    11);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(sistema.getListaJugador());
    }
}
