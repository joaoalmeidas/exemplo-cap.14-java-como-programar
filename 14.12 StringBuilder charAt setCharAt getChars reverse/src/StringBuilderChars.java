
public class StringBuilderChars {

	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("hello there");
		
		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("Caractere em 0: %s%nCaractere em 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));
		
		char[] arrayChar = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), arrayChar, 0);
		
		System.out.printf("Os caracteres são:");
		
		for(char caractere : arrayChar) {
			
			System.out.print(caractere);
			
		}
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		
		System.out.printf("%n%nbuffer = %s", buffer.toString());
		
		buffer.reverse();
		System.out.printf("%n%nbuffer = %s", buffer.toString());

	}

}
