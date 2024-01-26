package Utiles;

public class ControlDeExcepciones {

    public ControlDeExcepciones() {
    }

    public boolean esUnNumero(String texto) {
        return texto.matches("[1-9]\\d*");
    }
    public boolean estaVacio(String texto) {
        return texto.isEmpty();
    }
    
    
}
