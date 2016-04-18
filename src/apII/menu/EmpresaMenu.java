package apII.menu;

import java.util.Scanner;

import apII.menu.Principal;
import apII.pojo.Empresa;
import apII.dao.EmpresaDAO;

public class EmpresaMenu {

	public EmpresaMenu() {
		menuEmpresa();
	}
	
	public void menuEmpresa(){
		System.out.print("Exibir dados da Empresa (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Empresa (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);
		switch(entrada.nextInt()) {
		case 1:
			listarDadosEmpresa();
			break;
		case 2:
			cadastrarEmpresa();
			break;
		case 3:
			Principal menuPrincipal = new Principal();
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosEmpresa(){
		EmpresaDAO.listar();
		menuEmpresa();
	}
	
	public void cadastrarEmpresa(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome da Empresa: ");
		String nome = entrada.nextLine();
		
		System.out.println("CNPJ: ");
		String cnpj = entrada.nextLine();
		
		System.out.println("Endereco: ");
		String endereco = entrada.nextLine();
		
		Empresa empresa = new Empresa(1, nome, cnpj, endereco);
		if (EmpresaDAO.salvar(empresa))
			System.out.println("Empresa Cadastrada com sucesso!");
		else
			System.out.println("Não foi possível cadastrar a empresa solicitada!");
		
		menuEmpresa();
	}
	

}
