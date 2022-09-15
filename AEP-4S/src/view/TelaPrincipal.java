package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Autoridade;
import model.ChamadoDoUsuario;

public class TelaPrincipal {

	public static void main(String[] args) {
		ArrayList<ChamadoDoUsuario> listaChamados = new ArrayList<ChamadoDoUsuario>();
		int opcao=0;
		ChamadoDoUsuario chamado1 = new ChamadoDoUsuario("1", "Fernanda R.", "23", "187.290.361-12", "Rua XV de Novembro, 187");
		ChamadoDoUsuario chamado2 = new ChamadoDoUsuario("2", "Bárbara S.", "19", "019.802.783-09", "Rua Ermelino de Leão, 15");
		ChamadoDoUsuario chamado3 = new ChamadoDoUsuario("3", "Ana B.", "32", "027.378.914-56", "Rua Ernesto Vilela, 1977");
		
		Autoridade autoridade1 = new Autoridade("Delegacia da Mulher", "(42) 3309-1300", "Rua XV de Novembro, 909");
		Autoridade autoridade2 = new Autoridade("Casa da Mulher", "(42) 3220-1043", "Rua Coronel Theodoro Rosas, 1651");
		Autoridade autoridade3 = new Autoridade("Patrulha Maria da Penha", "(42) 3220-1040", "Rua Balduíno Taques, 445");
		Autoridade autoridade4 = new Autoridade("Casa da Acolhida", "(42) 3235-5934", "Rua Doralício Correia, 316");
		Autoridade autoridade5 = new Autoridade("Juízado de Violência Doméstica e Familiar Contra a Mulher", "(41) 3210-7034", "Av. João Gualberto, 1073" );
		
		listaChamados.add(chamado1);
		listaChamados.add(chamado2);
		listaChamados.add(chamado3);
		
		for(ChamadoDoUsuario cdu : listaChamados) {
			JOptionPane.showMessageDialog(null, "Alerta de Chamado: \n\n" + cdu);
			opcao=Integer.parseInt(JOptionPane.showInputDialog("Onde deseja denunciar? \n\n 1. Delegacia da Mulher | 2. Casa da Mulher | 3. Patrulha Maria da Penha \n"
										+ " 4. Casa da Acolhida | 5. Juízado de Violência Contra a Mulher"));
			if(opcao == 1) {
				JOptionPane.showMessageDialog(null, "Informações sobre a Autoridade escolhida: \n\n" + autoridade1);
			} else if (opcao == 2) {
				JOptionPane.showMessageDialog(null, "Informações sobre a Autoridade escolhida: \n\n" + autoridade2);
			} else if (opcao == 3) {
				JOptionPane.showMessageDialog(null, "Informações sobre a Autoridade escolhida: \n\n" + autoridade3);
			} else if (opcao == 4) {
				JOptionPane.showMessageDialog(null, "Informações sobre a Autoridade escolhida: \n\n" + autoridade4);
			} else if (opcao == 5) {
				JOptionPane.showMessageDialog(null, "Informações sobre a Autoridade escolhida: \n\n" + autoridade5);
			} 
		}
		
		JOptionPane.showMessageDialog(null, "Total de Chamados na lista: " + listaChamados.size());
		
		JOptionPane.showMessageDialog(null, "Removendo o 1° Chamado da lista... \n");
		listaChamados.remove(chamado1);
		
		JOptionPane.showMessageDialog(null, "Possui o 1° Chamado da lista? \n" + listaChamados.contains(chamado1));
		
		JOptionPane.showMessageDialog(null, "Total de Chamados na lista atualmente: " + listaChamados.size());
		
	}

}
