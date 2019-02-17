
public class SubString {

	public static void main(String[] args) {
		
		String letras = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("Substring do índice 20 até o fim é \"%s\"%n", letras.substring(20));
		System.out.printf("%s \"%s\"%n", "Substring do índice 3, até o 6, mas não incluindo o 6.", letras.substring(3, 6));
		
	}

}
