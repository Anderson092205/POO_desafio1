import java.util.List;

public class FormularioFlotilla {

    // Codigos para poner colores en la consola
    private static final String RESET = "\u001B[0m";
    private static final String VERDE = "\u001B[32m";
    private static final String ROJO = "\u001B[31m";
    private static final String AZUL = "\u001B[34m";
    private static final String AMARILLO = "\u001B[33m";

    // Método principal para mostrar el estado de la flotilla
    public static void mostrarEstadoFlotilla(List<Vehiculo> listaVehiculos) {
        // Validación: lista vacía o nula
        if (listaVehiculos == null || listaVehiculos.isEmpty()) {
            System.out.println(ROJO + "No hay vehículos en la flotilla." + RESET);
            return;
        }

        System.out.println(VERDE + "=== ESTADO DE LA FLOTA ===" + RESET);

        // Contadores por tipo y estado
        int contadorAutobuses = 0;
        int contadorTrenes = 0;
        int contadorBicis = 0;
        int enServicio = 0;
        int fueraServicio = 0;

        // Recorremos la lista de vehículos
        for (Vehiculo v : listaVehiculos) {
            System.out.println(AZUL + v.toString() + RESET);
            System.out.println(AMARILLO + "---------------------------" + RESET);

            // Contamos por tipo
            if (v instanceof AutoBus) {
                contadorAutobuses++;
            } else if (v instanceof Tren) {
                contadorTrenes++;
            } else if (v instanceof BicicletaPublica) {
                contadorBicis++;
            }

            // Contamos por estado
            String estado = v.getEstado().toLowerCase().trim();
            if (estado.equals("en servicio")) {
                enServicio++;
            } else if (estado.equals("fuera de servicio")) {
                fueraServicio++;
            }
        }

        // Cálculo de porcentaje en servicio
        int totalVehiculos = listaVehiculos.size();
        double porcentajeServicio = ((double) enServicio / totalVehiculos) * 100;

        // Resumen final
        System.out.println(VERDE + "=== RESUMEN DE FLOTA ===" + RESET);
        System.out.println("Autobuses: " + contadorAutobuses);
        System.out.println("Trenes: " + contadorTrenes);
        System.out.println("Bicicletas Públicas: " + contadorBicis);
        System.out.println("Vehículos en servicio: " + enServicio);
        System.out.println("Vehículos fuera de servicio: " + fueraServicio);
        System.out.printf("Porcentaje en servicio: %.2f%%\n", porcentajeServicio);
    }
}
