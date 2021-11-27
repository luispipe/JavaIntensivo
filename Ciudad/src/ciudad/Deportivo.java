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
public class Deportivo extends Vehiculo{
    //Constructor
    public Deportivo(Posicion posicion, int pasajeros) {
	super(posicion, pasajeros);
	imagen = new String[] {
		" ________",
		"/_|__|___\\___",
		"|_  _____  __|",
		"   0      0"
	};	
   }

}
