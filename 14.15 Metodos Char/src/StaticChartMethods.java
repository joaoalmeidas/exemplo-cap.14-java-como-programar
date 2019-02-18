import java.util.Scanner;

public class StaticChartMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre um caractere e pressione Enter");
		String input = scanner.next();
		char c = input.charAt(0);
		
		System.out.printf("� definido: %b%n", Character.isDefined(c));
		System.out.printf("� digito: %b%n", Character.isDigit(c));
		System.out.printf("� o primerio caractere na identifica��o Java: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("� parte de um identificador Java: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("� letra: %b%n", Character.isLetter(c));
		System.out.printf("� letra ou digito: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("� caixa baixa: %b%n", Character.isLowerCase(c));
		System.out.printf("� caixa alte: %b%n", Character.isUpperCase(c));
		System.out.printf("para caixa alte: %s%n", Character.toUpperCase(c));
		System.out.printf("para caixa baixa: %s%n", Character.toLowerCase(c));
		
	}

}
