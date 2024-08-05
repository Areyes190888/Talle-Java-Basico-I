import java.util.Scanner;

public class Main {
    //Desarrolla un programa que de acuerdo a la calificación númerica ingresada, indique en qué categoría se encuentra la nota.
    // El número que se debe ingresar debe ser en el rango de 1 a 10,
    //Tenga en cuanta los siguientes datos de acuerdo al número ingresado:
    //- Si es 1 o 2 imprime "Su calificación es: F"
    //- Si es 3 o 4 imprime "Su calificación es: D"
    //- Si es 5 o 6 imprime "Su calificación es: C"
    //- Si es 7 o 8 imprime "Su calificación es: B"
    //- Si es 9 o 10 imprime "Su calificación es: A"
    //- Si es diferente al rango imprime "Número no válido, por favor verifique


    public static void main(String[] args) {
    int nota;
        System.out.println("ingrese nota");
        Scanner scaneredad = new Scanner(System.in);
        nota = scaneredad.nextInt();

        if (nota<=10){
        switch (nota) {
            case 1,2:
                System.out.println("Su calificación es: F");
                break;
            case 3,4:
                System.out.println("Su calificación es: D");
                break;
            case 5,6:
                System.out.println("Su calificación es: C");
                break;
            case 7,8:
                System.out.println("Su calificación es: B");
                break;
            case 9,10:
                System.out.println("Su calificación es: A");
                break;
        }

        }else {
            System.out.println("Número no válido, por favor verifique");
        }

    }
}