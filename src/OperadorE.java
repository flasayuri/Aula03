import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Fa�a um programa que verifique se o usu�rio digitado � igual a 'administrador' e se a senha digitada � igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	
		//Aqui � preciso criar um if que verifique as duas condi��es para o login ser bem sucedido
		//para comparar string usa-se .equals. Por�m se for digitado senha com letra mai�scula ele ir� dar como erro. Para todos os casos usa-se equals.IgnoreCase. Para n�meros inteiros seria para comparar senha == 123, inv�s de senha.equals("123").
		if(usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Login realizado com sucesso!");
		}else {
			System.out.println("Usu�rio ou senha incorretos!");
		}
		
		
		leitor.close();

	}

}
