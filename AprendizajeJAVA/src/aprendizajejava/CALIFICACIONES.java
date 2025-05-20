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
public class CALIFICACIONES {
            public static void main(String[] args) {
           Scanner  input = new Scanner (System.in, "ISO-8859-1");
           int seguir = 1;
           System.out.println("BIENVENIDO AL SISTEMA DE CALIFICACIÓN COOMULSAP");
           while (seguir == 1){
                System.out.println("Porfavor ingresa la nota a evaluar:");
                int nota;
                nota = input.nextInt();
                if (nota >= 1 && nota < 70){
                    System.out.println("Nota Baja");
                }else if (nota>=70 && nota < 80){
                    System.out.println("Nota Basica");
                }else if (nota >=80 && nota < 94){
                    System.out.println("Nota Alta");
                }else if (nota>= 94 && nota <= 100){
                    System.out.println("Nota Superior");
                }else {
                    System.out.println("Ingresa una nota valida");
                }
                System.out.println("Desea seguir evaluando notas : 1=si: 2=no");
                seguir = input.nextInt();
            }}
}
