/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;
import ciudad.Posicion;
/**
 *
 * @author usuario1
 */
public class Automovil extends Vehiculo{
    //Constructor
    public Automovil(Posicion posicion, int pasajeros) {
	super(posicion, pasajeros);
	imagen = new String[] {
		    "    _____",	
		    " __/__|__\\___",	
		    "|_  _____  __|",	
		    "   O      O"	
		};	
    }  

}
