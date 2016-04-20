package apII.controller;

import apII.pojo.Funcionario;

public class Tarefa extends Thread{
	
	private int tempo;
	
	public Tarefa(Funcionario funcionario){
		super(funcionario.getNome());
		tempo = (int)(Math.random() * 5000);
		System.out.println("Tarefa atribuida ao Funcionario " + funcionario.getNome() + " tempo estimado " + tempo + " segundos");
		
	}
	
	public void run(){
		try{
			System.err.println(getName() + " foi estudar");
			Thread.sleep(tempo);
		}
		catch (InterruptedException exception){
			System.err.println(exception.toString());
		}
		System.err.println(getName() + " tarefa finalizada");
	}
	
	
	
}
