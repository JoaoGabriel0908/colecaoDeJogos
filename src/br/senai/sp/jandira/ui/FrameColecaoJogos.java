package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;

public class FrameColecaoJogos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public FrameColecaoJogos() {
		setTitle("Biblioteca de Jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Nome do Jogo:");
		lblTitulo.setBounds(22, 22, 84, 22);
		contentPane.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Criador:");
		lblNewLabel.setBounds(22, 100, 50, 22);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Zerado");
		chckbxNewCheckBox.setBounds(22, 142, 162, 28);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setBounds(22, 214, 187, 22);
		contentPane.add(comboConsole);
		
		JLabel lblNewLabel_1 = new JLabel("Valor estimado:");
		lblNewLabel_1.setBounds(22, 256, 97, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Observa\u00E7\u00F5es");
		lblNewLabel_2.setBounds(250, 256, 84, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnSalvar = new JButton("SALVAR JOGO");
		btnSalvar.setBounds(24, 349, 185, 35);
		contentPane.add(btnSalvar);
		
		JLabel lblNewLabel_3 = new JLabel("Meus Jogos:");
		lblNewLabel_3.setBounds(250, 24, 97, 18);
		contentPane.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 52, 168, 196);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBounds(250, 349, 84, 35);
		contentPane.add(btnVoltar);
		
		JButton btnAvancar = new JButton(">");
		btnAvancar.setBounds(337, 349, 81, 35);
		contentPane.add(btnAvancar);
		
		textField = new JTextField();
		textField.setBounds(250, 277, 168, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 289, 187, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Console:");
		lblNewLabel_4.setBounds(22, 189, 58, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 100, 127, 22);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(22, 55, 187, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
