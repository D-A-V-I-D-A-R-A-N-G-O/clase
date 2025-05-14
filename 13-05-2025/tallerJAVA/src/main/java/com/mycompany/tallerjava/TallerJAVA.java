/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerjava;
import java.util.Scanner;
/**
 *
 * @author peewee
 */
public class TallerJAVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1");
         int seguir = 1;
        System.out.println("Hola Usuario, selecciona el numero de alguna de las opciones para operar");
        while (seguir==1){
        double num1, num2 ;
        int operador;
        System.out.println("1-suma:2-resta:3-multiplicar:4-dividir:5-mayor igual o menor que");
        operador = entrada.nextInt();
        System.out.println("ingresa los 2 numeros a operar");
        num1= entrada.nextInt();
        num2= entrada.nextInt();
        switch (operador){
            case 1 :
                               System.out.println("El resultado es: " + (num1+num2));

            break;
            case 2 :
                               System.out.println("El resultado es: " + (num1-num2));

            break;
            case 3 :
                               System.out.println("El resultado es: " + (num1*num2));

            break;
            case 4 :
                if(num2 == 0){
                    System.out.println("Esta división no es posible, ingresa un numero divisor diferente del 0");
                }else{
                                                   System.out.println("El resultado es: " + (num1/num2));
                }
            break;
            case 5:
                if(num1 == num2){
                    System.out.println("son iguales");
                }
                if(num1 > num2){
                    System.out.println("El "+ num1 + " es mayor que el "+ num2);
                }else {
                    System.out.println("El " + num2 + " es mayor que el "+ num1);
                }
                break;
            default:
                System.out.println("repite el programa e ingresa un numero u operador valido");
        }
            System.out.println("¿Quieres seguir operando numeros?: 1-si, 2-no");
            seguir = entrada.nextInt();
        }
        System.out.println("Gracias por hacer uso del programa");
        
    }
}
