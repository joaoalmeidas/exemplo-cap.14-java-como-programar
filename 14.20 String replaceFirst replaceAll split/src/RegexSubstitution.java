import java.util.Arrays;

public class RegexSubstitution {

	public static void main(String[] args) {
		
		String primeiraString = "Essa frase termina com 5 estrelas *****";
		String segundaString = "1, 2, 3, 4, 5, 6, 7, 8";
		
		System.out.printf("String original 1: %s%n", primeiraString);
		
		primeiraString = primeiraString.replaceAll("\\*", "^");
		
		System.out.printf("^ substituido por ^: %s%n", primeiraString);
		
		primeiraString = primeiraString.replaceAll("stars", "carets");
		
		System.out.printf("\"carets\" substituido por \"stars\": %s%n", primeiraString);
		
		System.out.printf("toda palavra trocada por \"word\": %s%n%n", primeiraString.replaceAll("\\w+", "word"));
		
		System.out.printf("String original 2: %s%n", segundaString);
		
		for(int i = 0; i < 3; i++) {
			
			segundaString = segundaString.replaceFirst("\\d", "digit");
			
		}
		
		System.out.printf("Primeiros 3 digitos substituidos por \"digit\" : %s%n", segundaString);
		
		System.out.print("String separado em virgulas: ");
		String[] resultados = segundaString.split(",\\s*");
		System.out.println(Arrays.toString(resultados));
		
	}

}
