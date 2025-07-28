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

    // Getter y setter para numeroVagones
    public int getNumeroVagones() {
        return this.numeroVagones;
    }

    public void setNumeroVagones(int vagones) {
        if (vagones > 0) {
            this.numeroVagones = vagones;
        }
    }

    // Getter y setter para tipoTren
    public String getTipoTren() {
        return this.tipoTren;
    }

    public void setTipoTren(String tipo) {
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
