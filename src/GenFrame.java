import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class GenFrame extends JFrame
{
	public GenFrame()
	{
		CardLayout card1 = new CardLayout();
		WelcomeFrame welcome = new WelcomeFrame();
		welcome.setLayout(card1);
		JMenuBar menubar = new JMenuBar();
		
		card1.show(welcome, "welcome");
		add(welcome);
		this.setJMenuBar(menubar);
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new GenFrame();
		
	}

}
