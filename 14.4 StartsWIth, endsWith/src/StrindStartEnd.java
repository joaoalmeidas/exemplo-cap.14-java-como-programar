
public class StrindStartEnd {

	public static void main(String[] args) {
		
		String[] strings = {"started", "starting", "ending", "ended"};
		
		for(String string : strings) {
			
			if(string.startsWith("st")) {
				
				System.out.printf("\"%s\" inicia com \"st\"%n", string);

			}
			
		}
		
		System.out.println();
		
		for(String string : strings) {
			
			if(string.startsWith("art", 2)) {
				
				System.out.printf("\"%s\" inicia com \"art\" na posicao 2%n", string);
				
			}
			
		}
		
		System.out.println();
		
		for(String string : strings) {
			
			if(string.endsWith("ed")) {
				
				System.out.printf("\"%s\" termina com \"ed\"%n", string);
				
			}
			
		}
		
	}

}
