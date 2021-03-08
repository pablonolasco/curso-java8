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
        int edad=0;
        
        String resultado=(edad>=18)?"Mayor de edad":"Menor de edad";
        System.out.println(resultado);
        
        if (edad >=18 ) {
            System.out.println("Eresa mayor de edad");
        }else if(edad<18 && edad>=0){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Edad no valida");
        }
        
        
        
    }
}
