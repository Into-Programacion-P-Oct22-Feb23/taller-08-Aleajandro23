// Generar una solución que permita ingresar jugadores de fútbol; por cada 
// jugador se debe solicitar:

// Nombre el jugador
// Posición en el campo de juego
// Edad
// Estatura
package problema01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Ruben Condoy
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String name;
        int edad;
        double estatura;
        String posicion;
        int veces;
        String mensaje = "";
        int suma = 0;
        double promedio =0;
        String edades = "";
        
        System.out.println("Ingrese la cantidad de veces");
        veces = entrada.nextInt();
        
        mensaje = mensaje + "Listado de Jugadores:" + "\n\n";
        
        for(int i = 1; i <= veces; i++){
            entrada.nextLine();
            System.out.println("Ingrese el nombre");
            name = entrada.nextLine();
            
            mensaje = mensaje + i +". "+ name;
            
            System.out.println("Ingrese la posicion");
            posicion = entrada.nextLine();
            
            mensaje = mensaje + " -" + posicion + "-, ";
                    
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            
            mensaje = mensaje  + "edad "  + edad + ", ";
                    
            System.out.println("Ingrese la estatura");
            estatura = entrada.nextDouble();
            
            mensaje = mensaje  +  "estatura "+ estatura +"\n";
            
            suma = suma + edad;
            suma = suma / veces;
            
            promedio = promedio + estatura;
            promedio = promedio / veces;
            edades = edades +", "+ edad;
            
             mensaje = mensaje + " Listado de Edades:"+ edades + "\n"
                     + "Promedio de edades:"+ suma + "\n"
                     + "Promedio de Estaturas:" + promedio +"\n";
        }
          System.out.println(mensaje);  
    }
    
}
