///
package filastpeda4_1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hollmann
 */
public class queueEjemplo {

   
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
            
            System.out.println("Cola original: " + fila);

           fila1.Invertir(fila);

        System.out.println("Cola invertida: " + fila);
        
    }
    
}
