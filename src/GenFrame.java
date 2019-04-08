import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GenFrame extends JFrame
{
	public GenFrame()
	{
		//making card layout
		CardLayout card1 = new CardLayout();
		
		
		
		//adding welcome frame
		WelcomeFrame welcome = new WelcomeFrame();
		welcome.setLayout(card1);
		
		//making the menubar and menus
		JMenuBar menubar = new JMenuBar();
		JMenu home = new JMenu("Home");
		JMenu transaction = new JMenu("Transactions");
		JMenu acc = new JMenu("Accounts");
		
		//making the menu items
		JMenuItem deposit = new JMenuItem("Deposit");
		JMenuItem withdraw = new JMenuItem("Withdraw");
		JMenuItem transfer = new JMenuItem("Transfer");
		JMenuItem get = new JMenuItem("Get Balance");
		JMenuItem create = new JMenuItem("Create Account");
		JMenuItem remove = new JMenuItem("Remove Account");
		JMenuItem find = new JMenuItem("Find Account");
		
		//adding everything
		menubar.add(home);
		transaction.add(deposit);
		transaction.add(withdraw);
		transaction.add(transfer);
		transaction.add(get);
		acc.add(create);
		acc.add(remove);
		acc.add(find);
		menubar.add(transaction);
		menubar.add(acc);
		
		
		
		
		
		
		//welcome frame shown first
		card1.show(welcome, "welcome");
		add(welcome);
		
		//general stuff
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
