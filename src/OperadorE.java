import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Faça um programa que verifique se o usuário digitado é igual a 'administrador' e se a senha digitada é igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	
		//Aqui é preciso criar um if que verifique as duas condições para o login ser bem sucedido
		//para comparar string usa-se .equals. Porém se for digitado senha com letra maiúscula ele irá dar como erro. Para todos os casos usa-se equals.IgnoreCase. Para números inteiros seria para comparar senha == 123, invés de senha.equals("123").
		if(usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Login realizado com sucesso!");
		}else {
			System.out.println("Usuário ou senha incorretos!");
		}
		
		
		leitor.close();

	}

}
