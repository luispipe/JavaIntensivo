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
public class Posicion {
    //Atributos
    public int fila;
    public int columna;
    
    private int nuevaFila;
    private int nuevaColumna;

    //Constructor
    public Posicion() {
	this.fila = (int)(Math.random()*ParametrosDibujo.ALTO)+1;
	this.columna = (int)(Math.random()*ParametrosDibujo.ANCHO)+1;
    }
    
    public Posicion( int fila, int columna ) {
	this.fila = fila;
	this.columna = columna;
    }

    
    //Metodos
    public void cambiar( int cambio_fila, int cambio_columna ) { 
	
        nuevaFila= this.fila + cambio_fila;
        this.fila = nuevaFila<0 ? ParametrosDibujo.ALTO + cambio_fila:nuevaFila;
        nuevaColumna= this.columna + cambio_columna;
	this.columna += nuevaColumna<0 ? ParametrosDibujo.ANCHO + cambio_fila:nuevaColumna;
    }


    
}
