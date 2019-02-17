
public class StringValueOf {

	public static void main(String[] args) {
		
		char[] arrayChar = {'a', 'b', 'c', 'd', 'r', 'f'};
		boolean valorBoolean = true;
		char valorChar = 'Z';
		int valorInt = 7;
		long valorLong = 10000000000L;
		float valorFloat = 2.5f;
		double valorDouble = 33.333;
		Object refObject = "hello";
		
		System.out.printf("array char = %s%n", String.valueOf(arrayChar));
		System.out.printf("parte do array char %s%n", String.valueOf(arrayChar, 3, 3));
		System.out.printf("boolean = %s%n", String.valueOf(valorBoolean));
		System.out.printf("char = %s%n", String.valueOf(valorChar));
		System.out.printf("int = %s%n", String.valueOf(valorInt));
		System.out.printf("long = %s%n", String.valueOf(valorLong));
		System.out.printf("float = %s%n", String.valueOf(valorFloat));
		System.out.printf("double = %s%n", String.valueOf(valorDouble));
		System.out.printf("Object = %s%n", String.valueOf(refObject));

	}

}
