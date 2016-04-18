package apII.pojo;

public class Departamento {
	
	private int id;
	private String nome;
	
	public Departamento(int id, String nome){
		setId(id);
		setNome(nome);
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
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return getId() + "\t\t" + getNome() +  "\t\t" + getNome();
	}

	
	

}
