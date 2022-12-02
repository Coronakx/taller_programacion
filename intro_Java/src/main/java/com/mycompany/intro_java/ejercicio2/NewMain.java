/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio2;

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
        int lim, num1, num2, suma;
System.out.println("Ingresa un límite");
Scanner leer=new Scanner(System.in);
lim=leer.nextInt();

System.out.println("Ingresa el primer número");
Scanner leer=new Scanner(System.in);
num1=leer.nextInt();

System.out.println("Ingresa el segundo número");
Scanner leer=new Scanner(System.in);
num2=leer.nextInt();

suma=num1+num2;

While(lim<suma) {
System.out.println("Ingresa el primer número");
Scanner leer=new Scanner(System.in);
num1=leer.nextInt();

System.out.println("Ingresa el segundo número");
Scanner leer=new Scanner(System.in);
num2=leer.nextInt();

suma=num1+num2;

   }  


//Opción 2

do {
  System.out.println("Ingresa el primer número");
Scanner leer=new Scanner(System.in);
num1=leer.nextInt();

System.out.println("Ingresa el segundo número");
Scanner leer=new Scanner(System.in);
num2=leer.nextInt();

suma=num1+num2;
}
while (lim<suma);


//Opcion 3
int lim, num1, num2, suma;
lim = Integer.parseInt(JOptionpane.showInputDialog("Ingrese el límite"));

do {
num1 = Integer.parseInt(JOptionpane.showInputDialog("Digite el primer número"));
num2 = Integer.parseInt(JOptionpane.showInputDialog("Digite el segundo número"));
suma=num1+num2;
}
while (lim<suma);

}

        
         
        
    }
    
}
