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
        metodopotencia();
        
    }
    
    public static void numAleatorios(){
        for (int i = 0; i < 10; i++) {
            int numero = (int) Math.round(Math.random() * 100);
            System.out.println("Numero: " + numero);
        }
      
    }
    
    public static void numMayor(){
        int [] num= new int[10];
        double promedio=0;
        for (int i = 0; i < 10; i++) {
            num[i]=(int)Math.round(Math.random()*100);
        }
        
        
        for(int numero : num){
            promedio+=numero;
            System.out.println(numero);
        }
        System.out.println("promedio: "+(promedio/num.length));
        System.out.println("mayor "+Math.max(10, 9));
        System.out.println("menor "+Math.min(10, 9));
    }
    
    public static void metodoredondeo(){
        double numero=8.4;
        
        System.out.println("valor "+numero);
        System.out.println("redondeo hacia arriba "+Math.ceil(numero));
        System.out.println("redondeo hacia abajo "+Math.floor(numero));
    }
    
    public static void metodopotencia(){
        System.out.println("El numero "+4+" elevado a la "+10+" es "+Math.pow(4, 10));
    }
    
}
