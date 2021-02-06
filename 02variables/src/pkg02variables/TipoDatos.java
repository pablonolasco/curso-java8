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

    public void floats() {
        int entero=10/7;
        float flotante=10f/7f;
        double doble=10d/7d;
        
        System.out.println("Valor entero:"+entero);
        System.out.println("Valor flotante:"+flotante);
        System.out.println("Valor doble:"+doble);

        System.out.println("Valor byte:"+Byte.MIN_VALUE);
        System.out.println("Valor short:"+Short.MIN_VALUE);
        System.out.println("Valor integer:"+Integer.MIN_VALUE);
        System.out.println("Valor float:"+Float.MIN_VALUE);
        System.out.println("Valor doble:"+Double.MIN_VALUE);
    }
    
    public void conversiones(){
        //==casting
        int valorEntero=10/3;
        float valorFlotante=10f/3f;
        short valorShort=10;
        double valorDouble=10d/3d;
        //==casting explicito
        byte valorByte=(byte)valorDouble;
        //==casting implicito
        valorEntero=valorShort;
        System.out.println("valor:"+valorByte);
    }
    
    public void constantes(){
        final int DIAS_SEMANAS=7;
        final int DIAS_LABORALES=5;
        
        System.out.println("semana:"+DIAS_SEMANAS);
        System.out.println("laborales:"+DIAS_LABORALES);
    }
    
    public void operadores(){
        int i=12;
        int j=10;
        int suma=i+j;
        int resta=i-j;
        int multiplicacion=i*j;
        int div=i/j;//==10 entre 12
        int mod=i%j;//==residuo
        i=2;
        j=2;
        System.out.println("Suma:"+suma);
        System.out.println("Restas:"+resta);
        System.out.println("Multiplicacion:"+multiplicacion);
        System.out.println("Division:"+div);
        System.out.println("sufijo:"+(i++));
        System.out.println("posfijo:"+(++j));
    }
}
