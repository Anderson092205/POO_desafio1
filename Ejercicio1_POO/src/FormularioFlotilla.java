import java.util.List;

public class FormularioFlotilla {

    // Códigos especiales para mostrar colores en la consola (solo funcionan en algunas terminales)
    private static final String RESET = "\u001B[0m";       // Restablece el color al normal
    private static final String VERDE = "\u001B[32m";       // Verde para títulos y mensajes positivos
    private static final String ROJO = "\u001B[31m";        // Rojo para advertencias o errores
    private static final String AZUL = "\u001B[34m";        // Azul para mostrar cada vehículo
    private static final String AMARILLO = "\u001B[33m";    // Amarillo para separar visualmente

    /**
     * Este metodo muestra el estado actual de todos los vehículos en la flotilla.
     * Imprime cada vehículo y luego un resumen con estadísticas.
     *
     * @param listaVehiculos Lista de vehículos que queremos revisar
     */
    public static void mostrarEstadoFlotilla(List<Vehiculo> listaVehiculos) {
        // Si la lista está vacía o no existe, mostramos un mensaje y salimos del método
        if (listaVehiculos == null || listaVehiculos.isEmpty()) {
            System.out.println(ROJO + "No hay vehículos en la flotilla." + RESET);
            return;
        }

        // Título principal
        System.out.println(VERDE + "=== ESTADO DE LA FLOTA ===" + RESET);

        // Contadores para saber cuántos vehículos hay de cada tipo
        int contadorAutobuses = 0;
        int contadorTrenes = 0;
        int contadorBicis = 0;

        // Contadores para saber cuántos están funcionando y cuántos no
        int enServicio = 0;
        int fueraServicio = 0;

        // Recorremos cada vehículo en la lista
        for (Vehiculo v : listaVehiculos) {
            // Mostramos la información del vehículo en azul
            System.out.println(AZUL + v.toString() + RESET);
            System.out.println(AMARILLO + "---------------------------" + RESET);

            // Verificamos de qué tipo es el vehículo y sumamos al contador correspondiente
            if (v instanceof AutoBus) {
                contadorAutobuses++;
            } else if (v instanceof Tren) {
                contadorTrenes++;
            } else if (v instanceof BicicletaPublica) {
                contadorBicis++;
            }

            // Revisamos el estado del vehículo (por ejemplo: "en servicio" o "fuera de servicio")
            String estado = v.getEstado().toLowerCase().trim(); // Convertimos a minúsculas y quitamos espacios
            if (estado.equals("en servicio")) {
                enServicio++;
            } else if (estado.equals("fuera de servicio")) {
                fueraServicio++;
            }
        }

        // Calculamos el porcentaje de vehículos que están funcionando
        int totalVehiculos = listaVehiculos.size();
        double porcentajeServicio = ((double) enServicio / totalVehiculos) * 100;

        // Mostramos el resumen final con los totales
        System.out.println(VERDE + "=== RESUMEN DE FLOTA ===" + RESET);
        System.out.println("Autobuses: " + contadorAutobuses);
        System.out.println("Trenes: " + contadorTrenes);
        System.out.println("Bicicletas Públicas: " + contadorBicis);
        System.out.println("Vehículos en servicio: " + enServicio);
        System.out.println("Vehículos fuera de servicio: " + fueraServicio);
        System.out.printf("Porcentaje en servicio: %.2f%%\n", porcentajeServicio);
    }
}
