
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OPTIPLEX 9010
 */
public class Arreglos {

    private final int BIMESTRES = 6;
    private final int CALIFICACION_APROBATORIA;
    private double[] calificaciones = new double[BIMESTRES];

    public static void main(String[] args) {
        Arreglos arreglo = new Arreglos(70);
        arreglo.registrarCalificacion();
        arreglo.imprimirCalificacion();
    }

    public void imprimirCalificacion() {
        for (int i = 0; i < this.calificaciones.length; i++) {
            if (this.calificaciones[i] < this.CALIFICACION_APROBATORIA) {
                System.out.println("Con un " + this.calificaciones[i] + " Repruebas el bimestre");
            } else {
                System.out.println("Con un " + this.calificaciones[i] + " Apruebas el bimestre");

            }
        }
    }

    public Arreglos(int calificacion) {
        this.CALIFICACION_APROBATORIA = calificacion;
    }

    public void registrarCalificacion() {
        Scanner leer = new Scanner(System.in);
        double calificacion;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresa calificacion " + (i + 1) + ":");
            this.calificaciones[i] = leer.nextDouble();
        }
    }
}
