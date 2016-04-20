package apII.menu;

import java.util.Scanner;

import apII.menu.Principal;
import apII.pojo.Empresa;
import apII.dao.EmpresaDAO;

public class EmpresaMenu {

	Principal menuPrincipal;	//Declara um atributo do tipo Principal e com mesmos nome e fun��o de outro atributo na classe Principal
	
	public EmpresaMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;		//Referencia o atributo menuPrincipal ao atributo declarado nesta classe
	}
	
	public void showMenu(){		//Menu Departamento
		System.out.print("Exibir dados da Empresa (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Empresa (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usu�rio para a op��o desejada
		switch(entrada.nextInt()) {		//Switch de controle das op��es dispon�veis
		case 1:
			listarDadosEmpresa();		//Chama o m�todo para listagem de empresa
			break;
		case 2:
			cadastrarEmpresa();		//Chama o m�todo para cadastro de empresa
			break;
		case 3:
			menuPrincipal.start();		//Chama o m�todo que retorna ao menu principal
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosEmpresa(){		//M�todo para listagem de empresa
		EmpresaDAO.listar();
		showMenu();
	}
	
	public void cadastrarEmpresa(){	//M�todo para cadastro de empresa
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome da Empresa: ");	//Recebe do usu�rio o nome da empresa
		String nome = entrada.nextLine();
		
		System.out.print("CNPJ: ");		//Recebe do usu�rio o CNPJ da empresa
		String cnpj = entrada.nextLine();
		
		System.out.print("Endereco: ");		//Recebe do usu�rio o endere�o da empresa
		String endereco = entrada.nextLine();
		
		Empresa empresa = new Empresa(1, nome, cnpj, endereco);		//Cria um novo objeto do tipo Empresa passando como par�metro os dados digitados pelo usu�rio
		if (EmpresaDAO.salvar(empresa))		//Condicional para salvar o cadastro caso o cadastro seja efetuado ou imprimir mensagem de erro caso haja algum erro no cadastramento
			System.out.println("Empresa Cadastrada com sucesso!");
		else
			System.out.println("N�o foi poss�vel cadastrar a empresa solicitada!");
		
		showMenu();		//Mostra o menu de empresa
	}
	

}
