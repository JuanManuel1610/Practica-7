/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4sa21juanp7;
import informacion.datos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class G4sa21Juanp7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<datos>listadatos=new ArrayList<datos>();
        datos objdatos= new datos("juan ",20, "j@gmail.com");
        listadatos.add(objdatos);
        objdatos = new datos();
        
        objdatos.setNombre("juan");
        objdatos.setEdad(20);
        objdatos.setCorreo("juan@gmail.com");
        listadatos.add(objdatos);
        objdatos = new datos("Dulce ciaca", 18, "dulce@gmail.com");
        listadatos.add(objdatos);
        
        for(datos datos : listadatos){
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        System.out.println("usando foreach");
        System.out.println("--------------------------------------");
        
        listadatos.forEach(datos->{
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        });
        
        System.out.println("--------------------------------------");
        System.out.println("usando stream foreach");
        System.out.println("--------------------------------------");
        
        listadatos.stream().forEach(datos->{
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        });
    }
    
}
