package apII.dao;

import apII.pojo.Empresa;
import apII.controller.EmpresaController;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class EmpresaDAO {

	public EmpresaDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean salvar(Empresa empresa){
		FileWriter arquivoEmpresa = null;
		PrintWriter registro = null;
		
		try{
			if(empresa != null){
				arquivoEmpresa = new FileWriter(EmpresaController.class.getResource("/apII/controller/empresa.txt").getPath());
				registro = new PrintWriter(arquivoEmpresa);
				
				registro.println(empresa.getId() +";"+ empresa.getNome() +";"+ empresa.getCnpj() + ";" + empresa.getEndereco());
				return true;
			
			}else
				return false;
			
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o aquivo empresa.txt " + e.getStackTrace());
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
			arquivo = new FileReader(EmpresaController.class.getResource("/apII/controller/empresa.txt").getPath());
			bufferLeitura = new BufferedReader(arquivo);
			
			System.out.println("****************************************************************************************");
			System.out.printf("%-10s %-35s %-30s %-35s", "ID", "Empresa", "CNPJ", "Endereco");
			
			while(bufferLeitura.ready()){
				int campo = 1;
				
				String id = "", nome = "", cnpj = "", endereco = "";
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
							cnpj += linha.charAt(i);
							break;

						case 4:
							endereco += linha.charAt(i);
							break;
							
						default:
							break;
						}

					}else{
						campo++;						
					}
				}
				
				System.out.println("");
				System.out.printf("%-15s %-35s %-30s %-35s", id, nome, cnpj, endereco);	
			}
			
			System.out.println("");
			System.out.println("****************************************************************************************");
			
		}catch(IOException e){
			System.out.println("Erro ao acessar o arquivo empresa.txt " + e.getStackTrace() );
		}
	}

}
