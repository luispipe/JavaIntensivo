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
public class Furgon extends Carga {
    //Constructor
    public Furgon(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros, peso);
	filaCarga = 2;
	imagen = new String[] {
		" _____",
		"|     |__",
		"|_____|__\\___",
		"|_   ___   __|",
		"   O     O"
	};	
    }

}
