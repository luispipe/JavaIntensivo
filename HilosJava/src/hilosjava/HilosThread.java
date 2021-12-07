/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosjava;

/**
 *
 * @author usuario1
 */
public class HilosThread extends Thread{
    
    String nombre;
    
    public HilosThread(String nombre){
        this.nombre=nombre;
    }
    
    @Override
    public void run(){
        System.out.println("Comenzando"+nombre);
        try{
            for(int i=0; i<10;i++){
                Thread.sleep(400);
                System.out.println("En"+nombre+", el recuento "+ i);
            }
        }
        catch(InterruptedException exc){
            System.out.println(nombre+" Interrumpido.");
        }
        System.out.println("Terminado"+nombre);
    }
    
    }
    

