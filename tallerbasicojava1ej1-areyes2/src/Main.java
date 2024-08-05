import java.util.Scanner;

public class Main {
    //Migrar a java el  ejercicio realizado en clases anteriores para diagrama de flujo y pseudo-codigo
    // --> Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C
    // respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor.
    // Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
    // Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales
    public static void main(String[] args) {
        int valora;
        int valorb;
        int valorc;
        System.out.println("ingrese valor a:");
        Scanner scaneredad = new Scanner(System.in);
        valora = scaneredad.nextInt();
        System.out.println("ingrese valor b:");
        valorb = scaneredad.nextInt();
        System.out.println("ingrese valor c:");
        valorc = scaneredad.nextInt();
        System.out.println("valores ingresados" + " " + valora + " ," + valorb + " y " + valorc);

        if (valora == valorb || valorb == valorc || valora == valorc) {
            System.out.println("algunos de los valores a,b y c son iguales");
        } else {
            if (valora > valorb && valora > valorc) {
                System.out.println("valor a es mayor");
            } else if (valorb > valora && valorb > valorc) {
                System.out.println("valor b es mayor");
            } else {
                System.out.println("valor c es mayor");
            }

            if (valora < valorb && valora < valorc) {
                System.out.println("valor a es menor");
            } else if (valorb < valora && valorb < valorc) {
                System.out.println("valor b es menor");
            } else {
                System.out.println("valor c es menor");
            }
        }
    }
    }
