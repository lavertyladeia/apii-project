package apII.menu;

import java.util.Scanner;

import apII.dao.FuncionarioDAO;
import apII.pojo.Funcionario;

public class FuncionarioMenu {

	Principal menuPrincipal;	//Declara um atributo do tipo Principal e com mesmos nome e fun��o de outro atributo na classe Principal
	
	public FuncionarioMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;		//Referencia o atributo menuPrincipal ao atributo declarado nesta classe
	}
	
	public void showMenu(){		//Menu Funcionarios
		System.out.print("Exibir dados dos Funcion�rios (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Funcion�rio (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usu�rio para a op��o desejada 
		switch(entrada.nextInt()) {		//Switch de controle das op��es dispon�veis
		case 1:
			listarDadosFuncionario();		//Chama o m�todo para listagem dos funcionarios
			break;
		case 2:
			cadastrarFuncionario();		//Chama o m�todo para cadastro de funcionario
			break;
		case 3:
			menuPrincipal.start();		//Chama o m�todo que retorna ao menu principal
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosFuncionario(){		//M�todo para listagem de funcionario
		FuncionarioDAO.listar();
		showMenu();
	}
	
	public void cadastrarFuncionario(){		//M�todo para cadastro de departamento
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Funcion�rio: ");	//Recebe do usu�rio o nome do funcionario
		String nome = entrada.nextLine();
		
		System.out.print("CPF: ");	//Recebe do usu�rio o CPF do funcionario
		String cpf = entrada.nextLine();
		
		System.out.print("RG: ");	//Recebe do usu�rio o RG do funcionario
		String rg = entrada.nextLine();
		
		System.out.print("Nascimento: ");	//Recebe do usu�rio a data de nascimento do funcionario
		String nascimento = entrada.nextLine();
		
		System.out.print("Cargo: ");	//Recebe do usu�rio o cargo do funcionario
		String cargo = entrada.nextLine();
		
		Funcionario funcionario = new Funcionario(1, nome, cpf, rg, nascimento, cargo);		//Cria um novo objeto do tipo Departamento passando como par�metro os dados digitados pelo usu�rio
		if (FuncionarioDAO.salvar(funcionario))		//Condicional para salvar o cadastro caso o cadastro seja efetuado ou imprimir mensagem de erro caso haja algum erro no cadastramento
			System.out.println("Funcionario Cadastradc com sucesso!");
		else
			System.out.println("N�o foi poss�vel cadastrar o funcionario solicitado!");
		
		showMenu();		//Mostra o menu de funcionario
	}
	

}
