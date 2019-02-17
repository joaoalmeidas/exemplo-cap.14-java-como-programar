
public class MetodosIndexStrings {

	public static void main(String[] args) {
		
		String letras = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("'c' est� localizado no �ndice %d%n", letras.indexOf('c'));
		System.out.printf("'a' est� localizado no �ndice %d%n", letras.indexOf('a', 1));
		System.out.printf("'$' est� localizado no �ndice %d%n%n", letras.indexOf('$'));
		
		System.out.printf("�ltimo 'c' est� localizado no �ndice %d%n", letras.lastIndexOf('c'));
		System.out.printf("�ltimo 'a' est� localizado no �ndice %d%n", letras.lastIndexOf('a', 25));
		System.out.printf("�ltimo '$' est� localizado no �ndice %d%n%n", letras.lastIndexOf('$'));
		
		System.out.printf("\"def\" est� localizado no �ndice %d%n", letras.indexOf("def"));
		System.out.printf("\"def\" est� localizado no �ndice %d%n", letras.indexOf("def", 7));
		System.out.printf("\"hello\" est� localizado no �ndice %d%n%n", letras.indexOf("hello"));
		
		System.out.printf("�ltimo \"def\" est� localizado no �ndice %d%n", letras.lastIndexOf("def"));
		System.out.printf("�ltimo \"def\" est� localizado no �ndice %d%n", letras.lastIndexOf("def", 25));
		System.out.printf("�ltimo \"hello\" est� localizado no �ndice %d%n%n", letras.lastIndexOf("hello"));
	}

}
