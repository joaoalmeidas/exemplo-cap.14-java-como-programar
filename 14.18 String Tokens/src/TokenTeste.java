import java.util.Scanner;

public class TokenTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira uma frase e pressione Enter");
		String frase = input.nextLine();
		
		String[] tokens = frase.split(" ");
		System.out.printf("Número de elementos: %d%nOs tokens são:%n", tokens.length);
		
		for(String token: tokens) {
			
			System.out.println(token);
			
		}
		
	}

}
