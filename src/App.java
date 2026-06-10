import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 
public class App {
    public static void main(String[] args) throws Exception {
        runLinkList();
 
        runQueue();
 
        runStack();
 
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String textoInvertido = ejercicio1.invertString(texto);
        System.out.println(textoInvertido);
    }
 
    private static void runStack() {
        // Stack<String> pila = new Stack<>();
        ArrayDeque<String> pila = new ArrayDeque<>();
 
        pila.push("Jose");
        pila.push("Adnres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");
 
        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
 
        System.out.println(pila.peek()); // Maria2
        System.out.println(pila.size()); // 5
 
        System.out.println(pila.pop()); // Maria2 SALIO
        System.out.println(pila.size()); // 4
 
        while (!pila.isEmpty()) {
            String cliente = pila.pop();
            System.out.println("Sale -> " + cliente);
        }
        System.out.println(pila.size()); // 0
 
    }
 
    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
 
        System.out.println(cola.isEmpty());
        System.out.println(cola.peek()); // -> "Jose"
        System.out.println(cola.size()); // -> 3
        System.out.println(cola.poll()); // -> "Jose" saca
        System.out.println(cola.size()); // -> 2 [Andres, Ana]
 
        // [] isEmpty -> true
        while (!cola.isEmpty()) { // !true = false
            String cliente = cola.poll(); // -> "Ana" saca | cliente="Ana"
            System.out.println("Atendi a " + cliente); // -> "Atendi a Ana"
        }
 
    }
 
    private static void runLinkList() {
        LinkedList<String> nombres = new LinkedList<>();
        ArrayList<String> nombres2 = new ArrayList<>();
 
        nombres.add("Juan");
        nombres.add("pedro");
        nombres.add("Maria");
        nombres.add("Diago");
        nombres.add("Mateo ");
        // size =5
 
        String primero = nombres.getFirst();
        System.out.println(primero);
        System.out.println(nombres.getFirst());
 
        System.out.println(nombres.get(4)); // O(n) o O(1)
 
        System.out.println(nombres.getLast());
        System.out.println(nombres.get(nombres.size() - 1));
 
        System.out.println(nombres.pop());
        System.err.println(nombres.size()); // 4
 
    }
 
}