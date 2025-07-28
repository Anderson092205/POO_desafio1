
public class Main {
    public static void main(String[] args) {
        AutoBus bus = new AutoBus("\nBUS 001",
                40,
                80.0f,
                "en servicio",
                "Ruta 42",
                2);
        Tren tren = new Tren("TREN N001", 100, 120.5f, "en servicio",  6, "eléctrico");
        BicicletaPublica bici = new BicicletaPublica("BICI 001", 1, 25.0f, "en servicio", true,  85);

        System.out.println(bus);
        System.out.println(tren);
        System.out.println(bici);
    }
}
