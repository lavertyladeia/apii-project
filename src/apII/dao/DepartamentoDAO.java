package apII.dao;

import apII.pojo.Departamento;
import apII.controller.DepartamentoController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class DepartamentoDAO {

	public DepartamentoDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean salvar(Departamento departamento){
		FileWriter arquivoDepartamento = null;
		PrintWriter registro = null;
		
		try{
			if(departamento != null){
				arquivoDepartamento = new FileWriter(DepartamentoController.class.getResource("/apII/controller/departamento.txt").getPath());
				registro = new PrintWriter(arquivoDepartamento);
				
				registro.println(departamento.getId() +";"+ departamento.getNome());
				return true;
			
			}else
				return false;
			
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o aquivo departamento.txt " + e.getStackTrace());
			return false;
		
		}finally{
			if(registro != null)
				registro.close();
		}
		
	}
		
	public static void listar(){
		
		FileReader arquivo = null;
		BufferedReader bufferLeitura = null;
		
		try{
			arquivo = new FileReader(DepartamentoController.class.getResource("/apII/controller/departamento.txt").getPath());
			bufferLeitura = new BufferedReader(arquivo);
			
			System.out.println("****************************************************************************************");
			System.out.printf("%-10s %-35s", "ID", "Nome");
			
			while(bufferLeitura.ready()){
				int campo = 1;
				
				String id = "", nome = "";
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
							
						default:
							break;
						}

					}else{
						campo++;						
					}
				}
				
				System.out.println("");
				System.out.printf("%-15s %-35s", id, nome);	
			}
			
			System.out.println("");
			System.out.println("****************************************************************************************");
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o arquivo departamento.txt " + e.getStackTrace() );
		}
	}

}
