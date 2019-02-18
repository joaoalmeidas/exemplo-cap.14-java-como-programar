
public class OutrosMetodosChar {

	public static void main(String[] args) {
		
		Character c1 = 'A';
		Character c2 = 'a';
		
		System.out.printf("c1 = %s%nc2 = %s%n%n", c1.charValue(), c2.charValue());
		
		if(c1.equals(c2)) {
			System.out.println("c1 e c2 são iguais.%n");
		}else {
			System.out.println("c1 e c2 não são iguais.%n");
		}

	}

}
