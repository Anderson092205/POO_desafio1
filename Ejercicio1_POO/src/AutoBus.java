public class AutoBus extends Vehiculo {
    // Atributos específicos del autobús
    private String rutaAsignada;
    private int numerosPisos;

    // Constructor con llamada al constructor de la clase padre
    public AutoBus(String id, int capacidad, float velocidad, String estado, String ruta, int pisos) {
        super(id, capacidad, velocidad, estado);
        this.rutaAsignada = ruta;
        this.numerosPisos = pisos;
    }

    // Getter y setter para rutaAsignada
    public String getRutaAsignada() {
        return this.rutaAsignada;
    }

    public void setRutaAsignada(String ruta) {
        this.rutaAsignada = ruta;
    }

    // Getter y setter para numerosPisos
    public int getNumerosPisos() {
        return this.numerosPisos;
    }

    public void setNumerosPisos(int pisos) {
        if (pisos >= 1) {
            this.numerosPisos = pisos;
        }
    }

    // Método toString sobrescrito para imprimir datos legibles
    @Override
    public String toString() {
        return "Autobus " +
                "Placa: " + getId() + "\n" +
                "Capacidad: " + getCapacidadPasajeros() + "\n" +
                "Velocidad Máxima: " + getVelocidadMaxima() + " km/h\n" +
                "Estado: " + getEstado() + "\n" +
                "Ruta Asignada: " + rutaAsignada + "\n" +
                "Número de Pisos: " + numerosPisos + "\n";
    }
}

