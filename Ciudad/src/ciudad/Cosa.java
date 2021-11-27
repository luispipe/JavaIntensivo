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
public class Cosa {
    //Atributos
    protected Posicion posicion;
    protected String[] imagen;
    
    //Constructor
    public Cosa( Posicion posicion ) {
	this.posicion = posicion;
    }

    //Metodos
    public Posicion posicion() { return posicion; }

    public void pintar( char[][] mapa ) {
	for( int i=0; i<imagen.length; i++) {
	    for( int j=0; j<imagen[i].length(); j++) {
		int f = (this.posicion.fila+i+mapa.length) % mapa.length;
		int c = (this.posicion.columna+j+mapa[i].length) % mapa[i].length; 
/**Acá*/		mapa[f][c] = imagen[i].charAt(j);
	    }
	}
    }



}
