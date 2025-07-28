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

    // Getter y setter para tieneCesta
    public boolean getTieneCesta() {
        return this.tieneCesta;
    }

    public void setTieneCesta(boolean cesta) {
        this.tieneCesta = cesta;
    }

    // Getter y setter para nivelBateria
    public int getNivelBateria() {
        return this.nivelBateria;
    }

    public void setNivelBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.nivelBateria = bateria;
        }
    }

    // Método toString sobrescrito
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

