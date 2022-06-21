package br.com.maioridadegui;

// Importa a biblioteca gráfica

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaração de variáveis
		
		String nome;
		String idadeString;
		int idade;
		
		// Input de dados
		
		nome = JOptionPane.showInputDialog("Informe o nome:");
		idadeString = JOptionPane.showInputDialog("Informe a idade:");
		
		// Converter string para int
		
		idade = Integer.parseInt(idadeString);
		
		if (idade >= 18)
			JOptionPane.showConfirmDialog(null, nome + "é maior de idade.");
		
		else
		
		JOptionPane.showMessageDialog(null, nome + "é menor de idade");

	}
	
}

