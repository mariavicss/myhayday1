/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myhayday;
import modelos.Trigo;

/**
 *
 * @author maria
 */
public class MyHayDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trigo trigo= new Trigo("HOLA", 10, 5, 2, 1);
        
        System.out.println(trigo.getduracionProduccion());
        System.out.println(trigo.getIcono());
        System.out.println(trigo.getexperienciaRecolecta());
        System.out.println(trigo.getprecioVenta());
        System.out.println(trigo.getriego());
        
        Trigo trigo1 = new Trigo();
        
        Trigo trigo2 = new Trigo(trigo);
        
        System.out.println(trigo1.getduracionProduccion());
        System.out.println(trigo1.getIcono());
        System.out.println(trigo1.getexperienciaRecolecta());
        System.out.println(trigo1.getprecioVenta());
        System.out.println(trigo1.getriego());
        
        
        System.out.println(trigo2.getduracionProduccion());
        System.out.println(trigo2.getIcono());
        System.out.println(trigo2.getexperienciaRecolecta());
        System.out.println(trigo2.getprecioVenta());
        System.out.println(trigo2.getriego());
        
        
        
    }
    
}
