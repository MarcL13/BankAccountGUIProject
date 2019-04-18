import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GenFrame extends JFrame implements ActionListener
{
	public GenFrame()
	{
		//making arraylist
		ArrayList accs = new ArrayList<BankAccount>();
		
		//making card layout
		CardLayout card1 = new CardLayout();
		
		//overall panel and set it's layout (CL)
		JPanel overall = new JPanel();
		overall.setLayout(card1);
		
		//adding frames
		WelcomeFrame welcomePanel = new WelcomeFrame();
		CreateAccount createPanel = new CreateAccount(accs);
		RemoveAccount removePanel = new RemoveAccount(accs);

		
		//add the panels to overall
		overall.add(welcomePanel, "welcome");
		overall.add(createPanel, "create");
		overall.add(removePanel, "remove");
		
		
		//in actionlisteners for your menuitems tell panel what to show
		
		//making the menubar and menus
		JMenuBar menubar = new JMenuBar();
		JMenuItem home = new JMenuItem("Home");
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
		transaction.add(deposit);
		transaction.add(withdraw);
		transaction.add(transfer);
		transaction.add(get);
		acc.add(create);
		acc.add(remove);
		acc.add(find);
		menubar.add(transaction);
		menubar.add(acc);
		menubar.add(home);
				
		//action listeners
		home.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				card1.show(overall, "welcome");;
			}
		});
		
		create.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				card1.show(overall, "create");
			}
		});
		
		remove.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				card1.show(overall, "remove");
			}
		});
		
		//adding to general frame
		add(overall);
		
		//welcome frame shown first
		card1.show(overall, "welcome");
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

}
