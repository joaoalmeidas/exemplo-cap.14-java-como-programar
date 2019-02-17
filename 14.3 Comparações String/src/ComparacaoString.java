import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class ComparacaoString {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = "goodbye";
		String s3 = "Happy Birthday";
		String s4 = "happy birthday";
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
		
		if(s1.equals("hello")) {
			
			System.out.println("s1 � igual a \"hello\"");
			
		}else {
			
			System.out.println("s1 n�o � igual a \"hello\"");
			
		}
		
		if(s1 == "hello") {
			
			System.out.println("s1 � o mesmo objeto que \"hello\"");
			
		}else {
			
			System.out.println("s1 n�o � o mesmo objeto que \"hello\"");
			
		}
		
		if(s3.equalsIgnoreCase(s4)) {
			
			System.out.printf("%s � igual %s com case-sensitive ignorado.%n", s3, s4);
			
		}else {
			
			System.out.println("s3 n�o � igual a s4");
			
		}
		
		
		System.out.printf("%ns1.comparteTo(s2) is %d", s1.compareTo(s2));
		System.out.printf("%ns2.comparteTo(s1) is %d", s2.compareTo(s1));
		System.out.printf("%ns1.comparteTo(s1) is %d", s1.compareTo(s1));
		System.out.printf("%ns3.comparteTo(s4) is %d", s3.compareTo(s4));
		System.out.printf("%ns4.comparteTo(s3) is %d%n", s4.compareTo(s3));
		
		
		if(s3.regionMatches(0, s4, 0, 5)) {
			
			System.out.println("Os primeiros 5 caracteres de s3 e s4 s�o iguais.");
			
		}else {
			
			System.out.println("Os primeiros 5 caracteres de s3 e s4 n�o s�o iguais.");
			
		}
		
		if(s3.regionMatches(true, 0, s4, 0, 5)) {
			
			System.out.println("Os primeiros 5 caracteres de s3 e s4 s�o iguais ignorando case-sensitive.");
			
		}else {
			
			System.out.println("Os primeiros 5 caracteres de s3 e s4 n�o s�o iguais.");
			
		}
	}

}
