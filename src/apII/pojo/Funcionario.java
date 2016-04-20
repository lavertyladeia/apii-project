package apII.pojo;

import java.util.Date;

public class Funcionario {

	private int id;	//Declara o atributo id do tipo int
	private String nome; //Declara o atributo nome do tipo String
	private String cpf; //Declara o atributo cpf do tipo String
	private String rg; //Declara o atributo rg do tipo String
	private String nascimento; //Declara o atributo nascimento do tipo String
	private String cargo; //Declara o atributo cargo do tipo String
	
	public Funcionario(int id, String nome, String cpf, String rg, String nascimento,
			String cargo) {	//Construtor da classe Funcionario
		
		setId(id);
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setNascimento(nascimento);
		setCargo(cargo);

	}

	public int getId() {		//Gets e sets da classe Funcionario
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
