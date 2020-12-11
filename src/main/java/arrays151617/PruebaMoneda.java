package arrays151617;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class PruebaMoneda {

    public static void main(String[] args) {

        LanzarMoneda monedas = new LanzarMoneda(500);

        monedas.llenarArray();
        System.out.println("Hay " + monedas.caras() + " caras y " + monedas.cruces() + " cruces.");
        monedas.imprimir();        
    }
}
    