/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triki;

import java.util.Scanner;

/**
 *
 * @author usuario1
 */
public class Triki {

    // static para definir global 
    
    static Scanner teclado= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugar();
    }
    
    public static void jugar (){
        
        char J1= 'X';
        char J2= 'O';
        char vacio= '-';
        
        boolean turno = true;
        
        char tablero [][]=new char [3][3];
        
        rellenarTablero(tablero,vacio);
        
        int fila, columna;
        
        boolean posValida, correcto;
        

        while(!finPartida(tablero,vacio)){
                
            
            
            do{
                
            mostrarTurnoActual(turno);
            mostrarTablero(tablero);
            
            correcto=false;
            fila = pedirInteger("ingrese la fila");
            columna= pedirInteger("ingrese la columna");
            
            posValida= validarPosicion(tablero,fila,columna);
            
            if(posValida){
            
                if (!hayValorPosicion(tablero,fila,columna,vacio)){
                    correcto=true;
                }else{
                    System.out.println("Ya esta marcada esa posición, elige otra");
                } 
            }
            else{
                System.out.println("La posición no es valida");
            }
            
            }while(!correcto);
            
            if (turno){
                insertarEn(tablero,fila,columna,J1);
            }else{
                insertarEn(tablero,fila,columna,J2);
            }
            
            
            turno=!turno;
        }
    
        mostrarTablero(tablero);
        //mostrarGanador(tablero,J1,J2,vacio);
        
    
    }
    //Omitir Void (error)
    public static void insertarEn(char [][]tablero, int fila, int columna, char simbolo){
    
        tablero[fila][columna]= simbolo;
    }
    
    public static void mostrarGanador(char[][]tablero, char J1, char J2, char defecto){
        char simbolo= coincidenciaLinea(tablero,defecto);
        if(simbolo != defecto){
        
            if(simbolo==J1){
                System.out.println("a ganado el Jugador 1");
            }
            else{
                System.out.println("a ganado el Jugador 2");
            }
            return;
        }
        
        simbolo= coincidenciaColumna(tablero,defecto);
        if(simbolo != defecto){
        
            if(simbolo==J1){
                System.out.println("a ganado el Jugador 1");
            }
            else{
                System.out.println("a ganado el Jugador 2");
            }
            return;

        }
        
        simbolo= coincidenciaDiagonal(tablero,defecto);
        if(simbolo != defecto){
        
            if(simbolo==J1){
                System.out.println("a ganado el Jugador 1");
            }
            else{
                System.out.println("a ganado el Jugador 2");
            }
            return;

        }
        
        System.out.println("Hay empate");
        
    }
    
    public static void mostrarTurnoActual(boolean turno){
    
        if(turno){
            System.out.println("Le toca al Judador 1");
        }else{
            System.out.println("Le toca al Judador 2");
        }
    }
    
    public static int pedirInteger(String mensaje){
    
        System.out.println(mensaje);
        int numero= teclado.nextInt();
        return numero;
    }
    
    public static void rellenarTablero(char[][]tablero,char simbolo){
    
        for (int i=0; i< tablero.length;i++){
            for(int j=0;j<tablero.length;j++){
                    tablero [i][j]= simbolo;
            }
            
        }
    
    }
    
    public static boolean validarPosicion(char [][] tablero, int fila,int columna){
    
        if(fila>=0 && fila<tablero.length && columna >=0 && columna<tablero.length){
            return true;
        }else{
            return false;
        }
        
        
        //return (fila>=0 && fila<tablero.length && columna >=0 && columna<tablero.length)?true:false;
    
    }
    
    public static boolean hayValorPosicion(char [][] tablero, int fila, int columna, char simbolo){
        
        /*if (tablero [fila][columna]>0){
            return true;
        }
        return false;*/
        
        return (tablero[fila][columna]!=simbolo)?true:false;
        
    }
    
        
    //poner , en vez de ; ERROR
    public static void mostrarTablero(char [][]tablero){
        for (int i=0; i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++ ){
                    System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
        
    
    }
    
    public static boolean tableroLleno(char[][] tablero, char simboloDef){
    
        for (int i=0; i< tablero.length;i++){
            for(int j=0;j< tablero.length;j++ ){
                if(tablero[i][j]==simboloDef){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean finPartida(char [][]tablero, char simboloDef){
    /*
        if(tableroLleno(tablero, simboloDef)&& coincidenciaLinea(tablero,simboloDef)!= simboloDef && 
                coincidenciaColumna(tablero,simboloDef)!= simboloDef &&coincidenciaDiagonal(tablero,simboloDef){
            return true;
            
        }
    
        return false;*/
    
    //Error And en vez de OR
        return (tableroLleno(tablero, simboloDef)|| coincidenciaLinea(tablero,simboloDef)!= simboloDef || 
                coincidenciaColumna(tablero,simboloDef)!= simboloDef ||
                coincidenciaDiagonal(tablero,simboloDef) != simboloDef)?true:false;
    }
    
    public static char coincidenciaLinea(char[][] tablero,char simboloDef){
        
        char simbolo;
        boolean coincidencia;
        for(int i=0; i<tablero.length;i++){
            coincidencia=true;
            simbolo= tablero[i][0];
            if(simbolo!=simboloDef){
                for(int j=1; j< tablero.length;j++){
                  if(simbolo != tablero[i][j]){
                      coincidencia=false;
                  }  
            
                }
            }
            if(coincidencia){
                return simbolo;
            }
        }
        
        return simboloDef;
    }
    
    public static char coincidenciaColumna(char[][] tablero,char simboloDef){
        char simbolo;
        boolean coincidencia;
        for(int j=0; j<tablero.length;j++){
            coincidencia=true;
            simbolo= tablero[0][j];
            if(simbolo!=simboloDef){
                for(int i=1; i< tablero.length;i++){
                  if(simbolo != tablero[i][j]){
                      coincidencia=false;
                  }  
            
                }
            }
            if(coincidencia){
                return simbolo;
            }
        }
        
        return simboloDef;
    }
    
    public static char coincidenciaDiagonal(char[][] tablero,char simboloDef){
        char simbolo;
        boolean coincidencia=true;
        //Diagonal principal
        //if para evitar bucle
        simbolo= tablero[0][0];
        if(simbolo!=simboloDef){
            for(int i=0;i<tablero.length;i++){
               if(simbolo!=tablero[i][i]){
                   coincidencia= false;
               }
            }
            if(coincidencia){
                return simbolo;
            }
        }
        
        //Diagonal inversa
        simbolo= tablero[0][2];
        if(simbolo!=simboloDef){
            for(int i=0, j=1;i<tablero.length;i++,j--){
               if(simbolo!=tablero[i][j]){
                   coincidencia= false;
               }
            }
            if(coincidencia){
                return simbolo;
            }
        }
        
        return simboloDef;
        
    }
    
    
}
