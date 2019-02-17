
public class ConstrutoresString {

	public static void main(String[] args) {
		
		char[] arrayChar = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
		String s = new String("hello");
		
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(arrayChar);
		String s4 = new String(arrayChar, 6, 3);
		
		System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);
	}

}
