import com.vehiculo.*;

public class App {
    public static void main(String[] args) throws Exception {
        coche coche = new coche();

        coche.setMarca("Audi");
        coche.setModelo("A3");
        coche.setVelocidad(0);
        coche.setVelocidadMaxima(180);

        System.out.println("Marca del coche: " + coche.getMarca());
        System.out.println("Modelo del coche: " + coche.getModelo());
    }
}
