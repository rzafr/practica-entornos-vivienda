/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author lucasjosemoraleschacon
 */
public class Hogar {

    
    public static void main(String[] args) {
    	
        Vivienda v = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        System.out.println("Precio: " + v.precio);
        System.out.println("N�mero de habitaciones: "+ v.numHabitaciones);
        System.out.println("Superficie en m2: " + v.superficie);
        System.out.println("�Dispone de parking?: " + v.parking);
        System.out.println("Estado: "+ v.estado);
        System.out.println("Propietario: "+ v.propietario);
        
        
    }
    
}
