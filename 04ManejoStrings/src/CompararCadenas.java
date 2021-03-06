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
        
        if (nombre.isEmpty()) {
            System.out.println("La cadena esta sin valor");
        }
        
        nombre="Pablo Nolasco Castro";
        
        // Empieza con la palabra
        if (nombre.startsWith("Pablo")) {
            System.out.println("El nombre de la persona empieza con Pablo");
        }
        // End
        if (nombre.endsWith("Castro")) {
            System.out.println("El apellido de la persona end con Castro");
        }
        
        // Sacar el tamaño de una cadena
        String miCadena="El tamaño";
        
        int length=miCadena.length();
        System.out.println("Tamaño: "+length);
        
        miCadena="";
        if (miCadena.length() == 0) {
            System.out.println("Esta sin valor la cadena");
        }
        
        // Buscar palabra
        miCadena="Cadena mi";
        String cadenaBuscada="mi";
        
        int indice=miCadena.indexOf(cadenaBuscada);
        
        System.out.println("Posicion de coincidencia: "+indice);
        
        // Obtener caracter
        char caracter=miCadena.charAt(2);
        
        System.out.println("El caracter es: "+caracter); 
        
        // Limpiar cadena
        String cadenaEspacio="          Esta es una cadena con espacio                    ";
        System.out.println(cadenaEspacio.trim());
        
        // Extraer subcadena
        
        String numCta="7987 4512 4781 1234";
        String cuatroCaracteres=numCta.substring(15, 19);
        System.out.println(cuatroCaracteres);
    }
    
}
