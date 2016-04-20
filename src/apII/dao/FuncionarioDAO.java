package apII.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import apII.menu.Principal;
import apII.pojo.Funcionario;

public class FuncionarioDAO {

	public FuncionarioDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean salvar(Funcionario funcionario){
		FileWriter arquivoFuncionario = null;
		PrintWriter registro = null;
		
		try{
			if(funcionario != null){
				arquivoFuncionario = new FileWriter(Principal.class.getResource("/apII/controller/funcionario.txt").getPath());
				registro = new PrintWriter(arquivoFuncionario);
				
				registro.println(funcionario.getId() +";"+ funcionario.getNome() +
						";"+ funcionario.getCpf() + ";" + funcionario.getRg() +
						";"+ funcionario.getNascimento() +";"+ funcionario.getCargo());
				return true;
			
			}else
				return false;
			
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o aquivo funcionario.txt " + e.getStackTrace());
			return false;
		
		}finally{
			if(registro != null)
				registro.close();
		}
		
	}
		
	public static List<Funcionario> getFuncionarios(){
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
				
		FileReader arquivo = null;
		BufferedReader bufferLeitura = null;
		
		try{
			arquivo = new FileReader(Principal.class.getResource("/apII/controller/funcionario.txt").getPath());
			bufferLeitura = new BufferedReader(arquivo);
			
			while(bufferLeitura.ready()){
				int campo = 1;
				
				String id = "", nome = "", cpf = "", rg = "", nascimento = "", cargo = "";
				String linha = "";
				
				linha = bufferLeitura.readLine();
				for (int i = 0; i < linha.length(); i++) {
					if((linha.charAt(i) != ';')){
						switch (campo) {
						case 1:
							id += linha.charAt(i);
							break;
						
						case 2:
							nome += linha.charAt(i);
							break;
							
						case 3:
							cpf += linha.charAt(i);
							break;

						case 4:
							rg += linha.charAt(i);
							break;
							
						case 5:
							nascimento += linha.charAt(i);
							break;
							
						case 6:
							cargo += linha.charAt(i);
							break;
							
						default:
							break;
						}

					}else{
						campo++;						
					}
				}
				
				funcionarios.add(new Funcionario(new Integer(id).intValue(), nome, cpf, rg, nascimento, cargo));
					
			}
			
			return funcionarios;
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o arquivo funcionario.txt " + e.getStackTrace() );
			return null;
		}

	}
	
	public static void listar(){
		
		List<Funcionario> funcionarios = getFuncionarios();
		
		System.out.println("****************************************************************************************");
		System.out.printf("%-5s %-25s %-30s %-30s %-30s %-45s", "ID", "Funcionario", "CPF", "RG", "Nascimento", "Cargo");
		
		for (int i = 0; i < funcionarios.size(); i++){
			Funcionario f = funcionarios.get(i);
			System.out.println("");
			System.out.printf("%-5s %-25s %-30s %-30s %-30s %-45s", f.getId(), f.getNome(), f.getCpf(), f.getRg(), f.getNascimento(), f.getCargo());	
		}
		
		System.out.println("");
		System.out.println("****************************************************************************************");
		
	}

}
