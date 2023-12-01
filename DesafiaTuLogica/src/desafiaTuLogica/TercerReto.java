package desafiaTuLogica;

public class TercerReto {

	public static void main(String[] args) {

		//Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. Utiliza las estructuras de control que creas convenientes.
		
		
		int contador2=0, contador3=0;
		
		System.out.println("Números múltiplos de 2 entre 1 y 100:");
		
		//Múltiplos de 2 
		
		for (int i = 1; i<=100; i++) {
			
			if (i % 2 == 0) {
				System.out.print(i+"  ");
				contador2++;
			}
			
		}
		
	    System.out.println("\nTotal de múltiplos de 2 encontrados: " + contador2);	
	    
	    //Múltiplos de 3

		System.out.println("\nNúmeros múltiplos de 3 entre 1-100");
	    			
	    for (int i = 1; i<=100; i++) {
			
			if (i % 3 == 0) {
				System.out.print(i+"  ");
				contador3++;
			}
			
		}
		
	    System.out.println("\nTotal de múltiplos de 3 encontrados: " + contador3);	
	}

}
