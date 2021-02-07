/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03conceptos.poo;

/**
 *
 * @author Windows10
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1= new Persona("pablo", "nolasco", 30, "masculino");
        Persona p2;
        p2=p1;
        System.out.println(""+p1);
        
        //==cuando son string, y el valor es el mismo, las variables apuntan a la misma referencia
        String var1="hola";
        String var2="hola";
        String var3= new String("hola");
        
    }
    
}
