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
        // Documentacion https://docs.oracle.com/javase/8/docs/api/
        numAleatorios();
        
    }
    
    public static void numAleatorios(){
        for (int i = 0; i < 10; i++) {
            int numero = (int) Math.round(Math.random() * 100);
            System.out.println("Numero: " + numero);
        }
      
    }
    
}
