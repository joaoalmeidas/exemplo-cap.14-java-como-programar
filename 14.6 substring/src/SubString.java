
public class SubString {

	public static void main(String[] args) {
		
		String letras = "abcdefghijklmabcdefghijklm";
		
		System.out.printf("Substring do �ndice 20 at� o fim � \"%s\"%n", letras.substring(20));
		System.out.printf("%s \"%s\"%n", "Substring do �ndice 3, at� o 6, mas n�o incluindo o 6.", letras.substring(3, 6));
		
	}

}
