/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria2;

/**
 *
 * @author Cetecom
 */
public class Pizzeria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
        Pizza pizza1 = new Pizza("Tres Carnes","Fina","Familiar");
        Pizza pizza2 = new Pizza("Italiana","Gruesa","Individual");
        Pizza pizza3 = new Pizza();
        
        
        System.out.println("Nombre: "+pizza1.getNombre());
        System.out.println("Masa: "+pizza1.getMasa());
        System.out.println("Tamano: "+pizza1.getTamanno());
        System.out.println("------------------");
        System.out.println("Nombre: "+pizza2.getNombre());
        System.out.println("Masa: "+pizza2.getMasa());
        System.out.println("Tamano: "+pizza2.getTamanno());
        
        pizza1.setNombre("Especial");
        
        System.out.println("------------------");
        System.out.println("Nombre: "+pizza1.getNombre());
        System.out.println("Masa: "+pizza1.getMasa());
        System.out.println("Tamano: "+pizza1.getTamanno());
        
        
        System.out.println("------------------");
        System.out.println("Nombre: "+pizza3.getNombre());
        System.out.println("Masa: "+pizza3.getMasa());
        System.out.println("Tamano: "+pizza3.getTamanno());
    }
    
}
