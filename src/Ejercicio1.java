import java.util.ArrayDeque;
 
public class Ejercicio1 {
 
    ///
    /// Metodo que devuleve una cadena de
    /// texto invertida
    /// texto -> COMPUTACION
    /// return -> NOICATUPMOC
    /// USANDO SOLO PILAS
    public String invertString(String texto) {
 
        // Stack;
        ArrayDeque<Character> pila = new ArrayDeque<>();
 
        // for (int i = 0; i < texto.length(); i++) {
        // pila.push(texto.charAt(i)); // (5) COMPUTACION O(N)
        // } // O(n^2)
 
        // texto.toCharArray(); //[C, O, M, T]. [5] =T O(1)
 
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        } // O(n)
 
        String invertido = "";
 
        while (!pila.isEmpty()) {
            char letra = pila.pop();
            invertido += letra;
        }
 
        return invertido;
    }
}
 