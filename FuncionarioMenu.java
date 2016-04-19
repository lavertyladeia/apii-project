package apII.menu;

import java.util.Scanner;

import apII.dao.FuncionarioDAO;
import apII.pojo.Funcionario;

public class FuncionarioMenu {

	Principal menuPrincipal;
	
	public FuncionarioMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;
	}
	
	public void showMenu(){
		System.out.print("Exibir dados dos Funcionários (1)");
		System.out.print("\t");
		System.out.print("Cadastrar Funcionário (2)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (3)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);
		switch(entrada.nextInt()) {
		case 1:
			listarDadosFuncionario();
			break;
		case 2:
			cadastrarFuncionario();
			break;
		case 3:
			menuPrincipal.start();
			break;
		default:
			break;
		} 		
		
	}
	
	public void listarDadosFuncionario(){
		FuncionarioDAO.listar();
		showMenu();
	}
	
	public void cadastrarFuncionario(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do Funcionário: ");
		String nome = entrada.nextLine();
		
		System.out.print("CPF: ");
		String cpf = entrada.nextLine();
		
		System.out.print("RG: ");
		String rg = entrada.nextLine();
		
		System.out.print("Nascimento: ");
		String nascimento = entrada.nextLine();
		
		System.out.print("Cargo: ");
		String cargo = entrada.nextLine();
		
		Funcionario funcionario = new Funcionario(1, nome, cpf, rg, nascimento, cargo);
		if (FuncionarioDAO.salvar(funcionario))
			System.out.println("Funcionario Cadastradc com sucesso!");
		else
			System.out.println("Não foi possível cadastrar o funcionario solicitado!");
		
		showMenu();
	}
	

}
