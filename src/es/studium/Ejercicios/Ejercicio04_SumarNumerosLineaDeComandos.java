/**
 * Realizar un peque�o programa que sume dos n�meros enteros dados por la
 * l�nea de comandos. El resultado de la operaci�n ser� devuelto como valor de ejecuci�n
 * del programa.

 */
package es.studium.Ejercicios;

/**
 * @author Alvca
 *
 */
public class Ejercicio04_SumarNumerosLineaDeComandos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mostramos lo almacenado en la posiciones 0 y 1 
				System.out.println(args[0]);
				System.out.println(args[1]);
				// Declaramos las variables
				int a, b, suma;
				// Convertimos lo almacenado en int
				a= Integer.parseInt(args[0]);
				b= Integer.parseInt(args[1]);
				// Sumamos y mostramos resultado
				suma=a+b;
				System.out.println(suma);
	}
}
