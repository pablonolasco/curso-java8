/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Operadores {
    public static void main(String[] args) {
        int a=7, b=4, c=7;
        if (a == c) {
            System.out.println("a es igual a b");
        }
        if(a>=c)
            System.out.println("a es mayor que c");
        
        if(b<c)
            System.out.println("b es menor a c");
        
        if(a != b)
            System.out.println("a es distinto o diferente c");
        operador();
    }
    
    public static void operador(){
        String nombre="Pablo";
        int edad=18;
        
        // And
        if (nombre.equalsIgnoreCase("pablo") && edad==18) {
            System.out.println("Correcto and");
        }else{
            System.out.println("Incorrecto and");
        }
        
        // Or
        if (nombre.equalsIgnoreCase("pablo") || edad==18) {
            System.out.println("Correcto or");
        }else{
            System.out.println("Incorrecto or");
        }
        
        if(!true){
            System.out.println("Es cierto");
        }else{
            System.out.println("Es falso");
        }
    }
}
