package ejecutable;
import modelo.Animal;
import modelo.Vaca;
import modelo.Serpiente;
import modelo.Gato;

public class Test {
    public static void main(String[] args) {
        Gato Chazzy = new Gato();
        Animal animal = new Vaca();
        Serpiente serpiente = new Serpiente();

        System.out.println("Chazzy el michi dice: " + Chazzy.hablar());
        System.out.println("Viejo pirujo: " + animal.hallar());
        System.out.println("La serpiente me comentó que este programa está: " + serpiente.hablar());

    }
    
}
