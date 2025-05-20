/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizajejava;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class AprendizajeJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  entrada = new Scanner (System.in, "ISO-8859-1");
        int edad;
        String nombre;
        String apellido;
        System.out.println("HOLA");
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.next();
        System.out.println("Y tu apellido");
        apellido = entrada.next();
        System.out.println("DIGITA TU EDAD");
        edad = entrada.nextInt();
        int decada = edad - 10;
        System.out.println(nombre + ' ' + apellido + " tu edad es: " + edad);        // TODO code application logic here
        System.out.println("Hace una decada tenias " + decada);
        double radio, pi, area;
        pi = 3.1416;
        System.out.println("ingresa el radio");
        radio = entrada.nextInt();
        area = pi*radio*radio;
        System.out.println("el area del circulo es "+ area);
    }
    
}
