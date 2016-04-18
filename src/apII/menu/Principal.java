package apII.menu;
import java.util.Scanner;

import apII.pojo.Departamento;
import apII.pojo.Funcionario;
import apII.pojo.Empresa;
import apII.dao.EmpresaDAO;
import apII.menu.EmpresaMenu;


public class Principal {
	
	
	public Principal(){
		mainMenu();
	}
	

	public void mainMenu(){
		clear();
		
		System.out.print("Dados da Empresa (1)");
		System.out.print("\t");
		System.out.print("Departamentos (2)");
		System.out.print("\t");
		System.out.print("Empregados (3)");
		System.out.print("\t");
		System.out.println("Fechar (99)");
		
		System.out.print("Opcao: ");
		
		Scanner entrada = new Scanner(System.in);
		switch(entrada.nextInt()) {
		case 1:
			EmpresaMenu empresaMenu = new EmpresaMenu();
			break;

		case 2:
			//submenuDepartamentos();
			break;
		
		case 3:
			//submenuEmpregados();
			break;
		case 99:
			System.exit(0);
		default:
			break;
		} 		
		
	}
	
	
	public void submenuDepartamentos(){
		
	}

	public void submenuEmpregados(){
		
	}	
	
	public void clear(){
		for (int i = 0; i <= 100; i++) {
			System.out.println("");
		}	
	}
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		
	}

}
