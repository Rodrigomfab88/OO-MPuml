package controleAtividadesOO;

import java.util.Date;

public class Atividade {
	
	private String descricao;
	private Date data;
	
	public Atividade(String desc, Date dia) {
		descricao = desc;
		data = dia;
	}
	
	public String toString() {
		return descricao + "-> " + data;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
}
