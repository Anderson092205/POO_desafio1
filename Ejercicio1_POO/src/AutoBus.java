public class AutoBus extends Vehiculo {
    private String rutaAsignada;
    private  int numerosPisos;

    public AutoBus(String id, int capacidad, float velocidad, String estado, String ruta, int pisos) {
        super(id, capacidad, velocidad,estado);  //se llama al constructor clase padre
        this.rutaAsignada = ruta;
        this.numerosPisos = pisos;
    }

    //se usan los getter y los setters
    public String getRutaAsignada(){
        return this.rutaAsignada;
    }
    public void setRutaAsignada(String ruta){
        this.rutaAsignada = ruta;
    }

    public int getNumerosPisos(){
        return this.numerosPisos;
    }
    public void setNumerosPisos(int pisos){
        if(pisos >= 1){
            this.numerosPisos = pisos;
        }
    }
}
