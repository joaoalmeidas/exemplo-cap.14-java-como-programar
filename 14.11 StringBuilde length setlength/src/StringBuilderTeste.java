
public class StringBuilderTeste {

	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		
		System.out.printf("buffer = %s%ncapacidade = %d%ntamanho = %d%n%n", buffer, buffer.capacity(), buffer.length());
		
		buffer.ensureCapacity(75);
		
		System.out.printf("nova capacidade: %d%n", buffer.capacity());
		
		buffer.setLength(10);
		
		System.out.printf("novo tamanho = %d%nbuffer = %s%n", buffer.length(), buffer.toString());

	}

}
