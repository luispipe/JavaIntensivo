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
public class HilosJava implements Runnable{

   Thread hilo;
   
   HilosJava(String nombreHilo){
       this.hilo=new Thread(this,nombreHilo);
   }
   
   //Metodo estatico que crea e inicia el hilo
   public static HilosJava crearEIniciar(String nombre){
       HilosJava hilo= new HilosJava(nombre);
       hilo.hilo.start();
       return hilo;
   }
   
   
   //Punto de entrada de los hilos, donde los hilos empiezan a ejecutarse

    @Override
    public void run() {
        System.out.println("Comenzando"+hilo.getName());
        try{
            for(int i=0; i<10;i++){
                Thread.sleep(400);
                System.out.println("En"+hilo.getName()+", el recuento "+ i);
            }
        }
        catch(InterruptedException exc){
            System.out.println(hilo.getName()+" Interrumpido.");
        }
        System.out.println("Terminado"+hilo.getName());
    }
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hilo principal iniciando.");
        
        //Contruir objeto
        HilosJava hj= HilosJava.crearEIniciar("#1");        
        HilosJava hj2= HilosJava.crearEIniciar("#2");
        HilosJava hj3= HilosJava.crearEIniciar("#3");
     
        
    }
    
}
