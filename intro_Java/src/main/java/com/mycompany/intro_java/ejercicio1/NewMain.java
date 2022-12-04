/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio1;

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
        
        
    System.out.println("Ingresa una nota");
    Scanner leer=new Scanner(System.in);
    nota=leer.nextDouble();

    While((nota<0)||(nota>10)) {
    System.out.println("La nota es INCORRECTA");
    System.out.println("Ingresa una nota");
    nota=leer.nextDouble();
    }
    if (nota>10){
        System.out.println("La nota es CORRECTA");
    }


//Opción 2
int control;
int=0

While(int=0) {
System.out.println("Ingresa una nota");
Scanner leer=new Scanner(System.in);
nota=leer.nextInt();
if ((nota<10)&&(nota>10))
        System.out.println("La nota es INCORRECTA");
    }
    else{
    System.out.println("La nota es CORRECTA");
    int=1;
    }


   }  

}

    }
    
}
