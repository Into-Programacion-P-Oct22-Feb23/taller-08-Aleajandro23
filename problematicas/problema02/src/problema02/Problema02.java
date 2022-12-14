// Genere una solución en lenguaje java que dé como salida
// números en orden invertido del 25 al 1.

package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ruben Condoy
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero = 25;
        int numero2;
        int numero3;
        int numero4;       
        String mensaje = "";
        
        mensaje = mensaje + "Nº"+"\t"+"x2"+"\t"+"x3"+"\t"+"x4"+"\n";
        for(int num = 25; num >= 1; num--){
            numero2 = numero * 2;
            numero3 = numero * 3;
            numero4 = numero * 4;
            
            mensaje = mensaje + numero + "\t" + numero2 + "\t" + numero3 
                    + "\t" + numero4 +"\n";
            numero --;
            numero2 --;
            numero3 --;
            numero4 --;
            }
        System.out.println(mensaje);
        }
        
         
         
         
                
    }
    

