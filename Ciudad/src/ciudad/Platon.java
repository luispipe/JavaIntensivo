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
public class Platon extends Carga{
    //Constructor
    public Platon(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros, peso);
	filaCarga = 1;
	imagen = new String[] {
		"       __",
		" _____|__\\___",
		"|_   ___   __|",
		"   O     O"
	};	
    }
    
    //Metodos
    @Override
    public boolean llevar( int p) {
	boolean lolleva = super.llevar(p);
	if( lolleva ) {
	    String laCarga = this.carga.toString();
	    String cargaInvertida = "";
	    for(int i=laCarga.length()-1; i>=0; i--) {
		cargaInvertida += laCarga.charAt(i);  
	    }
	    this.carga = cargaInvertida;
	    imagenCarga();
	}
	return lolleva;
    }


}
