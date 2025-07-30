import java.util.List;

public class FormularioFlotilla {

    public static void mostrarEstadoFlotilla(List<Vehiculo> listaVehiculos) {
        System.out.println("=== ESTADO DE LA FLOTA ===");

        int contadorAutobuses = 0;
        int contadorTrenes = 0;
        int contadorBicis = 0;
        int enServicio = 0;
        int fueraServicio = 0;

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.toString());
            System.out.println("---------------------------");

            if (v instanceof AutoBus) {
                contadorAutobuses++;
            } else if (v instanceof Tren) {
                contadorTrenes++;
            } else if (v instanceof BicicletaPublica) {
                contadorBicis++;
            }

            String estado = v.getEstado().toLowerCase().trim();
            if (estado.equals("en servicio")) {
                enServicio++;
            } else if (estado.equals("fuera de servicio")) {
                fueraServicio++;
            }
        }

        System.out.println("=== RESUMEN DE FLOTA ===");
        System.out.println("Autobuses: " + contadorAutobuses);
        System.out.println("Trenes: " + contadorTrenes);
        System.out.println("Bicicletas Públicas: " + contadorBicis);
        System.out.println("Vehículos en servicio: " + enServicio);
        System.out.println("Vehículos fuera de servicio: " + fueraServicio);
    }
}
