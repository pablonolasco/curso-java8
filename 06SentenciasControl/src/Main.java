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
        //metodoIf();
        metodocontinue();
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
        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("Compara valor son iguales");
        } else {
            System.out.println("Compara valor no son iguales");
        }
    }

    public static void metodoSwitch() {
        int dia = 1;
        switch (dia) {
            case 1:
            case 2:
                System.out.println("Dia de la semana");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        String mes = "enero";

        switch (mes) {
            case "enero":
                System.out.println("mes 1 del año");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;

        }

    }

    public static void metodofor() {
        int tablas=4;
       
        for (int i = 1; i <= tablas; i++) {
            System.out.println("Tabla del "+ i);
            for (int j= 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
                if (j % i == 0) {
                   System.out.println("Numero " + j + " par");

                }
            }
            System.out.println("");
           
        }

    }

    public static void metodowhile() {
        int[] calificacion = {9, 8, 8, 10, 9};
        int contador = 0;
        double promedio = 0;
        while (contador < calificacion.length) {
            promedio += calificacion[contador];
            System.out.println(calificacion[contador]);
            contador++;
        }
        System.out.println("promedio " + (promedio / calificacion.length));
    }
    
    public static void metododowhile(){
        int i=0;
        do{
            if (i%2==0) {
            System.out.println(i);
                
            }
            i++;
        }while(i<=100);
    }
    
    public static void metodobreak(){
        String frase="Esta frase ayuda";
        for (int i = 0; i < frase.length(); i++) {
            char caracter=frase.charAt(i);
            System.out.println(caracter);
            if (caracter == 'd') {
                System.out.println("Letra encontrada");
                break;
            }
        }
        
    }
    
    public static void metodocontinue(){
        String frase="Esta es otra frase";
        int letra=0;
            
        for (int i = 0; i < frase.length(); i++) {
            char caracter=frase.charAt(i);
            if (caracter=='a') {
                letra++;
                continue;
            }
            System.out.println(caracter);
        }
        
        System.out.println("La letra a se repite "+letra);
    }
}
