package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener {
	JButton Restart, quit;
	
	public Result(String username, int point)
	{
		this.setBounds(400,150,750,550);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/score.png"));
		Image img2 = img.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel image = new JLabel(img3);
		image.setBounds(0, 200, 300, 250);
		this.add(image);
		
		JLabel heading = new JLabel();
		heading.setBounds(45, 30, 750, 80);
		heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));
		heading.setForeground(Color.DARK_GRAY);
		this.add(heading);
		
		if(point == 0)
		{
			heading.setText("Catastrophe, " + username + " ! Aucune bonne réponse ");
		}
		
		else if(point < 50)
		{
			heading.setText("C'est Mauvais, " + username + " ! Vous ferez mieux la prochaine fois. ");
		}
		
		else if(point == 50)
		{
			heading.setText("Pas terrible " + username + "  ! Vous ferez mieux la prochaine fois. ");
		}
		
		else if(point == 60)
		{
			heading.setText("Bien joué " + username + "  ! Mais vous pouvez encore faire mieux.");
			
		}
		
		else if(point == 70 || point == 80)
		{
			heading.setText("Très bien " + username + " ! ");
		}
		
		else if(point == 90)
		{
			heading.setText("Excellent, " + username + " ! Score presque parfait ! ");
		}
		
		else if(point == 100)
		{
			heading.setText("Félicitations, " + username + " ! Score Parfait ! ");
		}
		
		else 
		{
			heading.setText("Ce score n'est pas pris en compte ! ");
		}
		
		
		JLabel score = new JLabel("Vous avez obtenu " + point + " points");
		score.setBounds(350, 200, 300, 30);
		score.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		score.setForeground(Color.DARK_GRAY);
		this.add(score);
		
		
		Restart = new JButton("Rejouer");
		Restart.setBounds(300, 270, 120, 30);
		Restart.setBackground(Color.LIGHT_GRAY);
		Restart.setForeground(Color.white);
		Restart.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		Restart.addActionListener(this);
		this.add(Restart);
		
		quit = new JButton("Quitter");
		quit.setBounds(480, 270, 120, 30);
		quit.setBackground(Color.LIGHT_GRAY);
		quit.setForeground(Color.white);
		quit.setFont(new Font("Baskerville Old Face", Font.PLAIN, 15));
		quit.addActionListener(this);
		this.add(quit);
		
		
		
		
		this.setVisible(true);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Result("RIGOBERT", 10);
		

	}
	*/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == Restart)
		{
			new Login();
			this.setVisible(false);
		}
		
		else if(e.getSource() == quit)
		{
			this.setVisible(false);
		}
		
	}

}
