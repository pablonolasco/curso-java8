/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02variables;

/**
 *
 * @author OPTIPLEX 9010
 */
public class TipoDatos {

    byte biteMax = 127;
    byte biteMin = -127;
    short enteroCortoMax = 32767;
    short enteroCortoMin = -32767;
    int enteroMax = 2147483647;
    int enteroMin = -2147483647;
    long enteroLargoMax = 922337203685447758L;
    long enteroLargoMin = 922337203685447758L;

    public void boolean_char() {
        char caracter;
        caracter = '@';
        boolean edad = false;
        System.out.println("Es mayor de edad " + edad);
        edad = true;
        System.out.println("Es mayor de edad " + edad);
        System.out.println("caracter " + caracter);
    }

    public void enteros() {
        System.out.println("byte max:"+biteMax+" min:"+biteMin);
        System.out.println("short max:"+enteroCortoMax+" min:"+enteroCortoMin);
        System.out.println("int max:"+enteroMax+" min:"+enteroCortoMin);
        System.out.println("long max:"+enteroLargoMax+" min:"+enteroLargoMin);

    }

    public void mensaje(String mensaje) {

    }
}
