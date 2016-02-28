
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JFrame implements MouseListener{

	private JFrame frame;
	
//	private ArrayList<Card> cards;
	
	public Display(){
//		cards = new ArrayList<Card>();
		frame = new JFrame("The Manager");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
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
		lblCons_1.setBackground(Color.CYAN);
		lblCons_1.setBounds(230, 110, 194, 88);
		getContentPane().add(lblCons_1);
		
		JButton btnNewButton = new JButton("Choose 1");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(63, 206, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnChoose = new JButton("Choose 2");
		btnChoose.setBounds(275, 209, 89, 23);
		getContentPane().add(btnChoose);
	}
	
	/*
	 * returns -1 if Card at index1 is seen as less than Card at
	 * index2, 0 if equal, and 1 if greater than
	 */
	public int compare(int index1, int index2){
		return 0;
	}
	
	public static void main(String[] args){
		Display display = new Display();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
