package apII.menu;

import java.util.Scanner;

import apII.dao.FuncionarioDAO;
import apII.pojo.Funcionario;

public class FuncionarioMenu {

	Principal menuPrincipal;	//Declara um atributo do tipo Principal e com mesmos nome e função de outro atributo na classe Principal
	
	public FuncionarioMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;		//Referencia o atributo menuPrincipal ao atributo declarado nesta classe
	}
	
	public void showMenu(){		//Menu Funcionarios
		System.out.print("Exibir dados dos Funcionários (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Funcionário (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usuário para a opção desejada 
		switch(entrada.nextInt()) {		//Switch de controle das opções disponíveis
		case 1:
			listarDadosFuncionario();		//Chama o método para listagem dos funcionarios
			break;
		case 2:
			cadastrarFuncionario();		//Chama o método para cadastro de funcionario
			break;
		case 3:
			menuPrincipal.start();		//Chama o método que retorna ao menu principal
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosFuncionario(){		//Método para listagem de funcionario
		FuncionarioDAO.listar();
		showMenu();
	}
	
	public void cadastrarFuncionario(){		//Método para cadastro de departamento
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Funcionário: ");	//Recebe do usuário o nome do funcionario
		String nome = entrada.nextLine();
		
		System.out.print("CPF: ");	//Recebe do usuário o CPF do funcionario
		String cpf = entrada.nextLine();
		
		System.out.print("RG: ");	//Recebe do usuário o RG do funcionario
		String rg = entrada.nextLine();
		
		System.out.print("Nascimento: ");	//Recebe do usuário a data de nascimento do funcionario
		String nascimento = entrada.nextLine();
		
		System.out.print("Cargo: ");	//Recebe do usuário o cargo do funcionario
		String cargo = entrada.nextLine();
		
		Funcionario funcionario = new Funcionario(1, nome, cpf, rg, nascimento, cargo);		//Cria um novo objeto do tipo Departamento passando como parâmetro os dados digitados pelo usuário
		if (FuncionarioDAO.salvar(funcionario))		//Condicional para salvar o cadastro caso o cadastro seja efetuado ou imprimir mensagem de erro caso haja algum erro no cadastramento
			System.out.println("Funcionario Cadastradc com sucesso!");
		else
			System.out.println("Não foi possível cadastrar o funcionario solicitado!");
		
		showMenu();		//Mostra o menu de funcionario
	}
	

}
