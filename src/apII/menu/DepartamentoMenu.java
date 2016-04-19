package apII.menu;

import java.util.Scanner;

import apII.menu.Principal;
import apII.pojo.Departamento;
import apII.dao.DepartamentoDAO;

public class DepartamentoMenu {

	Principal menuPrincipal;
	
	public DepartamentoMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;
	}
	
	public void showMenu(){
		System.out.print("Exibir dados do Departamento (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Departamento (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);
		switch(entrada.nextInt()) {
		case 1:
			listarDadosDepartamento();
			break;
		case 2:
			cadastrarDepartamento();
			break;
		case 3:
			menuPrincipal.start();
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosDepartamento(){
		DepartamentoDAO.listar();
		showMenu();
	}
	
	public void cadastrarDepartamento(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Departamento: ");
		String nome = entrada.nextLine();
		
		System.out.print("ID: ");
		int id = Integer.parseInt(entrada.nextLine());
		
		Departamento departamento = new Departamento(id , nome);
		if (DepartamentoDAO.salvar(departamento))
			System.out.println("Departamento cadastrado com sucesso!");
		else
			System.out.println("Não foi possível cadastrar o departamento solicitada!");
		
		showMenu();
	}
	

}
