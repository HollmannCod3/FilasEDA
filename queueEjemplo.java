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
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Nicolas");
        fila.add("Enzo");
        fila.add("Alexis");
                
        System.out.println(fila.poll());
        
        System.out.println(fila.poll());
        
        System.out.println(fila.poll());
        
        System.out.println(fila.isEmpty());
        
    }
    
}
