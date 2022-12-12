package controleAtividadesOO;

public class Gerenciador extends Pessoa {
	
	private String email;
	
	public Gerenciador(String n, int i, String e) {
		nome = n;
		idade = i;
		email = e;
	}
	
	public String toString() {
		return "Nome do gerenciador: " + nome + "email: " + email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
