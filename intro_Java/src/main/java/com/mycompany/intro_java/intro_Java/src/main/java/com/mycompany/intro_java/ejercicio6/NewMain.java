/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio6;

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
    double numero, n2, n3, nr;
        System.out.println("Ingresa un número");   
        Scanner leer= new Scanner(System.in);
        numero=leer.nextDouble();
        n2=numero*2;
        n3=numero*3;
        nr=Math.sqrt(numero);
        System.out.println(n2+" "+ n3+" "+ nr);
        
    }
    
}
