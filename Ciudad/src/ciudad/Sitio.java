/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

/**
 *
 * @author usuario1
 */
public class Sitio extends Cosa{
    public Sitio(Posicion posicion) {
	super(posicion);
	imagen = new String[] {
	    "     __________",	
	    "    /          \\",	
	    "   /            \\",	
	    "   |            |",	
	    "   |            |",	
	    "   |____________|"	
	};
    }
}