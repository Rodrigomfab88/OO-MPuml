package controleAtividadesOO;

public class Lista {
	
	private String categoria;
	private String itemLista;
	private int numItens = 0;
	
	
	public Lista(String categ, String item, int num) {
		categoria = categ;
		itemLista = item;
		numItens = num;
	}
	
	public String toString() {
		return categoria + "-> " +  itemLista + " -> " + numItens + " itens";
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getItemLista() {
		return itemLista;
	}
	
	public void setItemLista(String itemLista) {
		this.itemLista = itemLista;
	}
	
	public int getNumItens() {
		return numItens;
	}
	
	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}
	
}
