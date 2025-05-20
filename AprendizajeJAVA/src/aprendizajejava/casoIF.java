/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizajejava;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class casoIF {
        public static void main(String[] args) {
            int edad;
            Scanner  input = new Scanner (System.in, "ISO-8859-1");
            System.out.println("Ingresa tu edad:");
            edad = input.nextInt();
            if (edad >= 18 && edad < 30){
               System.out.println("Eres un joven");
            } 
            if (edad >= 0 && edad < 18){
                System.out.println("Eres menor");
            }if (edad >=30 ){
              System.out.println("eres un adulto");       
            }else {
                System.out.println("Digita una edad valida");
            }
    
         
            
        }
    
}
