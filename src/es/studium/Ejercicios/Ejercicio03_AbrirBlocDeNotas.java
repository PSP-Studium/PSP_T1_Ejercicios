/**
 *  Realizar un programa que ejecute un proceso externo, por ejemplo, el Bloc
 *  de notas. Cuando cerremos este proceso externo, se nos indicará por la consola que
 *  dicho proceso ha finalizado.
 */
package es.studium.Ejercicios;

/**
 * @author Alvca
 *
 */
public class Ejercicio03_AbrirBlocDeNotas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Process process = Runtime.getRuntime().exec("notepad.exe");
			while(process.isAlive()) {} {
				System.out.println("Cerrado el bock de Notas");
			}
		}
		catch (Exception e){
			System.out.println("Error");
		}
	}

}
