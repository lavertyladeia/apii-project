package apII.menu;

import java.util.Scanner;

import apII.menu.Principal;
import apII.pojo.Departamento;
import apII.dao.DepartamentoDAO;

public class DepartamentoMenu {

	Principal menuPrincipal;	//Declara um atributo do tipo Principal e com mesmos nome e função de outro atributo na classe Principal
	
	public DepartamentoMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;		//Referencia o atributo menuPrincipal ao atributo declarado nesta classe
	}
	
	public void showMenu(){		//Menu Departamento
		System.out.print("Exibir dados do Departamento (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Departamento (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usuário para a opção desejada 
		switch(entrada.nextInt()) {		//Switch de controle das opções disponíveis
		case 1:
			listarDadosDepartamento();		//Chama o método para listagem dos departamentos
			break;
		case 2:
			cadastrarDepartamento();		//Chama o método para cadastro de departamento
			break;
		case 3:
			menuPrincipal.start();		//Chama o método que retorna ao menu principal
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosDepartamento(){		//Método para listagem de departamento
		DepartamentoDAO.listar();
		showMenu();
	}
	
	public void cadastrarDepartamento(){	//Método para cadastro de departamento
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Departamento: ");
		String nome = entrada.nextLine();	//Recebe do usuário o nome do departamento
		
		System.out.print("ID: ");
		int id = Integer.parseInt(entrada.nextLine());		//Recebe do usuário a ID do departamento
		
		Departamento departamento = new Departamento(id , nome);	//Cria um novo objeto do tipo Departamento passando como parâmetro os dados digitados pelo usuário
		if (DepartamentoDAO.salvar(departamento))	//Condicional para salvar o cadastro caso o cadastro seja efetuado ou imprimir mensagem de erro caso haja algum erro no cadastramento
			System.out.println("Departamento cadastrado com sucesso!");
		else
			System.out.println("Não foi possível cadastrar o departamento solicitada!");
		
		showMenu();		//Mostra o menu de departamento
	}
	

}
