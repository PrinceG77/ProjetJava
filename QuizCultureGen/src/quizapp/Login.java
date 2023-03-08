package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton start, quit;
	JTextField uname;
	
	public Login()
	{
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/quiz01.jpg"));
		Image img2 = img.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		
		
		JLabel image = new JLabel(img3);
		image.setBounds(0, 0, 600, 500);
		this.add(image);
		
		
		JLabel heading = new JLabel("Super quiz");
		heading.setBounds(750, 60, 300, 45);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
		heading.setForeground(Color.DARK_GRAY);
		this.add(heading);
		
		JLabel name = new JLabel("Entrez votre nom");
		name.setBounds(810, 150, 300, 20);
		name.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		name.setForeground(Color.DARK_GRAY);
		this.add(name);
		
		
		uname = new JTextField();
		uname.setBounds(735, 200, 300, 25);
		uname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		this.add(uname);
		
		
		 start = new JButton("Commencer");
		start.setBounds(735, 270, 120, 25);
		start.setBackground(Color.LIGHT_GRAY);
		start.setForeground(Color.white);
		start.addActionListener(this);
		this.add(start);
		
		quit = new JButton("Quitter");
		quit.setBounds(915, 270, 120, 25);
		quit.setBackground(Color.LIGHT_GRAY);
		quit.setForeground(Color.white);
		quit.addActionListener(this);
		this.add(quit);
		
		this.setSize(1200, 500);
		this.setLocation(180, 150);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Login l = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == start)
		{
			this.setVisible(false);
			new Categories(this.uname.getText());
			
			
		}
		else if(e.getSource() == quit)
		{
			this.setVisible(false);
		}
		
	}

}
