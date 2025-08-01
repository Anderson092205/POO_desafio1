import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Llamamos al metodo auxiliar para obtener la flotilla
        List<Vehiculo> flotilla = generarFlotillaDePrueba();

        // Mostramos el estado de la flotilla
        FormularioFlotilla.mostrarEstadoFlotilla(flotilla);
    }

    // Metodo auxiliar para generar una flotilla de prueba
    public static List<Vehiculo> generarFlotillaDePrueba() {
        List<Vehiculo> flotilla = new ArrayList<>();

        // Vehículo con capacidad negativa para activar validación
        AutoBus bus = new AutoBus("BUS 001",
                -40, //Capacidad inválida, se mostrará el mensaje en rojo
                80.0f,
                "en servicio",
                "Ruta 42",
                2);

        Tren tren = new Tren("TREN N001",
                100,
                120.5f,
                "en servicio",
                6, "eléctrico");

        BicicletaPublica bici = new BicicletaPublica("BICI 001",
                1, 25.0f,
                "fuera de servicio",
                true,
                85);

        // Agregamos los vehículos a la lista
        flotilla.add(bus);
        flotilla.add(tren);
        flotilla.add(bici);

        return flotilla;
    }
}
