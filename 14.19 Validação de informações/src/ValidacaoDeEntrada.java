
public class ValidacaoDeEntrada {
	
	public static boolean validaPrimeiroNome(String primeiroNome) {
		
		return primeiroNome.matches("[A-Z][a-zA-Z]*");
		
	}
	
	public static boolean validaUltimoNome(String ultimoNome) {
		
		return ultimoNome.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
		
	}
	
	public static boolean validaEndereco(String endereco) {
		
		return endereco.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
		
	}
	
	public static boolean validaCidade(String cidade) {
		
		return cidade.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
		
	}
	
	public static boolean validaEstado(String estado) {
		
		return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
		
	}
	
	public static boolean validaCep(String cep) {
		
		return cep.matches("\\d{5}");
		
	}
	
	public static boolean validaTelefone(String telefone) {
		
		return telefone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
		
	}
	
}
