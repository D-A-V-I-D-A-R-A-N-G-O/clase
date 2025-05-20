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
public class gustosmusicales {
        public static void main(String[] args) {
        Scanner  input = new Scanner (System.in, "ISO-8859-1");
            System.out.println("Bienvenido al bar de Leopoldo");
            System.out.println("Escoje el tipo de musica que te gusta");
            
            System.out.println("1-BALADAS ROMANTICAS, 2-MUSICA DE ANTAÑO, 3- EN INGLES, 4- REGGAETON");
            int tipo = input.nextInt();
                            String lista;
            System.out.println("Las canciones disponibles para esta noche son ");

            switch(tipo){
                case 1:
                      lista = "Volvere, Perdoname, Jamas, Melina, Cama y mesa, Concavo y convexo";
                                  System.out.println(lista);

                    break;
                case 2:
                     lista = "Mi viejo, Camino Viejo, Las acacias, Pueblito viejo";
                                 System.out.println(lista);

                    break;
                case 3:
                    lista = "Billie jean, Queen, Baby, Sugar";
                                System.out.println(lista);

                    break;
                case 4 :
                    lista = "Aca no hay de esa basura";
                                System.out.println(lista);

                    break;
                default: 
                    System.out.println("Selecciona una opcion valida");
                    break;
                   
            }
        }
}
