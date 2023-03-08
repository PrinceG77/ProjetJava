package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz2 extends JFrame implements ActionListener {
	
	String questions[][] = new String[10][5];
	String answers[][] = new String[10][2];
	String Uanswers[][] = new String[10][1];
	ButtonGroup group;
	JRadioButton ch1, ch2, ch3, ch4;
	JLabel q_name, question;
	JButton Bnext,result;
	public static int count = 0;
	public static int timer = 20;
	public static int rep = 0;
	public static int point = 0;
	String username;
	
	public Quiz2(String uname)
	{
		this.username = uname;
		this.setBounds(50,0,1440,850);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/quizbg1_0.jpg"));
		Image img2 = img.getImage().getScaledInstance(1440,392,Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel image = new JLabel(img3);
		image.setBounds(0, 0, 1440, 392);
		this.add(image);
		
		q_name = new JLabel("1.");
		q_name.setBounds(100, 450, 50, 30);
		q_name.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
		this.add(q_name);
		
		question = new JLabel();
		question.setBounds(150, 450, 900, 30);
		question.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
		this.add(question);
		
		questions[0][0] = "(Sport : Football) Quelle nation a remporté la première édition de la coupe du Monde ?";
		questions[0][1] = "Uruguay";
		questions[0][2] = "Brésil";
		questions[0][3] = "France";
		questions[0][4] = "Maroc";
		





		questions[1][0] = "(Histoire) En quelle année a débuté la première guerre mondiale  ?";
		questions[1][1] = "1945";
		questions[1][2] = "1914";
		questions[1][3] = "1939";
		questions[1][4] = "2000";
		


		questions[2][0] = "(Géographie) Dans quelle ville se trouve la Statue de la Liberté ?";
		questions[2][1] = "Washington";
		questions[2][2] = "Chicago";
		questions[2][3] = "New York";
		questions[2][4] = "Paris";




		questions[3][0] = "(Cinéma) Dans la série des X-Men, quel acteur incarne Wolverine ?";
		questions[3][1] = "Leonardo Dicaprio";
		questions[3][2] = "Matt Damon";
		questions[3][3] = "Ben Affleck";
		questions[3][4] = "Hugh Jackman";


		questions[4][0] = "(Arts) Dans quel musée est exposé le tableau 'La Joconde' ?";
		questions[4][1] = "Louvre";
		questions[4][2] = "Le musée d'orsay";
		questions[4][3] = "L'Ermittage";
		questions[4][4] = "Le British Museum";


		questions[5][0] = "(Jeux) D'où est originaire le jeu de Mah-jong ?";
		questions[5][1] = "Inde";
		questions[5][2] = "Chine";
		questions[5][3] = "Japon";
		questions[5][4] = "Corée du Sud";



		questions[6][0] = "(Littérature) À quel auteur doit-on le roman 'Le Comte de Monte-Cristo' ?";
		questions[6][1] = "Charles Dickens";
		questions[6][2] = "Molière";
		questions[6][3] = "Alexandre Dumas";
		questions[6][4] = "Victor Hugo";


		questions[7][0] = "(Mathématiques) Parmi ces figures, laquelle n’est pas un polygone ?";
		questions[7][1] = "Un triangle";
		questions[7][2] = "Un carré";
		questions[7][3] = "Un pentagone";
		questions[7][4] = "Un cercle";



		questions[8][0] = "(Sciences) Qui a découvert le téléphone ?";
		questions[8][1] = "Alexandre Bell";
		questions[8][2] = "Thomas Jefferson";
		questions[8][3] = "Benjamin Franklin";
		questions[8][4] = "Louis Pasteur";



		questions[9][0] = "(Religion) Avec l’avidité et la colère, quel est le « troisième poison » du bouddhisme ?";
		questions[9][1] = "L'athéisme";
		questions[9][2] = "L'ignorance";
		questions[9][3] = "La luxure";
		questions[9][4] = "La paresse";
		
		
		answers[0][1] = "Uruguay";
		answers[1][1] = "1914";
		answers[2][1] = "New York";
		answers[3][1] = "Hugh Jackman";
		answers[4][1] = "Louvre";
		answers[5][1] = "Chine";
		answers[6][1] = "Alexandre Dumas";
		answers[7][1] = "Un cercle";
		answers[8][1] = "Alexandre Bell";
		answers[9][1] = "L'ignorance";
		
		
		 ch1 = new JRadioButton();
		ch1.setBounds(170, 520, 700, 30);
		ch1.setBackground(Color.white);
		ch1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		this.add(ch1);
		
		 ch2 = new JRadioButton();
		ch2.setBounds(170, 560, 700, 30);
		ch2.setBackground(Color.white);
		ch2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		this.add(ch2);
		
		 ch3 = new JRadioButton();
		ch3.setBounds(170, 600, 700, 30);
		ch3.setBackground(Color.white);
		ch3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		this.add(ch3);
		
		 ch4 = new JRadioButton();
		ch4.setBounds(170, 640, 700, 30);
		ch4.setBackground(Color.white);
		ch4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		this.add(ch4);
		
	    group = new ButtonGroup();
		group.add(ch1);
		group.add(ch2);
		group.add(ch3);
		group.add(ch4);
		
		Bnext = new JButton("Suivant");
		Bnext.setBounds(1100, 550, 200, 40);
		Bnext.setBackground(Color.DARK_GRAY);
		Bnext.setForeground(Color.white);
		Bnext.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Bnext.addActionListener(this);
		this.add(Bnext);
		
		result = new JButton("Résultats");
		result.setBounds(1100, 630, 200, 40);
		result.setBackground(Color.LIGHT_GRAY);
		result.setForeground(Color.white);
		result.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		result.setEnabled(false);
		result.addActionListener(this);
		this.add(result);
		
		start(count);
				
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Temps restant : " + timer + " seconde(s)"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (rep == 1) {
            rep = 0;
            timer = 20;
        } else if (timer < 0) {
            timer = 20;
            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            
            if (count == 8) {
            	result.setEnabled(true);
				result.setBackground(Color.DARK_GRAY);
				Bnext.setEnabled(false);
				Bnext.setBackground(Color.LIGHT_GRAY);
            }
            if (count == 9) { // submit button
                if (group.getSelection() == null) {
                	Uanswers[count][0] = "";
                } else {
                	Uanswers[count][0] = group.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < Uanswers.length; i++) {
                    if (Uanswers[i][0].equals(answers[i][1])) {
                        this.point += 10;
                    } else {
                        this.point += 0;
                    }
                }
                int score = this.point;
                this.point = 0;
                setVisible(false);
                this.count= 0;
                new Result(this.username, score);
            } else { // next button
                if (group.getSelection() == null) {
                   Uanswers[count][0] = "";
                } else {
                    Uanswers[count][0] = group.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
	
	 public void start(int count) {
	        q_name.setText("" + (count + 1) + ". ");
	        question.setText(questions[count][0]);
	        ch1.setText(questions[count][1]);
	        ch1.setActionCommand(questions[count][1]);
	        
	        ch2.setText(questions[count][2]);
	        ch2.setActionCommand(questions[count][2]);
	        
	        ch3.setText(questions[count][3]);
	        ch3.setActionCommand(questions[count][3]);
	        
	        ch4.setText(questions[count][4]);
	        ch4.setActionCommand(questions[count][4]);
	        
	        group.clearSelection();
	    }

	/*
	public static void main(String[] args)
	{
		Quiz q1 = new Quiz("user");
	}*/
	@Override
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Bnext) {
            repaint();
            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            
            rep = 1;
            if (group.getSelection() == null) {
               Uanswers[count][0] = "";
            } else {
                Uanswers[count][0] = group.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                Bnext.setEnabled(false);
                result.setEnabled(true);
            }
            
            count++;
            start(count);
        } 
           else if (ae.getSource() == result) {
            rep = 1;
            if (group.getSelection() == null) {
            	Uanswers[count][0] = "";
            } else {
            	Uanswers[count][0] = group.getSelection().getActionCommand();
            }

            for (int i = 0; i < Uanswers.length; i++) {
                if (Uanswers[i][0].equals(answers[i][1])) {
                    point += 10;
                } else {
                    point += 0;
                }
            }
            
            int score = this.point;
            this.point = 0;
            setVisible(false);
            this.count= 0;
            new Result(this.username, score);
        }
    }
		
		
	}


