package apII.pojo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private int id;
	private String nome;
	private String cnpj;
	private String endereco;
	
	//private List<Departamento> departamentos;
	//private List<Empregado> empregados;
	
	public Empresa(){
		
	}
	
	public Empresa(int id,
			String nome,
			String cnpj,
			String endereco){
		
		setId(id);
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
		
		//setDepartamentos(new ArrayList<Departamento>());
		//setEmpregados(new ArrayList<Empregado>());
		
	}	
	
	public int getId() {
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
	
	/*public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	public List<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	} */

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return getId() + "\t\t" + getNome() +  "\t\t" + getCnpj() + "\t\t" + getEndereco();
	}


}
