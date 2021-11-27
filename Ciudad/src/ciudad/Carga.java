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
public class Carga extends Vehiculo{
    //Atributos
    protected int capacidad;
    protected Object carga;
    protected int filaCarga;

    //Contructor
    public Carga(Posicion posicion, int pasajeros, int peso) {
	super(posicion, pasajeros);
	this.capacidad = peso>5?5:peso;
	this.carga = "___";
   }
    
    //Metodos
    protected void imagenCarga() {
       String laCarga = imagen[filaCarga].charAt(0) +
	       		this.carga.toString();
       int n = 6-laCarga.length();
       for( int i=0; i<n; i++ ) {
	   laCarga += '_';
       }
       laCarga+="|__\\___";
       imagen[filaCarga] = laCarga;   
   } 
    
    public boolean llevar( int p) {
	int k = 1;
	for( int i=0; i<this.capacidad; i++) {
	    k *=10;
	}
	if( p < k ) {
	    this.carga = p;
	    imagenCarga();
	    return true;
	}else {
	    return false;
	}
    }
    
    public boolean llevar( String p ) {
	if( p.length() <= this.capacidad ) {
	    this.carga = p;
	    imagenCarga();
	    return true;
	}else {
	    return false;
	}
    }



}
