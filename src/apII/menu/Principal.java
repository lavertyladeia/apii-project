package apII.menu;
import java.util.Scanner;

public class Principal {
	
	EmpresaMenu empresaMenu;
	DepartamentoMenu departamentoMenu;
	FuncionarioMenu funcionarioMenu;
	
	public Principal(){
	}
	
	public void setEmpresaMenu(EmpresaMenu empresaMenu){
		this.empresaMenu = empresaMenu;
	}
	
	public void setDepartamentoMenu(DepartamentoMenu departamentoMenu){
		this.departamentoMenu = departamentoMenu;
	}
	
	public void setFuncionarioMenu(FuncionarioMenu funcionarioMenu){
		this.funcionarioMenu = funcionarioMenu;
	}
	

	public void start(){
		clear();
		
		System.out.print("Dados da Empresa (1)");
		System.out.print("\t");
		System.out.print("Departamentos (2)");
		System.out.print("\t");
		System.out.print("Funcionários (3)");
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
			funcionarioMenu.showMenu();
			break;
		case 99:
			System.exit(0);
		default:
			break;
		} 		
		
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
		FuncionarioMenu menuFuncionario = new FuncionarioMenu(menuPrincipal);
		
		menuPrincipal.setEmpresaMenu(menuEmpresa);
		menuPrincipal.setDepartamentoMenu(menuDepartamento);
		menuPrincipal.setFuncionarioMenu(menuFuncionario);
		
		menuPrincipal.start();
		
	}

}
