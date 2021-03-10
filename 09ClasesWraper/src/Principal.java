/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OPTIPLEX 9010
 */
public class Principal {

    public static void main(String[] args) {
        parseValue();
    }

    public static void tostring() {
        // la clase Object la clase principal de java contiene el método toString().
        // La idea de este método es obtener una representación significativa de un objeto dado.
        // Este método nos regresa una cadena con el valor del primitivo envuelto en el objeto.
        Double d = new Double("3.14");

        System.out.println("d = " + d.toString()); //El resuktado es: d = 3.14
    }

    public static void parseValue() {
        // parseXxx() - regresa el primitivo nombrado.
        // Boxing
        double d4 = Double.parseDouble("3.14");
        long numero = Long.parseLong("2");
        System.out.println(d4);
        System.out.println(numero);
    }

    public static void xxxValue() {

        // Boxing
        Integer integer = new Integer(420);
        Integer intboxing = 440;

        // Métodos de instancia para extraer el dato numérico del envoltorio  . xxxValue();
        // Unboxing
        byte b = integer.byteValue();
        short s = integer.shortValue();
        double d = integer.doubleValue();
        int a = intboxing;

        // valueOf() - regresa un nuevo objeto wrapped del tipo del que fue invocado.
        long L2 = Long.parseLong("101010", 2); // El resultado es 42

        Long L3 = Long.valueOf("101010", 2); // // El resultado es 42
        System.out.println("valor b: " + b);
        System.out.println("valor s: " + s);
        System.out.println("valor d: " + d);
    }
}
