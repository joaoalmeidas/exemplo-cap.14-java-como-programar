import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o seu primeiro nome:");
		String primeiroNome = input.nextLine();
		System.out.println("Insira o seu segundo nome:");
		String segundoNome = input.nextLine();
		System.out.println("Insira o seu endereço:");
		String endereco = input.nextLine();
		System.out.println("Insira a sua cidade:");
		String cidade = input.nextLine();
		System.out.println("Insira o seu estado:");
		String estado = input.nextLine();
		System.out.println("Insira o seu cep:");
		String cep = input.nextLine();
		System.out.println("Insira o seu telefone:");
		String telefone = input.nextLine();
		
		System.out.println("Valida resultado:");
		
		if(!ValidacaoDeEntrada.validaPrimeiroNome(primeiroNome)) {
			System.out.println("primeiro nome invalido");
		}else if(!ValidacaoDeEntrada.validaUltimoNome(segundoNome)) {
			System.out.println("segundo nome invalido");
		}else if(!ValidacaoDeEntrada.validaEndereco(endereco)) {
			System.out.println("endereco invalido");
		}else if(!ValidacaoDeEntrada.validaCidade(cidade)) {
			System.out.println("cidade invalido");
		}else if(!ValidacaoDeEntrada.validaEstado(estado)) {
			System.out.println("estado invalido");
		}else if(!ValidacaoDeEntrada.validaCep(cep)) {
			System.out.println("cep invalido");
		}else if(!ValidacaoDeEntrada.validaTelefone(telefone)) {
			System.out.println("telefone invalido");
		}else {
			System.out.println("Entrada válida!!!");
		}
	}

}
