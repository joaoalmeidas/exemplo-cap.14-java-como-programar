import java.util.Scanner;

public class StaticChartMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre um caractere e pressione Enter");
		String input = scanner.next();
		char c = input.charAt(0);
		
		System.out.printf("é definido: %b%n", Character.isDefined(c));
		System.out.printf("é digito: %b%n", Character.isDigit(c));
		System.out.printf("é o primerio caractere na identificação Java: %b%n", Character.isJavaIdentifierStart(c));
		System.out.printf("é parte de um identificador Java: %b%n", Character.isJavaIdentifierPart(c));
		System.out.printf("é letra: %b%n", Character.isLetter(c));
		System.out.printf("é letra ou digito: %b%n", Character.isLetterOrDigit(c));
		System.out.printf("é caixa baixa: %b%n", Character.isLowerCase(c));
		System.out.printf("é caixa alte: %b%n", Character.isUpperCase(c));
		System.out.printf("para caixa alte: %s%n", Character.toUpperCase(c));
		System.out.printf("para caixa baixa: %s%n", Character.toLowerCase(c));
		
	}

}
