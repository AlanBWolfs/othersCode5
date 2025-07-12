import java.util.Scanner;
//Se agrega import de scanner

// El siguiente código evalúa un número introducido por el usuario. La evaluación consiste en dividir el número entre 10 y si su residuo es 3,7,8 o 9 se indica al usuario que el número ingresado es un número afortunado. Todos los demás residuos se consideran como no afortunados.

public class Codigo5 {
    public static void main(String[] args) {
        //Se agrega clase main

        //Se modifica nombre de scanner por legibilidad
        Scanner scan = new Scanner(System.in);

        //Se corrige el encomillado
        System.out.print("Introduzca un número: ");

        //Se modifica nombre de variable de input por legibilidad
        int numero = scan.nextInt();

        //Se agrupan y modifican nombres de variables por legibilidad
        // Se elimina variable int numero = input; ya que resulta redundante
        // Se eliminan las variables siguientes, ya que eran parte de un bucle infinito
        // int afortunado = 0;
        // int noAfortunado = 0;

        //Se elimina condición while, ya que crea un bucle infinito
            int digito = (numero % 10);
            //Se elimina (int), ya que ya se ha declarado como int
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                System.out.println("El " + numero + " es un número afortunado.");
            } else {
                System.out.println("El " + numero + " no es un número afortunado.");
            }
                //Se elimina línea, ya que no aporta más al resto del código /= 10;
            }
}
