package apII.menu;
import java.util.Scanner;

import apII.pojo.Departamento;
import apII.pojo.Funcionario;
import apII.pojo.Empresa;
import apII.dao.EmpresaDAO;
import apII.menu.EmpresaMenu;


public class Principal {
	
	EmpresaMenu empresaMenu;
	DepartamentoMenu departamentoMenu;
	
	public Principal(){
	}
	
	public void setEmpresaMenu(EmpresaMenu empresaMenu){
		this.empresaMenu = empresaMenu;
	}
	
	public void setDepartamentoMenu(DepartamentoMenu departamentoMenu){
		this.departamentoMenu = departamentoMenu;
	}

	public void start(){
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
			empresaMenu.showMenu();
			break;

		case 2:
			departamentoMenu.showMenu();
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
		Principal menuPrincipal = new Principal();
		EmpresaMenu menuEmpresa = new EmpresaMenu(menuPrincipal);
		DepartamentoMenu menuDepartamento = new DepartamentoMenu(menuPrincipal);
		
		menuPrincipal.setEmpresaMenu(menuEmpresa);
		menuPrincipal.setDepartamentoMenu(menuDepartamento);
		
		menuPrincipal.start();
		
	}

}
