/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author maria
 */
public class Trigo {
    //------------------------------
    // Atributos
    //------------------------------
    public static final String ICONO ="/img/trigo.png";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
    public static final int RIEGO =10;
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int riego;
    

    //--------------------------
    // Constructores
    // -------------------------
    
    
    public Trigo(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int riego){
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.riego = riego; 
    }

    public Trigo() {
        this(ICONO, DURACION,EXPERIENCIA,PRECIO_VENTA, RIEGO);
    }
    
     public Trigo(Trigo otro){
        this(otro.ICONO, otro.DURACION,otro.EXPERIENCIA,otro.PRECIO_VENTA, otro.RIEGO);
        
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    
    public int getduracionProduccion(){
        return duracionProduccion;
    }
    
    public void setduracionProduccion(int duracionProduccion){
        this.duracionProduccion = duracionProduccion;
    }
    
    public int getexperienciaRecolecta(){
        return experienciaRecolecta;
    }
    
    public void setexperienciaRecoecta (int experienciaRecolecta){
        this.experienciaRecolecta = experienciaRecolecta;
    }
    
    public int getprecioVenta(){
        return precioVenta;
    }
    
    public void setprecioVenta(int precioVenta){
        this.precioVenta = precioVenta;
    }
    
    public int getriego(){
        return riego;
    }
    
    public void setriego(int riego){
        this.riego = riego;
    }
    
     
    
    
}