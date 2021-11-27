/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriointensivo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario1
 */
public class DirectorioIntensivo {

    public String nombre;
    List<DirectorioIntensivo> subdirs;
    List<String> archivos;
    DirectorioIntensivo(String nombre){
        this.nombre= nombre;
        this.subdirs= new ArrayList<DirectorioIntensivo>();
        this.archivos= new ArrayList<String>();
    }
    public String espacios(int nivel){
    
            String s= "";
            for(int i=0;i<nivel; i++){s+=' ';}
            return s;
    }
    
    String toString(int nivel){
        String s= espacios(nivel)+nombre+'\n';
        for(DirectorioIntensivo i:subdirs)
            s+=i.toString(nivel+1)+ '\n';
        for (String j: archivos)
            s+=espacios(nivel+1)+j+'\n';
        return s;
    }
    
    public String toString(){ return this.toString(0);}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DirectorioIntensivo root= new DirectorioIntensivo("root");
        //Primer nivel
        root.subdirs.add(new DirectorioIntensivo("bin"));
        root.subdirs.add(new DirectorioIntensivo("home"));
        root.subdirs.add(new DirectorioIntensivo("lib"));
        
        // Segundo nivel
        root.subdirs.get(2).subdirs.add(new DirectorioIntensivo ("will"));
        root.subdirs.get(2).subdirs.get(0).subdirs.add(new DirectorioIntensivo("win"));
        
        System.out.println(root);
        
        
    }
    
}
