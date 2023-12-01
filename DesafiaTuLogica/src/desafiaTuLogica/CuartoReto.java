package desafiaTuLogica;

import java.util.Scanner;

public class CuartoReto {

	public static void main(String[] args) {

	/*Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento, 
	  que puede ser ascendente o descendente, a continuación, según el orden indicado se 
	  mostrarán en pantalla dichos números. Ej.: si los números introducidos son 4,7,2 y 
	  se escoge orden ascendente (de menor a mayor) aparecen en pantalla en este orden 
	  2,4,7, si el ordenamiento es descendente (de mayor a menor) se mostrarán en el 
	  siguiente 7, 4, 2. Utiliza estructuras de control adecuadas. */ 
	
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("A CONTINUACIÓN, INTRODUCE 3 NÚMEROS:\n");
		
		System.out.print("NÚMERO 1:");
		num1= sc.nextInt();
		System.out.print("NÚMERO 2:");
		num2= sc.nextInt();
		System.out.print("NÚMERO 3:");
		num3= sc.nextInt();

	
		if (num1>num2 && num2>num3) {
			System.out.println("El orden descendente de los números es: " +num1+" "+num2+" "+num3);

			} else if (num1>num3 && num3<num2){
				System.out.println("El orden descendente de los números es: " + num1+" "+num3+" "+num2);
			
			} else if (num2>num1 && num1>num3){
				System.out.println("El orden descendente de los números es: " +num2+" "+num1+" "+num3);
				
			} else if (num2>num3 && num3>num1){
				System.out.println("El orden descendente de los números es: " +num2+" "+num3+" "+num1);
				
			} else if (num3>num1 && num1>num2){
				System.out.println("El orden descendente de los números es: " +num3+" "+num1+" "+num3);
	
			} else if (num3>num2 && num2>num1){
				System.out.println("El orden descendente de los números es: " +num3+" "+num2+" "+num1);
		
			}
		
			if (num1<num2 && num2<num3) {
				System.out.println("El orden ascendente de los números es: " +num1+" "+num2+" "+num3);

				} else if (num1<num3 && num3<num2){
					System.out.println("El orden ascendente de los números es: " + num1+" "+num3+" "+num2);
				
				} else if (num2<num1 && num1<num3){
					System.out.println("El orden ascendente de los números es: " +num2+" "+num1+" "+num3);
					
				} else if (num2<num3 && num3<num1){
					System.out.println("El orden ascendente de los números es: " +num2+" "+num3+" "+num1);
					
				} else if (num3<num1 && num1<num2){
					System.out.println("El orden ascendente de los números es: " +num3+" "+num1+" "+num3);
		
				} else if (num3<num2 && num2<num1){
					System.out.println("El orden ascendente de los números es: " +num3+" "+num2+" "+num1);
				}	
	
		sc.close();


		}
}
