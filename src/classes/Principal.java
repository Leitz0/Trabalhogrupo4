package classes;

import java.util.Scanner;

public class Principal {
 public static final String LINHA = "-------------------------------";

	public static void main(String[] args) {
		
		System.out.println(LINHA);
		System.out.println("Seja bem-vindo a Doce ao Cubo!");
		System.out.println(LINHA);
		
		menu();
		
	}
		// TODO Auto-generated method stub

		public static void menu() {
			Scanner scanner = new Scanner(System.in);
			int opcao;
			String m = """
					Informe a opção desejada: 
					1 - Incluir Pedido
					2 - Alterar Pedido
					3 - Imprimir Pedido
					4 - Localizar Pedido
					5 - Excluir Pedido
					6 - Sair
					""";
		System.out.println(m);
		opcao = scanner.nextInt();
		
		switch(opcao) {
		case 1:  System.out.println("1");
			break;
		case 2: System.out.println("2");
			break;
		case 3: System.out.println("3");
			break;
		case 4: System.out.println("4");
			break;
		case 5: System.out.println("5");
			break;
			
		} while(opcao != 6);
		 System.out.println("Até breve!");
			
	}

}
