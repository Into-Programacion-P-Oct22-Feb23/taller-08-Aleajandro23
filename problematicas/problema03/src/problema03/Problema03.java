/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Olga Cabrera
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int n;
        double centigrados;
        double fahrenheit = 20; 
        String mensaje = "";
        
        mensaje = mensaje + "F\tCº\n";
        
        for(int i = 1; i <= 20; i++){
            centigrados = (fahrenheit - 32) * 5 / 9;
             mensaje = mensaje + fahrenheit + "\t"+ centigrados + "\n";
             fahrenheit +=4;
        }
        System.out.println(mensaje);
    }
    
}


