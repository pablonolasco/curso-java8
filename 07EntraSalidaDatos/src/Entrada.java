
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Entrada {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre;
        int edad;
        double sueldo;
        System.out.println("Ingresa tu nombre:");
        nombre=leer.nextLine();
        System.out.println("Ingresa tu edad:");
        edad=leer.nextInt();
        System.out.println("Ingresa tu sueldo:");
        sueldo=leer.nextDouble();
        
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
        System.out.println("Sueldo:"+sueldo);
        System.out.println("Sueldo con incremento del 5%:"+(sueldo*1.10));
    }
    
}
