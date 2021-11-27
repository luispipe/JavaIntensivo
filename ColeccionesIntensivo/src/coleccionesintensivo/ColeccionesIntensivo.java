/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesintensivo;

import java.util.ArrayList;

/**
 *
 * @author usuario1
 */
public class ColeccionesIntensivo {

    /**
     * @param args the command line arguments
     */
    public static void comparar(ArrayList<Integer>x,ArrayList<Integer>y){
        ArrayList<Integer> iguales= new ArrayList<>();
        
            for(int j=0; j<y.size();j++){
                if(x.contains(y.get(j)))
                {
                    iguales.add(y.get(j));
                }
            
        }
        System.out.println(x.size()+" -- "+y.size());
        System.out.println("Estos son los valores iguales: " +iguales);
    }
    
    
    public static void main(String[] args) {
        
        int [] x ={5,6,2,1,4,3,7,9,10,17,8,20}; 
        int []y= {2,5,7,9,10,11,15,16,1,20};
        
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();

        for(int i=0; i<x.length;i++){
            list1.add(x[i]);
        }
        for(int i=0; i<y.length;i++){
            list2.add(y[i]);
        }
        
        comparar(list1,list2);
      
    }
    
}
