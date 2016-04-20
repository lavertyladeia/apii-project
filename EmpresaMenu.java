package apII.menu;

import java.util.Scanner;

import apII.menu.Principal;
import apII.pojo.Empresa;
import apII.dao.EmpresaDAO;

public class EmpresaMenu {

	Principal menuPrincipal;	//Declara um atributo do tipo Principal e com mesmos nome e função de outro atributo na classe Principal
	
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
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usuário para a opção desejada
		switch(entrada.nextInt()) {		//Switch de controle das opções disponíveis
		case 1:
			listarDadosEmpresa();		//Chama o método para listagem de empresa
			break;
		case 2:
			cadastrarEmpresa();		//Chama o método para cadastro de empresa
			break;
		case 3:
			menuPrincipal.start();		//Chama o método que retorna ao menu principal
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosEmpresa(){		//Método para listagem de empresa
		EmpresaDAO.listar();
		showMenu();
	}
	
	public void cadastrarEmpresa(){	//Método para cadastro de empresa
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome da Empresa: ");	//Recebe do usuário o nome da empresa
		String nome = entrada.nextLine();
		
		System.out.print("CNPJ: ");		//Recebe do usuário o CNPJ da empresa
		String cnpj = entrada.nextLine();
		
		System.out.print("Endereco: ");		//Recebe do usuário o endereço da empresa
		String endereco = entrada.nextLine();
		
		Empresa empresa = new Empresa(1, nome, cnpj, endereco);		//Cria um novo objeto do tipo Empresa passando como parâmetro os dados digitados pelo usuário
		if (EmpresaDAO.salvar(empresa))		//Condicional para salvar o cadastro caso o cadastro seja efetuado ou imprimir mensagem de erro caso haja algum erro no cadastramento
			System.out.println("Empresa Cadastrada com sucesso!");
		else
			System.out.println("Não foi possível cadastrar a empresa solicitada!");
		
		showMenu();		//Mostra o menu de empresa
	}
	

}
