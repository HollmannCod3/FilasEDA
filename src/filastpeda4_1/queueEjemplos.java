/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filastpeda4_1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hollmann
 */
public class queueEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Queue<Integer> fila = new LinkedList<>();
//        
//        fila.add("Nicolas");
//        fila.add("Enzo");
//        fila.add("Alexis");
//                
//        System.out.println(fila.poll());
//        
//        System.out.println(fila.poll());
//        
//        System.out.println(fila.poll());
//        
//        System.out.println(fila.isEmpty());
           Fila fila1 = new Fila();

            fila.add(1);
            fila.add(2);
            fila.add(3);
            fila.add(4);
            
            int numeroBuscado = 5;
            
            boolean result = fila1.EncontrarX(fila, numeroBuscado);
            String mensaje1;
            if (result){
                mensaje1= "Verdadero, se encuentra en la fila";
            }else{
               mensaje1 = "Falso, no se encuentra en la fila";
            }

        System.out.println("Fila original: " + fila);
        System.out.println("El numero: " + numeroBuscado + ", esta en la Fila? ");
        System.out.println(mensaje1);
        System.out.println("Fila al final: " + fila);
           
            
//            System.out.println("fila original: " + fila);
//
//           fila1.Invertir(fila);
//
//        System.out.println("fila invertida: " + fila);

            
    }
    
}
