import java.util.Scanner;

public class CharMethods {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira o numero");
		int radix =  input.nextInt();
		
		System.out.printf("Por favor escolha:%n1 -- %s%n2 -- %s%n", "Converte digito para caractere", "Converter caractere para digito");
		int choice = input.nextInt();
		
		switch(choice) {
		
			case 1:
				System.out.println("Insira um digito:");
				int digit = input.nextInt();
				System.out.printf("Converta o dígito para caractere: %s%n", Character.forDigit(digit, radix));
				break;
			
			case 2:
				System.out.println("Insira um caractere:");
				char caractere = input.next().charAt(0);
				System.out.printf("Conversão de caractere para dígito: %s%n", Character.digit(caractere, radix));
				break;
		}
		
	}

}
