
package Hogar;


public class Vivienda {
    
	double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;
    
    public Vivienda (double precio) {
        this.precio = precio;
    }
    
    public void actualizarPrecio() {
        precio = precio - precio * 0.05;
    }
}
