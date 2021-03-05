/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class CompararCadenas {
    public void comparandoStrings(){
        String nombre="Pablo";
        
        if (nombre.equals("Pablo")) {
            System.out.println("Son iguales");
        }
        nombre=" ";
        if (nombre.equals("")) {
            System.out.println("La cadena esta sin valor");
        }
    }
    
}
