/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aprendizajejava;
import java.util.Scanner;
/**
 *
 * @author peewee
 */
public class genero {
        public static void main(String[] args) {

    Scanner  entrada = new Scanner (System.in, "ISO-8859-1");
    int genero;
            System.out.println("ingresa tu genero, 1=Hombre 2=Mujer");
            genero = entrada.nextInt();
            
            if(genero==1){
                System.out.println("Chamo sos un hombre");
            }else{
                if(genero == 2){
                System.out.println("chama sos mujer");
                }else{
                    System.out.println("selecciona una opcion valida");
                }
                }
        }
    
}
