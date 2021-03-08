/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows10
 */
public class Main {

    public static void main(String[] args) {
        metodoIf();
    }

    public static void metodoIf() {
        int edad = 0;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultado);

        if (edad >= 18) {
            System.out.println("Eresa mayor de edad");
        } else if (edad < 18 && edad >= 0) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Edad no valida");
        }

        // Comparar strings
        String nombre1 = "abc", nombre2 = "abc";
        // compara referencia
        //if (nombre1 == nombre2) {
        if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Compara valor son iguales");
        } else {
            System.out.println("Compara valor no son iguales");
        }
    }

    public static void metodoSwitch() {

    }
}
