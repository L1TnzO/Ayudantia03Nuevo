package org.example;

public class Validaciones {

    public static boolean esOpcionValida(int opcion, int minOpcion, int maxOpcion) {
        return opcion >= minOpcion && opcion <= maxOpcion;
    }
    public static boolean tieneSuficientesFondos(int cantidad, int dineroDisponible) {
        return cantidad <= dineroDisponible;
    }
}

