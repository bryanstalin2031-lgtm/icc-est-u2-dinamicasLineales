

import java.util.ArrayDeque;

public class Ejercicio2 {

    public boolean esPalindromo(String texto) {
  
        ArrayDeque<Character> pila = new ArrayDeque<>();
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }
        String invertido = "";
        while (!pila.isEmpty()) {
            char letra = pila.pop();
            invertido += letra;
        }
        if (texto.equals(invertido)) {
            return true;
        } else {
            return false;
        }
    }
}