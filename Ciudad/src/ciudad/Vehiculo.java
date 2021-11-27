/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;
import ciudad.Cosa;
import ciudad.Posicion;
/**
 *
 * @author usuario1
 */
public class Vehiculo extends Cosa{
    
    //Atributos
    protected int pasajeros;
    
    //Constructor
    public Vehiculo(Posicion posicion, int pasajeros) {
	super(posicion); 
	this.pasajeros = pasajeros;
    }

    //Metodos
    public void mover( int cambio_fila, int cambio_columna ) {
	this.posicion.cambiar(cambio_fila, cambio_columna);
    }    
}
