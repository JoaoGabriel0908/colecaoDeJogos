package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogoRepository;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;

public class FrameColecaoJogos extends JFrame {
	
	private FabricanteRepository criador = new FabricanteRepository();
	private JogoRepository colecao = new JogoRepository();
	
	private JPanel contentPane;
	private JTextField textObservacao;
	private JTextField textValor;
	private JTextField textJogo;
	
	private int posicao;

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
		
		JLabel lblCriador = new JLabel("Criador:");
		lblCriador.setBounds(22, 94, 50, 22);
		contentPane.add(lblCriador);
		
		JCheckBox chcZerado = new JCheckBox("Zerado");
		chcZerado.setBounds(22, 160, 162, 28);
		contentPane.add(chcZerado);
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setBounds(22, 256, 97, 22);
		contentPane.add(lblValor);
		
		JLabel lblObservacao = new JLabel("Observa\u00E7\u00F5es");
		lblObservacao.setBounds(250, 256, 84, 22);
		contentPane.add(lblObservacao);
		
		JButton btnSalvar = new JButton("SALVAR JOGO");
		btnSalvar.setBounds(24, 349, 185, 35);
		contentPane.add(btnSalvar);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setBounds(250, 24, 97, 18);
		contentPane.add(lblMeusJogos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 52, 168, 196);
		contentPane.add(scrollPane);
		
		JList listJogos = new JList();
		scrollPane.setViewportView(listJogos);
		DefaultListModel<String> modelJogos = new DefaultListModel<String>();
		listJogos.setModel(modelJogos);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.setBounds(250, 349, 84, 35);
		contentPane.add(btnVoltar);
		
		JButton btnAvancar = new JButton(">");
		btnAvancar.setBounds(337, 349, 81, 35);
		contentPane.add(btnAvancar);
		
		textObservacao = new JTextField();
		textObservacao.setBounds(250, 278, 168, 60);
		contentPane.add(textObservacao);
		textObservacao.setColumns(10);
		
		textValor = new JTextField();
		textValor.setBounds(22, 289, 187, 28);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(22, 198, 58, 14);
		contentPane.add(lblConsole);
		
		
		JComboBox comboConsole = new JComboBox();
		
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();
		for (Console console : Console.values()) {
			comboModelConsole.addElement(console.getDescricao());
		}
		
		comboConsole.setModel(comboModelConsole);
		comboConsole.setBounds(22, 223, 187, 22);
		contentPane.add(comboConsole);
		
		textJogo = new JTextField();
		textJogo.setBounds(22, 55, 187, 28);
		contentPane.add(textJogo);
		textJogo.setColumns(10);
		
		//FABRICANTE
		JComboBox comboFabricante = new JComboBox();
		DefaultComboBoxModel<String> comboModelFabricantes = new DefaultComboBoxModel<String>();

		for(Fabricante fabricante : criador.getFabricantes()) {
			comboModelFabricantes.addElement(fabricante.getNome());
		}
		
		comboFabricante.setBounds(22, 121, 187, 22);
		comboFabricante.setModel(comboModelFabricantes);
		contentPane.add(comboFabricante);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				
				jogo.setTitulo(textJogo.getText());
				jogo.setObservacoes(textObservacao.getText());
				jogo.setValor(textValor.getText());
				jogo.setZerado(chcZerado.isSelected());
				jogo.setConsole(definirConsole(comboConsole.getSelectedIndex()));
				jogo.setFabricante(criador.getFabricantes()[comboFabricante.getSelectedIndex()]);
				
				colecao.salvar(jogo,posicao);
				posicao++;
				modelJogos.addElement(jogo.getTitulo());
			}

		});
		listJogos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				Jogo jogosAdicionados = colecao.listarJogo(listJogos.getSelectedIndex());
				textJogo.setText(jogosAdicionados.getTitulo());
				
				double valor = Double.parseDouble(textValor.getText());
				
				textObservacao.setText(jogosAdicionados.getObservacoes());
				comboConsole.setSelectedIndex(jogosAdicionados.getConsole().ordinal());
				comboFabricante.setSelectedIndex(criador.getIndex(jogosAdicionados.getFabricante()));
				chcZerado.setSelected(jogosAdicionados.getZerado());
				textValor.setText(jogosAdicionados.getValor(valor));
			}
		});
		
		
	}
	private Console definirConsole(int consoleSelecionado) {
		 if (consoleSelecionado == 0) {
			 return Console.PS5;
		 }
		 else if (consoleSelecionado == 1) {
			 return Console.XBOXONE;
		 }
		 else if (consoleSelecionado == 2) {
			 return Console.NITENDOSWITCH;
		 }
		 else if(consoleSelecionado == 3) {
			 return Console.GAMEBOY;
		 }
		 else {
			 return Console.PS4;
		 }
	}
	
}
