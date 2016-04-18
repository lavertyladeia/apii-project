package apII.pojo;

import java.util.Date;

public class Funcionario {

	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private Date nascimento;
	private String cargo;
	
	public Funcionario(int id, String nome, String cpf, String rg, Date nascimento,
			String cargo) {
		
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setNascimento(nascimento);
		setCargo(cargo);

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public String getRg(){
		return rg;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
