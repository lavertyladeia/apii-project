package apII.menu;
import java.util.Scanner;

public class Principal {
	
	EmpresaMenu empresaMenu;	//Cria um objeto do tipo EmpresaMenu
	DepartamentoMenu departamentoMenu;	//Cria um objeto do tipo DepartamentoMenu
	FuncionarioMenu funcionarioMenu;	//Cria um objeto do tipo FuncionarioMenu
	
	public Principal(){
	}
	
	public void setEmpresaMenu(EmpresaMenu empresaMenu){
		this.empresaMenu = empresaMenu;		//Referencia o atributo empresaMenu ao atributo declarado nesta classe
	}
	
	public void setDepartamentoMenu(DepartamentoMenu departamentoMenu){
		this.departamentoMenu = departamentoMenu;		//Referencia o atributo departamentoMenu ao atributo declarado nesta classe
	}
	
	public void setFuncionarioMenu(FuncionarioMenu funcionarioMenu){
		this.funcionarioMenu = funcionarioMenu;		//Referencia o atributo funcionarioMenu ao atributo declarado nesta classe
	}
	

	public void start(){	//M�todo do menu principal
		clear();	//Limpa todo o texto da tela
		
		System.out.print("Dados da Empresa (1)");
		System.out.print("\t");
		System.out.print("Departamentos (2)");
		System.out.print("\t");
		System.out.print("Funcion�rios (3)");
		System.out.print("\t");
		System.out.println("Fechar (99)");
		
		System.out.print("Opcao: ");
		
		Scanner entrada = new Scanner(System.in);	//Entrada do usu�rio para a op��o desejada
		switch(entrada.nextInt()) {		//Switch de controle das op��es dispon�veis
		case 1:
			empresaMenu.showMenu();		//Chama o menu de empresa
			break;

		case 2:
			departamentoMenu.showMenu();		//Chama o menu de departamento
			break;
		
		case 3:
			funcionarioMenu.showMenu();		//Chama o menu de funcionario
			break;
		case 99:
			System.exit(0);		//Finaliza o programa
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
		Principal menuPrincipal = new Principal();	//Cria um objeto do tipo Principal
		
		EmpresaMenu menuEmpresa = new EmpresaMenu(menuPrincipal);	//Cria um objeto do tipo EmpresaMenu passando como par�metro a vari�vel menuPrincipal
		DepartamentoMenu menuDepartamento = new DepartamentoMenu(menuPrincipal);	//Cria um objeto do tipo EmpresaMenu passando como par�metro a vari�vel menuPrincipal
		FuncionarioMenu menuFuncionario = new FuncionarioMenu(menuPrincipal);	//Cria um objeto do tipo EmpresaMenu passando como par�metro a vari�vel menuPrincipal
		
		menuPrincipal.setEmpresaMenu(menuEmpresa);	//Chama o m�todo setEmpresaMenu passando como par�metro o objeto menuEmpresa
		menuPrincipal.setDepartamentoMenu(menuDepartamento);	//Chama o m�todo setDepartamentoMenu passando como par�metro o objeto menuDepartamento
		menuPrincipal.setFuncionarioMenu(menuFuncionario);	//Chama o m�todo setFuncionarioMenu passando como par�metro o objeto menuFuncionario
		
		menuPrincipal.start();	//In�cio do menu principal
		
	}

}
