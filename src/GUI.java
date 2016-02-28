
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;

public class GUI extends JFrame implements ActionListener, displayInterface{

	private ArrayList<Card> cards;
	private JPanel panel;
	private JTextField textField;
	private JTextArea txtPros;
	private JTextArea txtCons;
	private JButton btnSubmitCard;
	private JButton btnStop;
	
	JButton btnChoose1;
	JButton btnChoose2;
	
	private int frameHeight;
	private int frameWidth;

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		cards = new ArrayList<Card>();
		
		frameWidth = 450;
		frameHeight = 300;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, frameWidth, frameHeight);
		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		createCreationScreen();
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnSubmitCard){
			String name = textField.getText();
			String pros = txtPros.getText();
			String cons = txtCons.getText();
			
			Card card = new Card(name, pros, cons, cards.size());
			System.out.println(card);
			cards.add(card);
			System.out.println(cards);
			
			txtPros.setText("");
			txtCons.setText("");
			textField.setText("");
		}else if(e.getSource() == btnStop){
//			if(txtPros.getText().compareTo("") != 0 ||
//					txtCons.getText().compareTo("") != 0 ||
//					txtField.getText().compareTo("") != 0 ||)
//				JOptionPane.
			Collections.shuffle(cards);
			UserSort userSort = new UserSort(cards,this);
			panel.removeAll();
			repaint();
			
			if(cards.size() > 1){
				createCompareScreen(cards.get(0), cards.get(1));
			}else{
				
			}
			repaint();
		}else if(e.getSource() == btnChoose1){
			
		}else if(e.getSource() == btnChoose2){
			
		}
	}
	
	public void createCreationScreen(){

		Font font = new Font("Helvetica", Font.BOLD, 12);
		
		txtPros = new JTextArea();
		txtPros.setLineWrap(true);
		txtPros.setBackground(Color.GREEN);
		txtPros.setBounds(10, 90, 200, 125);
		txtPros.setFont(font);
		panel.add(txtPros);
	
		txtCons = new JTextArea();
		txtCons.setLineWrap(true);
		txtCons.setBackground(Color.RED);
		txtCons.setBounds(220, 90, 200, 125);
		txtCons.setFont(font);
		panel.add(txtCons);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(108, 24, 200, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPros = new JLabel("Pros");
		lblPros.setBounds(92, 65, 46, 14);
		lblPros.setFont(font);
		panel.add(lblPros);
		
		JLabel lblCons = new JLabel("Cons");
		lblCons.setBounds(298, 65, 46, 14);
		lblPros.setFont(font);

		panel.add(lblCons);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(185, -1, 46, 14);
		lblPros.setFont(font);
		panel.add(lblName);
		
		
		btnSubmitCard = new JButton("Submit Card");
		btnSubmitCard.setBounds(172, 226, 89, 23);
		btnSubmitCard.addActionListener(this);
		panel.add(btnSubmitCard);
		
		btnStop = new JButton("STAHP");
		btnStop.setBounds(335, 11, 89, 23);
		btnStop.addActionListener(this);
		panel.add(btnStop);
	}
	
	public void createCompareScreen(Card card1, Card card2){
//		JTextPane pros1 = new JTextPane();
//		pros1.setBounds(10, 10, frameWidth/2 - 20, frameHeight/2 - 20);
//		pros1.setText("Pros");
//		getContentPane().add(pros1);
//		panel.add(pros1);
//		
//		JTextPane cons1 = new JTextPane();
//		cons1.setBounds(10 + frameWidth/2, 10, frameWidth/2 - 20, frameHeight/2 - 20);
//		getContentPane().add(cons1);
//		panel.add(cons1);
//		
//		JTextPane pros2 = new JTextPane();
//		pros2.setBounds(10, 10 + frameHeight/2, frameWidth/2 - 20, frameHeight/2 - 20);
//		getContentPane().add(pros2);
//		panel.add(pros2);
//		
//		JFormattedTextField cons2 = new JFormattedTextField();
//		cons2.setBounds(10 + frameWidth/2, 10 + frameHeight/2, frameWidth/2 - 20, frameHeight/2 - 20);
//		getContentPane().add(cons2);
//		panel.add(pros1);
		
		JLabel lblPros = new JLabel("Pros");
		lblPros.setBounds(10, 11, 194, 88);
		getContentPane().add(lblPros);
		
		JLabel lblCons = new JLabel("Cons");
		lblCons.setBounds(230, 11, 194, 88);
		getContentPane().add(lblCons);
		
		JLabel lblPros_1 = new JLabel("Pros");
		lblPros_1.setBounds(10, 113, 194, 82);
		getContentPane().add(lblPros_1);
		
		JLabel lblCons_1 = new JLabel("Cons");
//		lblCons_1.setBackground(Color.CYAN);
		lblCons_1.setBounds(230, 110, 194, 88);
		getContentPane().add(lblCons_1);
		
		btnChoose1 = new JButton("Choose 1");
		btnChoose1.addActionListener(this);
		btnChoose1.setBounds(63, 206, 89, 23);
		getContentPane().add(btnChoose1);
		
		btnChoose2 = new JButton("Choose 2");
		btnChoose2.addActionListener(this);
		btnChoose2.setBounds(275, 209, 89, 23);
		getContentPane().add(btnChoose2);
	}
	
	public int compare(int index1, int index2){
		
		return 0;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void display(ArrayList<Card> sortedCards) {
		
		JTable table = new JTable();
		table.setBounds(10, 27, 414, 224);
		getContentPane().add(table);
		
		JLabel lblUAHoe = new JLabel("U a Hoe");
		lblUAHoe.setBounds(10, 11, 70, 14);
		getContentPane().add(lblUAHoe);
	}
}
