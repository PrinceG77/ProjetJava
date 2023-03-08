package quizapp;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Categories extends JFrame implements ActionListener {
	
	JLabel heading;
	JButton cat1,cat2,cat3,cat4,cat5;
	String name;
	
	public Categories(String username)
	{
		this.setBounds(350, 60, 900, 750);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		this.name = username;
		
		heading = new JLabel("Veuillez choisir une catégorie :");
		heading.setBounds(180, 10, 600, 200);
		heading.setForeground(Color.DARK_GRAY);
		heading.setFont(new Font("Baskerville Old Face",Font.BOLD, 40));
		this.add(heading);
		
		cat1 = new JButton("Sport");
		cat1.setBounds(280, 180, 300, 50);
		cat1.setBackground(Color.LIGHT_GRAY);
		cat1.setForeground(Color.white);
		cat1.setFont(new Font("Baskerville Old Face",Font.PLAIN, 18));
		cat1.addActionListener(this);
		this.add(cat1);
		
		
		cat2 = new JButton("Sciences");
		cat2.setBounds(280, 280, 300, 50);
		cat2.setBackground(Color.LIGHT_GRAY);
		cat2.setForeground(Color.white);
		cat2.setFont(new Font("Baskerville Old Face",Font.PLAIN, 18));
		cat2.addActionListener(this);
		this.add(cat2);
		
		cat3 = new JButton("Littérature");
		cat3.setBounds(280, 380, 300, 50);
		cat3.setBackground(Color.LIGHT_GRAY);
		cat3.setForeground(Color.white);
		cat3.setFont(new Font("Baskerville Old Face",Font.PLAIN, 18));
		cat3.addActionListener(this);
		this.add(cat3);
		
		cat4 = new JButton("Cinéma");
		cat4.setBounds(280, 480, 300, 50);
		cat4.setBackground(Color.LIGHT_GRAY);
		cat4.setForeground(Color.white);
		cat4.setFont(new Font("Baskerville Old Face",Font.PLAIN, 18));
		cat4.addActionListener(this);
		this.add(cat4);
		
		cat5 = new JButton("Histoire");
		cat5.setBounds(280, 580, 300, 50);
		cat5.setBackground(Color.LIGHT_GRAY);
		cat5.setForeground(Color.white);
		cat5.setFont(new Font("Baskerville Old Face",Font.PLAIN, 18));
		cat5.addActionListener(this);
		this.add(cat5);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Categories("Crout1");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == cat1)
		{
			this.setVisible(false);
			new Quiz(this.name);
			
		}
		
		else if(e.getSource() == cat2)
		{
			this.setVisible(false);
			new Quiz(this.name);
		}
		
		else if(e.getSource() == cat3)
		{
			this.setVisible(false);
			new Quiz3(this.name);
		}
		
		else if(e.getSource() == cat4)
		{
			this.setVisible(false);
			new Quiz4(this.name);
		}
		
		else if(e.getSource() == cat5)
		{
			this.setVisible(false);
			new Quiz5(this.name);
		}
		
	}

}
