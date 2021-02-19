package revisao;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		
		do {
		System.out.println("Digite uma temperatura me Celsius: ");
		Float celsius = sc.nextFloat();
		
			Float fah = ((9*celsius)/5)+32;
			System.out.printf("Equivalente em Fahrenheit: " + fah + "\n");
			
		System.out.printf("Deseja repetir? (s/n) = ");
		resp = sc.next().charAt(0);
		}	while(resp == 's');
		
		
		
		sc.close();
	}
	
	
}
