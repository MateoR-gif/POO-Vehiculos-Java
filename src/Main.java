import interfaces.Conducible;
import model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Conducible[] vehiculos = new Conducible[2];
        vehiculos[0] = new Coche("BMW", "2020", 2019,1500);
        vehiculos[1] = new Moto("Suzuki", "2021", 2019, 150);

        for(Conducible v : vehiculos){
            v.conducir();
        }

        vehiculos[0].añadirModificacion("Alerones");
        vehiculos[1].añadirModificacion("Exploradoras");
        
        vehiculos[0].explotar();
    }
}