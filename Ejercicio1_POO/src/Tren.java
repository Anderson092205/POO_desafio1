public class Tren extends Vehiculo {
    // Atributos específicos del tren
    private int numeroVagones;
    private String tipoTren;

    // Constructor
    public Tren(String id, int capacidad, float velocidad, String estado, int vagones, String tipo) {
        super(id, capacidad, velocidad, estado);
        this.numeroVagones = vagones;
        this.tipoTren = tipo;
    }



    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Tren: " +
                "Placa: " + getId() + "\n" +
                "Capacidad: " + getCapacidadPasajeros() + "\n" +
                "Velocidad Máxima: " + getVelocidadMaxima() + " km/h\n" +
                "Estado: " + getEstado() + "\n" +
                "Número de Vagones: " + numeroVagones + "\n" +
                "Tipo de Tren: " + tipoTren + "\n";
    }
}
