/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Cadenas {
    
    public void mostrarCadenas(){
        String mensaje1="Saludo desde clase Cadena";
        String mensaje2="";
        String mensaje3=null;
        mensaje1+=" se concatena";
        System.out.println(mensaje1);
        
        // concatenacion
        String nombre="Pablo";
        String paterno="Nolasco";
        String materno="Castro";
        
        double precio=40.80;
        
        System.out.println(nombre+" "+" "+paterno+" "+materno);
        System.out.println("El precio es "+precio);
        
        /*
        \n nueva linea
        \t tabulacion
        \r retorno de carro
        \" dobles comillas
        \\ backslash
        */
        String caracteresEspeciales;
        caracteresEspeciales="Codigo JSP\nPrecio: $50.00";
        caracteresEspeciales="Codigo:\tJSP\r\nPrecio:\t$50.00";
        caracteresEspeciales="presionar \"x\" para salir";
        caracteresEspeciales="c:\\java\\ejercicios";
        System.out.println(caracteresEspeciales);
        
        
    }
    
}
