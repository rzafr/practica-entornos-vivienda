/**
 * Paquete Hogar
 */
package Hogar;

/** 
 * Clase Vivienda con atributos y métodos para crear objetos de la clase Vivienda.
 * @author Ruben
 * @version 1.0 2021-05-26
 */
public class Vivienda {
    
	private double precio;
	private int numHabitaciones;
	private double superficie;
	private boolean parking;
	private String estado;
	private String propietario;
    private double descuento = precio * 0.05;
    	
	/** 
	 * Constructor con todos los atributos para construir objetos de la clase Vivienda.
	 * @param precio
	 * @param numHabitaciones
	 * @param superficie
	 * @param parking
	 * @param estado
	 * @param propietario
	 */
	public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado,
			String propietario) {
		super();
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.superficie = superficie;
		this.parking = parking;
		this.estado = estado;
		this.propietario = propietario;
	}

	/** 
	 * Constructor con solo el atributo precio para construir objetos de la clase Vivienda sólo con el precio.
	 * @param precio
	 * 
	 */
	public Vivienda (double precio) {
        this.precio = precio;
    }
    
	/** 
	 * Método que recibe como parámetro un descuento y actualiza el precio de la vivienda.
	 * @param descuento
	 * 
	 */
	public void actualizarPrecio(double descuento) {
        precio = precio - this.descuento;
    }
	
	
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the numHabitaciones
	 */
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	/**
	 * @param numHabitaciones the numHabitaciones to set
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the parking
	 */
	public boolean isParking() {
		return parking;
	}

	/**
	 * @param parking the parking to set
	 */
	public void setParking(boolean parking) {
		this.parking = parking;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

}
