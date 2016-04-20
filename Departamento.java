package apII.pojo;

public class Departamento {
	
	private int id;	//Declara o atributo id do tipo int
	private String nome;	//Declara o atributo nome do tipo String
	
	public Departamento(int id, String nome){	//Construtor da classe Departamento
		setId(id);
		setNome(nome);
	}
	
	public int getId() {	//Gets e Sets da classe Departamento
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
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {	//Formatação do texto que aparecerá na tela
		return getId() + "\t\t" + getNome() +  "\t\t" + getNome();
	}

	
	

}
