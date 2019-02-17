
public class StringBuilderAppend {

	public static void main(String[] args) {
		
		Object refObjeto = "hello";
		String string = "goodbye";
		char[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean valorBoolean = true;
		char valorChar = 'Z';
		int valorInt = 7;
		long valorLong = 10000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.333;
		
		StringBuilder lastBuffer = new StringBuilder("last buffer");
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(refObjeto)
			  .append(System.getProperty("line.separator"))
			  .append(string)
			  .append(System.getProperty("line.separator"))
			  .append(arrayChar)
			  .append(System.getProperty("line.separator"))
			  .append(arrayChar, 0, 3)
			  .append(System.getProperty("line.separator"))
			  .append(valorBoolean)
			  .append(System.getProperty("line.separator"))
			  .append(valorChar)
			  .append(System.getProperty("line.separator"))
			  .append(valorInt)
			  .append(System.getProperty("line.separator"))
			  .append(valorLong)
			  .append(System.getProperty("line.separator"))
			  .append(valorFloat)
			  .append(System.getProperty("line.separator"))
			  .append(valorDouble)
			  .append(System.getProperty("line.separator"))
			  .append(lastBuffer);
		
		System.out.printf("buffer contains %n%s%n", buffer.toString());
		
	}

}
