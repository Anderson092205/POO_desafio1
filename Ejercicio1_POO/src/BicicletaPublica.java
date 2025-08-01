public class BicicletaPublica extends Vehiculo {
    // Atributos específicos de la bicicleta pública
    private boolean tieneCesta;
    private int nivelBateria; // Porcentaje de batería

    // Constructor
    public BicicletaPublica(String id, int capacidad, float velocidad, String estado, boolean cesta, int bateria) {
        super(id, capacidad, velocidad, estado);
        this.tieneCesta = cesta;
        this.nivelBateria = bateria;
    }



    // Metodo toString sobrescrito
    @Override
    public String toString() {
        return "Bicicleta Pública: " +
                "ID: " + getId() + "\n" +
                "Capacidad: " + getCapacidadPasajeros() + "\n" +
                "Velocidad Máxima: " + getVelocidadMaxima() + " km/h\n" +
                "Estado: " + getEstado() + "\n" +
                "¿Tiene Cesta?: " + (tieneCesta ? "Sí" : "No") + "\n" +
                "Nivel de Batería: " + nivelBateria + "%";
    }
}

