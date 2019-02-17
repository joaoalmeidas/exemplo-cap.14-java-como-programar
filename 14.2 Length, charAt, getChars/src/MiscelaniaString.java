
public class MiscelaniaString {

	public static void main(String[] args) {
		
		String s1 = "hello there";
		char[] arrayChar = new char[5];
		
		System.out.printf("s1: %s", s1);
		
		System.out.printf("%nTamanho de s1: %d", s1.length());
		
		System.out.printf("%ns1 invertido: ");
		
		for(int cont = s1.length() - 1; cont >= 0; cont--) {
			
			System.out.printf("%c ", s1.charAt(cont));
			
		}
		
		s1.getChars(0, 5, arrayChar, 0);
		System.out.printf("%nArrayChar é: ");
		
		for(char caractere : arrayChar) {
			
			System.out.print(caractere);
			
		}
		
		System.out.println();

	}

}
