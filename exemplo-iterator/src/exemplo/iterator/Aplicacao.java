package exemplo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		Nome nome1 = new Nome();
		Nome nome2 = new Nome();
		Nome nome3 = new Nome();
		List<Nome> nomes = new ArrayList<>();
		
		String n1 = JOptionPane.showInputDialog("Digite o primeiro nome: ");
		nome1.setNome(n1);
		
		String n2 = JOptionPane.showInputDialog("Digite o segundo nome: ");
		nome2.setNome(n2); 
		
		String n3 = JOptionPane.showInputDialog("Digite o terceiro nome: ");
		nome3.setNome(n3);
		
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		
		Iterator<Nome> nomesLista = nomes.iterator();
		
		while (nomesLista.hasNext()) {
			Nome nomePessoa = nomesLista.next();
			System.out.println(nomePessoa);
		}
		
	}
}
