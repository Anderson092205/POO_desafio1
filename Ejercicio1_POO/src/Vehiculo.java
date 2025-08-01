//se hace un archivo aparte para las clases


//se crea la clase con los atributos
//encapsulamiento para los atributos privados, protegidos del acceso directo externo
public class Vehiculo{
    private String id;
    private int capacidadPasajeros;
    private float velocidadMaxima;
    private String estado;  // en servicio o fuera de servicio


    //colores
    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";



    public Vehiculo(String id, int capacidad, float velocidad, String estado) {

        this.id = id;
        this.setCapacidadPasajeros(capacidad);
        this.setVelocidadMaxima(velocidad);
        this.estado = (estado != null) ? estado : "desconocido";
    }

    //Accedemos a los métodos con get

    public String getId(){
        return this.id;
    }
    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }
    public float getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setCapacidadPasajeros(int capacidad) {

        if(capacidad > 0) {
            this.capacidadPasajeros = capacidad;
        }

        else{
            System.out.println(RED + "\n La capacidad de pasajeros debe ser mayor que cero." + RESET);
        }
    }


    public void setVelocidadMaxima(float velocidad) {
        if(velocidad >= 0) {
            this.velocidadMaxima = velocidad;

        } else{
            throw new IllegalArgumentException(RED + "\n Solo Valores positivos" + RESET);
        }
    }

    public void setEstado(String estado) {
        if (estado.equals("En servicio") || estado.equals( "Fuera de servicio")) {
            this.estado = estado;
        }
    }


}
