package apII.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import apII.controller.Tarefa;
import apII.dao.DepartamentoDAO;
import apII.dao.FuncionarioDAO;
import apII.pojo.Departamento;
import apII.pojo.Funcionario;

public class TarefaMenu {

	Principal menuPrincipal;
	
	public TarefaMenu(Principal menuPrincipal) {
		this.menuPrincipal = menuPrincipal;
	}
	
	public void showMenu(){
		System.out.print("Iniciar Tarefa (1)");
		System.out.print("\t");
		System.out.println("Voltar Menu Anterior (2)");
		
		System.out.print("Opcao:");
		
		Scanner entrada = new Scanner(System.in);
		switch(entrada.nextInt()) {
		case 1:
			executarTarefa();
			break;
		case 2:
			menuPrincipal.start();;
			break;
		default:
			break;
		} 		
		
	}
	
	public void executarTarefa(){
		List<Funcionario> funcionarios = FuncionarioDAO.getFuncionarios(); 
		List<Tarefa> tarefas = new ArrayList<Tarefa>();
		
		for (int i = 0; i < funcionarios.size(); i++) {
			tarefas.add(new Tarefa(funcionarios.get(i)));
		} 
		
		System.err.println("Inicio das tarefas");

		for (int i = 0; i < tarefas.size(); i++) {
			tarefas.get(i).start();
		}
		
		System.out.println("Final das tarefas");		
		showMenu();
	}
	

}
