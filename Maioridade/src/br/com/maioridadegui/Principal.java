package br.com.maioridadegui;

// Importa a biblioteca gr�fica

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declara��o de vari�veis
		
		String nome;
		String idadeString;
		int idade;
		
		// Input de dados
		
		nome = JOptionPane.showInputDialog("Informe o nome:");
		idadeString = JOptionPane.showInputDialog("Informe a idade:");
		
		// Converter string para int
		
		idade = Integer.parseInt(idadeString);
		
		if (idade >= 18)
			JOptionPane.showConfirmDialog(null, nome + "� maior de idade.");
		
		else
		
		JOptionPane.showMessageDialog(null, nome + "� menor de idade");

	}
	
}

