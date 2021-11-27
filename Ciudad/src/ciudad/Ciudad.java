/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

import java.util.List;

/**
 *
 * @author usuario1
 */
public class Ciudad {

    //Atributos
    protected List<Vehiculo> listaVehiculos;
    protected List<Sitio> listaSitios;
    protected char[][] mapa;

    //Contructor
    public Ciudad( List<Vehiculo> listaVehiculos, List<Sitio> listaSitios ) {
	this.listaVehiculos = listaVehiculos;
	this.listaSitios = listaSitios;
	mapa = new char[ParametrosDibujo.ALTO][ParametrosDibujo.ANCHO];
	for( int i=0; i<mapa.length; i++ ) {
	    for( int j=0; j<mapa[i].length; j++ ) {
		mapa[i][j] = ' ';
	    }
	}
    }

    //Metodos
    public void mover() {
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
                int f = Math.random() > 0.5 ? 1 : -1;
                int c = 1;
                vehiculo.mover(f, c);
            }
        }
    }

    public void moverReversa() {
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
                int f = Math.random() > 0.5 ? 1 : -1;
                int c = -1;
                vehiculo.mover(f, c);
            }
        }
    }

    
    public String pintar() {
        String lienzoMapa = "";
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = ' ';
            }
        }

        if (listaSitios != null) {
            for(Sitio sitio: listaSitios){
                sitio.pintar(mapa);
            }
        }
        
        if (listaVehiculos != null) {
            for(Vehiculo vehiculo: listaVehiculos){
/**Acá*/                vehiculo.pintar(mapa);  
            }
        }

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                lienzoMapa += mapa[i][j];
            }
            lienzoMapa += "\n";
        }

        return lienzoMapa;
    }


    
    
    

    
    
}
