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

