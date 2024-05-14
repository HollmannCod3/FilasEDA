
package filastpeda4_1;


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Hollmann
 */
public class Fila {
    

    public Fila() {
    }
    
    public void Invertir(Queue<Integer> cola) {
        if (cola.isEmpty() || cola.size() == 1) {
            return; // Caso base: cola vacía o con un solo elemento, no hay nada que invertir
        }

        // Extraemos el primer elemento de la cola
        int temp = cola.poll();

        // Llamamos recursivamente al método para invertir el resto de la cola
        Invertir(cola);

        // Al regresar de la recursión, agregamos el primer elemento al final de la cola
        cola.add(temp);
    }
    
    public boolean EncontrarX(Queue<Integer> cola, int x){
        
       Queue<Integer> filaAuxiliar = new LinkedList<>(cola);

        // Buscamos el elemento X en la cola auxiliar
        while (!filaAuxiliar.isEmpty()) {
            if (filaAuxiliar.peek() == x) {
                return true; // Se encontró el elemento
            }
            filaAuxiliar.poll();
        }

        return false; // No se encontró el elemento
    }     
 }
    

