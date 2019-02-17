
public class MiscelaniaString {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "GOODBYE";
		String s3 = "    spaces    ";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);
		
		System.out.printf("Troca 'l' por 'L' em s1 %s%n%n", s1.replace('l', 'L'));
		
		System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
		System.out.printf("s2.toUpperCase() = %s%n%n", s2.toLowerCase());
		
		System.out.printf("s3 depois trim = \"%s\"%n%n", s3.trim());
		
		
		char[] arrayChar = s1.toCharArray();
		System.out.print("s1 como um array de caracteres = ");
		
		for(char caractere : arrayChar) {
			
			System.out.print(caractere);
			
		}
		
		System.out.println();
	}

}
