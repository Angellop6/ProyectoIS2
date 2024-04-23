/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Errores;

import java.io.IOException;

/**
 *
 * @author Mayra
 */
public class PruebaErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String cadena= "803ertrt2";
        int a = Lectura.Leercvv(cadena);
        if (a == 1){
            
            System.out.println(cadena);        
        }else{
            System.out.println("la cadena no es valida");
        }
        
        
    }
    
}
