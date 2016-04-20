package apII.pojo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private int id;	//Declara o atributo id do tipo int
	private String nome;	//Declara o atributo nome do tipo String
	private String cnpj;	//Declara o atributo cnpj do tipo String
	private String endereco;	//Declara o atributo endereco do tipo String
	
	private List<Departamento> departamentos;	//Cria uma lista de objetos do tipo Departamento
	//private List<Empregado> empregados;
	
	public Empresa(){
		
	}
	
	public Empresa(int id,
			String nome,
			String cnpj,
			String endereco){	//Construtor da classe Empresa
		
		setId(id);
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
		
		//setDepartamentos(new ArrayList<Departamento>());
		//setEmpregados(new ArrayList<Empregado>());
		
	}	
	
	public int getId() {	//Gets e sets da classe empresa
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	
	//public List<Empregado> getEmpregados() {
	//	return empregados;
	//}


	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {	//Formatação do texto que aparecerá na tela
		return getId() + "\t\t" + getNome() +  "\t\t" + getCnpj() + "\t\t" + getEndereco();
	}


}
