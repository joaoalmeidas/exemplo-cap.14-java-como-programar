
public class MetodosIndexStrings {

	public static void main(String[] args) {
		
		String letras = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("'c' está localizado no índice %d%n", letras.indexOf('c'));
		System.out.printf("'a' está localizado no índice %d%n", letras.indexOf('a', 1));
		System.out.printf("'$' está localizado no índice %d%n%n", letras.indexOf('$'));
		
		System.out.printf("Último 'c' está localizado no índice %d%n", letras.lastIndexOf('c'));
		System.out.printf("Último 'a' está localizado no índice %d%n", letras.lastIndexOf('a', 25));
		System.out.printf("Último '$' está localizado no índice %d%n%n", letras.lastIndexOf('$'));
		
		System.out.printf("\"def\" está localizado no índice %d%n", letras.indexOf("def"));
		System.out.printf("\"def\" está localizado no índice %d%n", letras.indexOf("def", 7));
		System.out.printf("\"hello\" está localizado no índice %d%n%n", letras.indexOf("hello"));
		
		System.out.printf("Último \"def\" está localizado no índice %d%n", letras.lastIndexOf("def"));
		System.out.printf("Último \"def\" está localizado no índice %d%n", letras.lastIndexOf("def", 25));
		System.out.printf("Último \"hello\" está localizado no índice %d%n%n", letras.lastIndexOf("hello"));
	}

}
