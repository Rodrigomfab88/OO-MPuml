package controleAtividadesOO;

public class Contribuinte extends Pessoa {
	private Atividade atividadeAtribuida;
	private Lista listaAtribuida;
	private int id;
	
	public Contribuinte(String n, int i, int d, Atividade ativAtrib, Lista listAtrib ) { 
		nome = n;
		idade = i;
		id = d;
		atividadeAtribuida = ativAtrib;
		listaAtribuida = listAtrib;
	}
	
	public String toString() {
		return "Nome do contribuinte: " + nome + "\nid: " + id + "\nAtividade atribuida: " + atividadeAtribuida + "\nLista atribuida: " + listaAtribuida;
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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Atividade getAtividade() {
		return atividadeAtribuida;
	}
	
	public void setAtividade(Atividade atividadeAtribuida) {
		this.atividadeAtribuida = atividadeAtribuida;
	}
	
	public Lista getLista() {
		return listaAtribuida;
	}
	
	public void setLista(Lista listaAtribuida) {
		this.listaAtribuida = listaAtribuida;
	}
	
}
