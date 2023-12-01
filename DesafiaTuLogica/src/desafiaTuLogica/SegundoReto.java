package desafiaTuLogica;

import java.util.Scanner;

public class SegundoReto {

	public static void main(String[] args) {

	//Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. A continuación, muestra los primeros 20 números sucesivos a dicho número.
		
		Scanner sc = new Scanner(System.in);

	// Pedir un número hasta que sea positivo
		   
		int numero = 0;
		       
		do {
		    System.out.print("Introduce un número positivo: ");
		    numero = sc.nextInt();
		    
		    if (numero<0) {
				System.out.println("¡Incorrecto, el número introducido no es positivo!");
			}
		    
		} while (numero <= 0);
	

	// Mostrar los primeros 20 números sucesivos
		
		System.out.println("Los primeros 20 números sucesivos a " + numero + " son:");
		        
		for (int i = 1; i <= 20; i++) {
		    System.out.print(numero + i + " ");
		}

		sc.close();	
		
		
	}

}
