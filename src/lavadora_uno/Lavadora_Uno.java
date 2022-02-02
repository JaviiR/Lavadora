
package lavadora_uno;
import Libreria.Lavadora;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("La ropa es blanca o de color?");
        System.out.println("1: Ropa Blanca");
        System.out.println("2: Ropa De Color");
        int TipoDeRopa=entrada.nextInt();
        
        System.out.println("Cuantos kilos de ropa?");
        int kilos=entrada.nextInt();
        
        Lavadora objLavadora=new Lavadora(kilos, TipoDeRopa);
        objLavadora.CicloFinalizado();
        
        
        
        
        
    }
}
