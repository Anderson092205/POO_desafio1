public class Tren extends Vehiculo {
    private int numeroVagones;
    private String tipo;  //puede ser diesel o electrico

    public Tren(int id, int capacidad, float velocidad, String estado, int vagones, String tipo) {
        //se sigue llamando de la clase padre
        super(id, capacidad, velocidad, estado);
        this.numeroVagones = vagones;
        this.tipo = tipo;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }
    public void setNumeroVagones(int numeroVagones) {
        if (numeroVagones > 0) {
            this.numeroVagones = numeroVagones;
        }
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        if (tipo.equals("Eléctrico") || tipo.equals("Diesel")) {
            this.tipo = tipo;
        }
    }

    
}
