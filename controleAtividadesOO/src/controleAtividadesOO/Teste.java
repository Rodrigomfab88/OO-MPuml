package controleAtividadesOO;

import java.util.*;

public class Teste {
	
	static Lista list1;
	static Lista list2;
	static Atividade ativ1;
	static Atividade ativ2;
	static Gerenciador a;
	static Contribuinte b;
	
	public static void main(String[] args) {
		
		GregorianCalendar d= new GregorianCalendar();
		Date agora = d.getTime();
	
		a = new Gerenciador("Joao\n", 29, "joao123@gmail.com");
		
		list1 = new Lista("Compras", "biscoito, batata, oleo, cafe", +  4);
		
		list2 = new Lista("Atividades Domesticas", "lavar roupa, regar plantas, cuidar dos animais ", +  3);
		
		ativ1 = new Atividade("Levar carro para revisao", agora);
		
		ativ2 = new Atividade("Cortar cabelo", agora);
		
		b = new Contribuinte("Pedro", + 25, + 1, ativ1, list1);
		
		System.out.println(a.toString());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println(b.toString());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Lista 1: " + list1.toString());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Lista 2: " + list2.toString());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Atividade 1: " + ativ1.toString());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Atividade 2: " + ativ2.toString());
	}
	

}
