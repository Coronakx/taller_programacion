/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio1extra;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
                // Ejercicio 5 extra
        // Calcular descuento en tratamientos
        string tipo;
        string descuento="";
        double costo, total;


        System.out.println("CÁLCULO DE DESCUENTOS A TRATAMIENTOS");
        
        System.out.println("Socio tipo A");
        System.out.println("Socio tipo B");
        System.out.println("Socio tipo C");

        System.out.println("Ingresa el tipo de socio");
        Scanner leer = new Scanner(System.in);
        tipo=leer.next();

        switch (tipo) {
           case "A": 
                    System.out.print("Ingresa el costo del tratamiento: $");
                    costo=leer.nextInt();
                    descuento="50%";
                    total=costo-(costo*0.5);
                    break;

            case "B": 
                    System.out.print("Ingresa la cuota del socio: $");
                    costo=leer.nextInt();
                    descuento="35%";
                    total=costo-(costo*0.35); 
                    break;
           
           case "C": 
                    System.out.print("Ingresa la cuota del socio: $");
                    costo=leer.nextInt();
                    descuento="0%";
                    total=costo;
                    break;

            default: System.out.print("Opción Inválida");      

        }

        System.out.println("Tipo de socio: "+tipo);
        System.out.println("Costo del tratamiento: "+costo);
        System.out.prinln(descuento+"de descuento");
        System.out.print("Importe a pagar: $"+total);

    
    
    }
    
    
}
